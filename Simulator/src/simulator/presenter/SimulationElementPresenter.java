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
package simulator.presenter;

import simulator.srl.SimulationElement;

public final class SimulationElementPresenter {

	private SimulationElementPresenter() {}
	
	public static String present(SimulationElement element) {
		return element.getClass().getSimpleName().charAt(0) + " type=" + element.getType() + ", params=" + element.getParams();
	}
	
}
