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

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import simulator.execution.model.state.State;
import simulator.scl.Action;

public class RunnableActionGroup {
	
	private final List<RunnableAction> actions;
	
	public RunnableActionGroup(Collection<Action> actions) {
		this(makeRunnable(actions));
	}
	
	public RunnableActionGroup(RunnableAction... actions) {
		this.actions = Arrays.asList(actions);
	}

	public void run(State state) {
		runAll(identifyAllActionsWhoseGuardIsSatisified(state), state);
	}

	private List<RunnableAction> identifyAllActionsWhoseGuardIsSatisified(State state) {
		final List<RunnableAction> actionsToRun = new LinkedList<RunnableAction>();
		
		for (RunnableAction action : actions) {
			if (action.isSatisified(state)) {
				actionsToRun.add(action);
			}
		}
		
		return actionsToRun;
	}

	private void runAll(List<RunnableAction> actions, State state) {
		for (RunnableAction actionToRun : actions) {
			actionToRun.run(state);
		}
	}
	
	
	private static RunnableAction[] makeRunnable(Collection<Action> actions) {
		final List<RunnableAction> runnableActions = new LinkedList<RunnableAction>();
		
		for (Action action : actions) {
			runnableActions.add(new RunnableAction(action));
		}
		
		return runnableActions.toArray(new RunnableAction[]{});
	}
}
