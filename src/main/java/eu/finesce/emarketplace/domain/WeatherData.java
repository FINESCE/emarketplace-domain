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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


// TODO: Auto-generated Javadoc
/**
 * The Class WeatherData.
 */
@XmlRootElement(name="weatherData")
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherData {

	/** The weather id. */
	@XmlElement(required=true)
	private String weatherID;
	
	/** The current time. */
	@XmlElement(required=true)
	private long currentTime;
		
	/** The start date time. */
	@XmlElement(required=true)
	private long startDateTime;
	
	/** The end date time. */
	@XmlElement(required=true)
	private long endDateTime;
	
	/** The weatherdata list. */
	@XmlElement(name="WeatherDataList", type=WeatherDataList.class)
    List<WeatherDataList> weatherdataList;
	

	/**
	 * Gets the weather id.
	 *
	 * @return the weatherID
	 */
	public String getWeatherID() {
		return weatherID;
	}

	/**
	 * Sets the weather id.
	 *
	 * @param weatherID the weatherID to set
	 */
	public void setWeatherID(String weatherID) {
		this.weatherID = weatherID;
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
	 * Gets the start date time.
	 *
	 * @return the startDateTime
	 */
	public long getStartDateTime() {
		return startDateTime;
	}

	/**
	 * Sets the start date time.
	 *
	 * @param startDateTime the startDateTime to set
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
	 * Gets the weatherdata list.
	 *
	 * @return the weatherdataList
	 */
	public List<WeatherDataList> getWeatherdataList() {
		return weatherdataList;
	}

	/**
	 * Sets the weatherdata list.
	 *
	 * @param weatherdataList the weatherdataList to set
	 */
	public void setWeatherdataList(List<WeatherDataList> weatherdataList) {
		this.weatherdataList = weatherdataList;
	}
	    
}
