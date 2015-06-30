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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Sector.
 */
@XmlRootElement(name = "sector")
@XmlAccessorType(XmlAccessType.FIELD)
public class Sector {

	/** The current time. */
	@XmlElement(required = true)
	private long currentTime;
    
	/** The sector list. */
	@XmlElement(name="SectorList", type=SectorList.class)
    List<SectorList> sectorList;

	/**
	 * Gets the current time.
	 *
	 * @return the currentTime
	 */
	public long getCurrentTime() {
		return currentTime;
	}

	/**
	 * Sets the current time.
	 *
	 * @param currentTime the currentTime to set
	 */
	public void setCurrentTime(long currentTime) {
		this.currentTime = currentTime;
	}

	/**
	 * Gets the sector list.
	 *
	 * @return the sectorList
	 */
	public List<SectorList> getSectorList() {
		return sectorList;
	}

	/**
	 * Sets the sector list.
	 *
	 * @param sectorList the sectorList to set
	 */
	public void setSectorList(List<SectorList> sectorList) {
		this.sectorList = sectorList;
	}

}
