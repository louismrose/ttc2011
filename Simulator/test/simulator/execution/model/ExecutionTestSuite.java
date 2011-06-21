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
package simulator.execution.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import simulator.execution.model.state.StateTests;

@RunWith(Suite.class)
@SuiteClasses({EvaluatableExpressionTests.class, RunnableActionTests.class,
               StateTests.class, ModesTests.class, SimulationTests.class})
public class ExecutionTestSuite {

}
