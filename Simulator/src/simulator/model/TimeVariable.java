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
package simulator.model;

import java.util.Calendar;
import java.util.Date;

import simulator.config.Variable;
import simulator.execution.model.TimeFormatter;


public class TimeVariable extends Displayable {

	public enum UnitOfTime {
		HOUR(Calendar.HOUR),
		MINUTE(Calendar.MINUTE);

		public static UnitOfTime createFrom(simulator.config.UnitOfTime unitOfTime) {
			switch (unitOfTime) {
				case HOUR: return UnitOfTime.HOUR;
				case MINUTE: return UnitOfTime.MINUTE;

				default: throw new IllegalArgumentException("Unrecognised UnitOfTime: " + unitOfTime);
			}
		}
		
		private final int calendarUnit;
		
		private UnitOfTime(int calendarUnit) {
			this.calendarUnit = calendarUnit;
		}

		public int toCalendarUnit() {
			return calendarUnit;
		}

	}

	private final String name;
	private Date value = new Date();
	
	public TimeVariable(Variable variable) {
		this.name = variable.getName();
	}
	
	public String getName() {
		return name;
	}

	public void incrementBy(UnitOfTime unitOfTime) {
		value = simulator.model.util.DateUtils.add(value, unitOfTime.toCalendarUnit(), 1);
	}

	@Override
	public String getText() {
		return TimeFormatter.twelveHourFormatter.format(value);
	}
}
