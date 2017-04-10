/*******************************************************************************
 * Copyright 2017 Kansaneläkelaitos
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package fi.kela.kanta.cda.validation;

import fi.kela.kanta.to.LaakemaaraysTO;

public abstract class LaakemaaraysValidoija extends Validoija {
	protected LaakemaaraysTO alkuperainenLaakemaarays;
	public LaakemaaraysValidoija(LaakemaaraysTO alkuperainenLaakemaarays) {
		setAlkuperainenLaakemaarays(alkuperainenLaakemaarays);
	}
	
	public LaakemaaraysTO getAlkuperainenLaakemaarays() {
		return alkuperainenLaakemaarays;
	}

	public void setAlkuperainenLaakemaarays(LaakemaaraysTO alkuperainenLaakemaarays) {
		this.alkuperainenLaakemaarays = alkuperainenLaakemaarays;
	}

	

}
