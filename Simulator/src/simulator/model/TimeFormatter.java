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

import java.text.SimpleDateFormat;
import java.util.Date;

public enum TimeFormatter {
	
	twelveHourFormatter("KK:mm"),
	twentyFourHourFormatter("HH:mm");
	
	private final String formatPattern;
	
	private TimeFormatter(String formatPattern) {
		this.formatPattern = formatPattern;
	}
	
	public String format(Date time) {
		return new SimpleDateFormat(formatPattern).format(time);
	}

	public TimeFormatter next() {
		final int nextIndex = (ordinal() + 1) % values().length;
		return values()[nextIndex];
	}
}