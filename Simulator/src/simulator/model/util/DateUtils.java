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
package simulator.model.util;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {

	public static Date add(Date augend, int unit, int amount) {
		final Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(augend);
		calendar.add(unit, amount);
		return calendar.getTime();
	}
}
