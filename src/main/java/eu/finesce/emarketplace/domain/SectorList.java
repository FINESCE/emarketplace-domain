/*
 * (C) Copyright 2014 FINESCE-WP4.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package eu.finesce.emarketplace.domain;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * The Class SectorList.
 */
@XmlRootElement(name = "sectorList")
@XmlAccessorType(XmlAccessType.FIELD)
public class SectorList {
	
	/** The sector. */
	@XmlElement(required = true)
	private String sector;

	/**
	 * Gets the sector.
	 *
	 * @return the sector
	 */
	public String getSector() {
		return sector;
	}

	/**
	 * Sets the sector.
	 *
	 * @param sector the sector to set
	 */
	public void setSector(String sector) {
		this.sector = sector;
	}

	
}
