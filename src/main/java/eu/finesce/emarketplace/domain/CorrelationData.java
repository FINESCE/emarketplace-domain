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
 * The Class CorrelationData.
 */
@XmlRootElement(name="corrData")
@XmlAccessorType(XmlAccessType.FIELD)

public class CorrelationData {

	/** The correlation data id. */
	@XmlElement(required=true)
	private String correlationDataID;
	
	/** The current time. */
	@XmlElement(required=true)
	private long   currentTime;
	
	/** The correlation list. */
	@XmlElement(name="CloudProductionList", type=CorrelationDataList.class)
    List<CorrelationDataList> correlationList;
	
	
	/**
	 * Gets the current time.
	 *
	 * @return the currentTime
	 */
	public long getCurrentTime() {
		return currentTime;
	}

	/**
	 * Gets the correlation data id.
	 *
	 * @return the correlationDataID
	 */
	public String getcorrelationDataID() {
		return correlationDataID;
	}

	/**
	 * Sets the correlation data id.
	 *
	 * @param correlationDataID the correlationDataID to set
	 */
	public void setcorrelationDataID(String correlationDataID) {
		this.correlationDataID = correlationDataID;
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
	 * Gets the loaddata list.
	 *
	 * @return the correlationList
	 */
	public List<CorrelationDataList> getLoaddataList() {
		return correlationList;
	}

	/**
	 * Sets the loaddata list.
	 *
	 * @param correlationList the correlationList to set
	 */
	public void setLoaddataList(List<CorrelationDataList> correlationList) {
		this.correlationList = correlationList;
	}

}
