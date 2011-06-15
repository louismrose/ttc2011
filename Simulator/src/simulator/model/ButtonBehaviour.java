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

import java.io.Serializable;

public abstract class ButtonBehaviour implements Serializable {

	// Generated by Eclipse
	private static final long serialVersionUID = -2162774538004742609L;	
	
	private final String name;
	protected Watch watch;
	
	public ButtonBehaviour(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWatch(Watch watch) {
		this.watch = watch;
	}
	
	public abstract void run();

}