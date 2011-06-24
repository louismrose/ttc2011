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
package simulator.test.util;

import java.util.Arrays;

import simulator.config.Action;
import simulator.config.Button;
import simulator.config.ChangeDisplay;
import simulator.config.ChangeIndicator;
import simulator.config.ConfigFactory;
import simulator.config.Configuration;
import simulator.config.DisplayMatchesCondition;
import simulator.config.Displayable;
import simulator.config.Expression;
import simulator.config.IncrementTimeVariable;
import simulator.config.Mode;
import simulator.config.NextMode;
import simulator.config.StringConstant;
import simulator.config.TimeConstant;
import simulator.config.UnitOfTime;
import simulator.config.Variable;

public class ConfigurationFactory {

	public static Configuration createConfiguration(Variable... variables) {
		final Configuration configuration = ConfigFactory.eINSTANCE.createConfiguration();
		configuration.getModes().add(createMode("default"));
		configuration.getVariables().addAll(Arrays.asList(variables));
		return configuration;
	}
	
	public static Mode createMode(String name, Button... buttons) {
		final Mode mode = ConfigFactory.eINSTANCE.createMode();
		mode.setName(name);
		mode.getButtons().addAll(Arrays.asList(buttons));
		return mode;
	}
	
	public static Button createButton(String name, Action... behaviour) {
		final Button button = ConfigFactory.eINSTANCE.createButton();
		button.setName(name);
		button.getBehaviour().addAll(Arrays.asList(behaviour));
		return button;
	}
	
	public static NextMode createNextModeAction() {
		return ConfigFactory.eINSTANCE.createNextMode();
	}
	
	public static ChangeDisplay createChangeDisplayAction(Displayable newValue) {
		final ChangeDisplay changeDisplayAction = ConfigFactory.eINSTANCE.createChangeDisplay();
		changeDisplayAction.setNewValue(newValue);
		return changeDisplayAction;
	}
	
	public static ChangeIndicator createChangeIndicatorAction(Displayable newValue) {
		final ChangeIndicator changeIndicatorAction = ConfigFactory.eINSTANCE.createChangeIndicator();
		changeIndicatorAction.setNewValue(newValue);
		return changeIndicatorAction;
	}
	
	public static Expression createIncrementTimeVariableExpression(Variable variable, UnitOfTime increment) {
		final IncrementTimeVariable expression = ConfigFactory.eINSTANCE.createIncrementTimeVariable();
		expression.setUnit(increment);
		expression.setVariable(variable);
		return expression;
	}

	public static StringConstant createStringConstant(String value) {
		final StringConstant constant = ConfigFactory.eINSTANCE.createStringConstant();
		constant.setValue(value);
		return constant;
	}
	
	public static TimeConstant createTimeConstant(String time) {
		final int hours   = Integer.parseInt(time.split(":")[0]);
		final int minutes = Integer.parseInt(time.split(":")[1]);
		
		return createTimeConstant(hours, minutes);
	}
	
	public static TimeConstant createTimeConstant(int hours, int minutes) {
		final TimeConstant constant = ConfigFactory.eINSTANCE.createTimeConstant();
		constant.setHours(hours);
		constant.setMinutes(minutes);
		return constant;
	}
	
	public static Variable createVariable(String variableName) {
		final Variable variable = ConfigFactory.eINSTANCE.createVariable();
		variable.setName(variableName);
		return variable;
	}

	public static DisplayMatchesCondition createDisplayMatchesCondition(Displayable displayable) {
		final DisplayMatchesCondition guard = ConfigFactory.eINSTANCE.createDisplayMatchesCondition();
		guard.setValueToMatch(displayable);
		return guard;
	}
}
