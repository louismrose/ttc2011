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
package simulator.scl.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.eclipse.emf.ecore.resource.Resource;

import simulator.scl.ConfigPackage;
import simulator.scl.Configuration;
import simulator.util.EmfUtil;

public class UploadedConfigurationFactory implements ConfigurationFactory {
	
	private final HttpServletRequest request;
	
	public UploadedConfigurationFactory(HttpServletRequest request) {
		this.request = request;
	}
	
	public Configuration createConfiguration() throws IOException {
		try {
			final FileItemFactory factory = new DiskFileItemFactory();
			final ServletFileUpload upload = new ServletFileUpload(factory);
			
			final InputStream stream = upload.getItemIterator(request).next().openStream(); 
				
			final Resource resource = EmfUtil.createResource(ConfigPackage.eINSTANCE);			
			resource.load(stream, Collections.emptyMap());
		
			return (Configuration)resource.getContents().get(0);
		
		} catch (FileUploadException e) {
			throw new IOException("Error encountered whilst uploading file", e);
		}
	}	
}