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
 * The Class IssueResolutionPlanData.
 */
@XmlRootElement(name = "irpData")
@XmlAccessorType(XmlAccessType.FIELD)
public class IssueResolutionPlanData {

	/** The Entity type. */
	@XmlElement(required = true)
	private String EntityType;

	/** The current time. */
	@XmlElement(required = true)
	private long currentTime;
    
	/** The loaddata list. */
	@XmlElement(name="IssueResolutionPlanDataList", type=IssueResolutionPlanDataList.class)
    List<IssueResolutionPlanDataList> loaddataList;

	/**
	 * Gets the entity type.
	 *
	 * @return the entityType
	 */
	public String getEntityType() {
		return EntityType;
	}

	/**
	 * Sets the entity type.
	 *
	 * @param entityType the entityType to set
	 */
	public void setEntityType(String entityType) {
		EntityType = entityType;
	}

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
	 * Gets the loaddata list.
	 *
	 * @return the loaddataList
	 */
	public List<IssueResolutionPlanDataList> getLoaddataList() {
		return loaddataList;
	}

	/**
	 * Sets the loaddata list.
	 *
	 * @param loaddataList the loaddataList to set
	 */
	public void setLoaddataList(List<IssueResolutionPlanDataList> loaddataList) {
		this.loaddataList = loaddataList;
	}






	
	
}
