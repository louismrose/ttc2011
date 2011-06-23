/*******************************************************************************
 * Copyright (c) 2011 The University of York.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Louis Rose - initial API and implementation
 ******************************************************************************/
package simulator.execution.model.actions;

import simulator.config.AndCondition;
import simulator.config.Condition;
import simulator.config.DisplayMatchesCondition;
import simulator.config.Displayable;
import simulator.config.IndicatorMatchesCondition;
import simulator.config.NotCondition;
import simulator.config.OrCondition;
import simulator.config.VariableEqualsCondition;
import simulator.execution.model.state.State;

public abstract class EvaluatableCondition {

	public static EvaluatableCondition createFrom(Condition condition) {
		return condition == null ? new TautologicalCondition() : new ConfigurableCondition(condition);
	}
	
	public abstract boolean isSatisfied(State state);
	
	private static class ConfigurableCondition extends EvaluatableCondition {
	
		private final Condition condition;
		
		private ConfigurableCondition(Condition condition) {
			this.condition = condition;
		}
	
		public boolean isSatisfied(State state) {
			if (condition instanceof DisplayMatchesCondition) {
				return isSatisfied((DisplayMatchesCondition)condition, state);
				
			} else if (condition instanceof IndicatorMatchesCondition) {
				return isSatisfied((IndicatorMatchesCondition)condition, state);
			
			} else if (condition instanceof VariableEqualsCondition) {
				return isSatisfied((VariableEqualsCondition)condition, state);
			
			} else if (condition instanceof NotCondition) {
				return isSatisfied((NotCondition)condition, state);
				
			} else if (condition instanceof OrCondition) {
				return isSatisfied((OrCondition)condition, state);
				
			} else if (condition instanceof AndCondition) {
				return isSatisfied((AndCondition)condition, state);
				
			} else {
				throw new IllegalStateException("Unknown type of Condition: " + condition);
			}
		}
	
		private boolean isSatisfied(DisplayMatchesCondition condition, State state) {
			return equalOrBothNull(state.getDisplayText(), extractValue(condition.getValueToMatch(), state));
		}
	
		private boolean isSatisfied(IndicatorMatchesCondition condition, State state) {
			return equalOrBothNull(state.getIndicatorText(), extractValue(condition.getValueToMatch(), state));
		}
		
		private boolean isSatisfied(VariableEqualsCondition condition, State state) {
			return equalOrBothNull(extractValue(condition.getVariable(), state), extractValue(condition.getValue(), state));
		}
		
		private boolean isSatisfied(NotCondition condition, State state) {
			return !new ConfigurableCondition(condition.getSubcondition()).isSatisfied(state);
		}
		
		private boolean isSatisfied(OrCondition condition, State state) {
			for (Condition subcondition : condition.getSubconditions()) {
				if (new ConfigurableCondition(subcondition).isSatisfied(state)) {
					return true;
				}
			}
			
			return false;
		}
		
		private boolean isSatisfied(AndCondition condition, State state) {
			for (Condition subcondition : condition.getSubconditions()) {
				if (!new ConfigurableCondition(subcondition).isSatisfied(state)) {
					return false;
				}
			}
			
			return true;
		}
		
		private String extractValue(Displayable newValue, State state) {
			return new ReadableDisplayable(newValue).extractValue(state);
		}
		
		private static boolean equalOrBothNull(String first, String second) {
			return first == null ? second == null : first.equals(second);
		}
	
	}
	
	
	private static class TautologicalCondition extends EvaluatableCondition {
		
		private TautologicalCondition() {}
		
		@Override
		public boolean isSatisfied(State state) {
			return true;
		}
	}
}
