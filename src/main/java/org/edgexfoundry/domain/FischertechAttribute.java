/*******************************************************************************
 * Copyright 2016-2017 Dell Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @microservice:  device-fischertechnik
 * @author: Tyler Cox, Dell
 * @version: 1.0.0
 *******************************************************************************/
package org.edgexfoundry.domain;

import org.edgexfoundry.support.logging.client.EdgeXLogger;
import org.edgexfoundry.support.logging.client.EdgeXLoggerFactory;

import com.google.gson.Gson;

public class FischertechAttribute {
	
	private final static EdgeXLogger logger = EdgeXLoggerFactory.getEdgeXLogger(FischertechAttribute.class);
	
	// Replace these attributes with the Fischertech
	// specific metadata needed by the Fischertech Driver
	
	private String interfaceName;
	
	public FischertechAttribute(Object attributes) {
		try {
			Gson gson = new Gson();
			String jsonString = gson.toJson(attributes);
			FischertechAttribute thisObject = gson.fromJson(jsonString, this.getClass());
			
			this.setInterfaceName(thisObject.getInterfaceName());
			
		} catch (Exception e) {
			logger.error("Cannot Construct FischertechAttribute: " + e.getMessage());
		}
	}
	
	
	public String getInterfaceName()
	{
		return interfaceName;
	}
	
	
	public void setInterfaceName(String interfaceName)
	{
		this.interfaceName = interfaceName;
	}
	

}
