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

import java.util.Calendar;
import java.util.Date;

import simulator.config.UnitOfTime;
import simulator.model.util.DateUtils;

public class Time {

	private final Date value;

	public static Time hoursAgo(int numberOfHours) {
		return new Time().add(Calendar.HOUR, -numberOfHours);
	}
	
	public Time() {
		this.value = new Date();
	}
	
	private Time(Date value) {
		this.value = value;
	}
	
	public String formatWith(TimeFormatter formatter) {
		return formatter.format(value);
	}

	public Time increment(UnitOfTime unit) {
		final int calendarUnit = unit == UnitOfTime.HOUR ? Calendar.HOUR : Calendar.MINUTE;
		final int step = 1;
		return add(calendarUnit, step);
	}

	private Time add(final int calendarUnit, final int step) {
		return new Time(DateUtils.add(value, calendarUnit, step));
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Time))
			return false;
		
		final Time other = (Time)o;
		
		return this.value.equals(other.value);
	}
	
	@Override
	public int hashCode() {
		return value.hashCode();
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
}
