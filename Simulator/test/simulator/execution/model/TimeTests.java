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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static simulator.test.util.ConfigurationFactory.createTimeConstant;

import org.junit.Test;

public class TimeTests {

	@Test
	public void timeCreatedFromConstantIsToday() throws Exception {
		final Time time = new Time(createTimeConstant("13:37"));
		
		assertTrue(time.sameDateAs(Time.now()));	
	}
	
	@Test
	public void timeCreatedFromConstantHasCorrectHoursAndMinutes() throws Exception {
		final Time time = new Time(createTimeConstant("13:37"));
		
		assertEquals("13:37", time.formatWith(TimeFormatter.twentyFourHourFormatter));	
	}
}
