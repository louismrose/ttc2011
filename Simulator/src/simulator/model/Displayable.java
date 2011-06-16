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

public abstract class Displayable {

	public static Displayable resolve(simulator.config.Displayable displayable, Watch watch) {
		if (displayable instanceof simulator.config.Constant) {
			return watch.getConstant(((simulator.config.Constant) displayable).getValue());
		
		} else if (displayable instanceof simulator.config.Variable) {
			//return watch.getTimeVariable(((simulator.config.Variable) displayable).getName());
			return null;
		}
		
		throw new IllegalArgumentException("Unrecognised type of displayable: " + displayable);
	}

	public abstract String getText();

}
