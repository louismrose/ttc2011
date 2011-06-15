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
package simulator.model.factory;

import java.io.IOException;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.eclipse.emf.ecore.resource.Resource;

import simulator.config.ConfigPackage;
import simulator.config.Configuration;
import simulator.model.Watch;
import simulator.util.EmfUtil;

public class UploadedWatchFactory extends WatchFactory {
	
	private final HttpServletRequest request;
	
	public UploadedWatchFactory(HttpServletRequest request) {
		this.request = request;
	}
	
	public Watch createWatch() throws IOException {
		try {
			final FileItemFactory factory = new DiskFileItemFactory();
			final ServletFileUpload upload = new ServletFileUpload(factory);
			
			final FileItem uploadedFile = (FileItem)upload.parseRequest(request).get(0);
				
			final Resource resource = EmfUtil.createResource(ConfigPackage.eINSTANCE);
			
			resource.load(uploadedFile.getInputStream(), Collections.emptyMap());
		
			return configurationToWatch((Configuration)resource.getContents().get(0)); 
	
		} catch (FileUploadException e) {
			throw new IOException("Error encountered whilst uploading file", e);
		}
	}	
}