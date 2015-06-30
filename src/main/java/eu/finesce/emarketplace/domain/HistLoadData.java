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
 * The Class HistLoadData.
 */
@XmlRootElement(name = "histLoadData")
@XmlAccessorType(XmlAccessType.FIELD)
public class HistLoadData {

//	Smart Meters Type = all; single meter; commercial; industrial
	/** The sm type. */
@XmlElement(required = true)
	private String smType;

// 	Horizon Data Load = 24H / 12H / 6H / 3H / 1H
	/** The horizon load. */
@XmlElement(required = true)
	private String horizonLoad;

	/** The start date time. */
	@XmlElement(required = true)
	private long startDateTime;
	
	/** The end date time. */
	@XmlElement(required = true)
	private long endDateTime;
	
	/** The current time. */
	@XmlElement(required = true)
	private long currentTime;
    
	/** The loaddata list. */
	@XmlElement(name="LoadDataList", type=HistLoadDataList.class)
    List<HistLoadDataList> loaddataList;

	/**
	 * Gets the sm type.
	 *
	 * @return the smType
	 */
	public String getSmType() {
		return smType;
	}

	/**
	 * Sets the sm type.
	 *
	 * @param smType the smType to set
	 */
	public void setSmType(String smType) {
		this.smType = smType;
	}

	/**
	 * Gets the horizon load.
	 *
	 * @return the horizonLoad
	 */
	public String getHorizonLoad() {
		return horizonLoad;
	}

	/**
	 * Sets the horizon load.
	 *
	 * @param horizonLoad the horizonLoad to set
	 */
	public void setHorizonLoad(String horizonLoad) {
		this.horizonLoad = horizonLoad;
	}

	/**
	 * Gets the start date time.
	 *
	 * @return the starDateTime
	 */
	public long getStartDateTime() {
		return startDateTime;
	}

	/**
	 * Sets the start date time.
	 *
	 * @param startDateTime the new start date time
	 */
	public void setStartDateTime(long startDateTime) {
		this.startDateTime = startDateTime;
	}

	/**
	 * Gets the end date time.
	 *
	 * @return the endDateTime
	 */
	public long getEndDateTime() {
		return endDateTime;
	}

	/**
	 * Sets the end date time.
	 *
	 * @param endDateTime the endDateTime to set
	 */
	public void setEndDateTime(long endDateTime) {
		this.endDateTime = endDateTime;
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
	public List<HistLoadDataList> getLoaddataList() {
		return loaddataList;
	}

	/**
	 * Sets the loaddata list.
	 *
	 * @param loaddataList the loaddataList to set
	 */
	public void setLoaddataList(List<HistLoadDataList> loaddataList) {
		this.loaddataList = loaddataList;
	}





	
	
}
