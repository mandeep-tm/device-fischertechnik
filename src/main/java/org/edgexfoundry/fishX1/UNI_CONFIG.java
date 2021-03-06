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
package org.edgexfoundry.fishX1;

import java.util.Arrays;
import java.util.List;

public class UNI_CONFIG {
	public Integer mode = 0;
	public Integer digital = 0;
	public List<Integer> reserved = Arrays.asList(new Integer[0]);
	
	public UNI_CONFIG(int mode, int digital) {
		this.mode = mode;
		this.digital = digital;
		for(int i = 0; i < reserved.size(); i++)
			reserved.set(i, 0);
	}
	
	@Override
	public String toString() {
		String out = String.format("%02X", mode);
		out += String.format("%02X", digital);
		for(int i = 0; i < reserved.size(); i++)
			out += String.format("%02X", reserved.get(i));
		return out;
	}
}