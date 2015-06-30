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
 * The Class HistSocialEventList.
 */
@XmlRootElement(name="histSocialEventList")
@XmlAccessorType(XmlAccessType.FIELD)
public class HistSocialEventList {
	

	/** The social id. */
	@XmlElement(required=true)
	private String socialID;
	
	/** The social event location coord lat. */
	@XmlElement(required=true)
	private String socialEventLocationCoordLat;
	
	/** The social event location coord long. */
	@XmlElement(required=true)
	private String socialEventLocationCoordLong;
	
	/** The social event venue address. */
	@XmlElement(required=true)
	private String socialEventVenueAddress;
	
	/** The social event venue name. */
	@XmlElement(required=true)
	private String socialEventVenueName;

	/** The social event importancy. */
	@XmlElement(required=true)
	private Integer socialEventImportancy;
	
	/** The social event date time. */
	@XmlElement(required=true)
	private String socialEventDateTime;
	
	/** The social event typology. */
	@XmlElement(required=true) 
	private String socialEventTypology; 
	
	/** The current time. */
	@XmlElement(required=true)
	private long currentTime;
	
	/**
	 * Instantiates a new hist social event list.
	 */
	public	HistSocialEventList(){};

	/**
	 * Gets the social id.
	 *
	 * @return the socialID
	 */
	public String getSocialID() {
		return socialID;
	}

	/**
	 * Sets the social id.
	 *
	 * @param socialID the socialID to  set
	 */
	public void setSocialID(String socialID) {
		this.socialID = socialID;
	}

	/**
	 * Gets the social event location coord lat.
	 *
	 * @return the socialEventLocationCoordLat
	 */
	public String getSocialEventLocationCoordLat() {
		return socialEventLocationCoordLat;
	}

	/**
	 * Sets the social event location coord lat.
	 *
	 * @param socialEventLocationCoordLat the socialEventLocationCoordLat to set
	 */
	public void setSocialEventLocationCoordLat(String socialEventLocationCoordLat) {
		this.socialEventLocationCoordLat = socialEventLocationCoordLat;
	}

	/**
	 * Gets the social event location coord long.
	 *
	 * @return the socialEventLocationCoordLong
	 */
	public String getSocialEventLocationCoordLong() {
		return socialEventLocationCoordLong;
	}

	/**
	 * Sets the social event location coord long.
	 *
	 * @param socialEventLocationCoordLong the socialEventLocationCoordLong to set
	 */
	public void setSocialEventLocationCoordLong(String socialEventLocationCoordLong) {
		this.socialEventLocationCoordLong = socialEventLocationCoordLong;
	}

	/**
	 * Gets the social event venue address.
	 *
	 * @return the socialEventVenueAddress
	 */
	public String getSocialEventVenueAddress() {
		return socialEventVenueAddress;
	}

	/**
	 * Sets the social event venue address.
	 *
	 * @param socialEventVenueAddress the socialEventVenueAddress to set
	 */
	public void setSocialEventVenueAddress(String socialEventVenueAddress) {
		this.socialEventVenueAddress = socialEventVenueAddress;
	}

	/**
	 * Gets the social event venue name.
	 *
	 * @return the socialEventVenueName
	 */
	public String getSocialEventVenueName() {
		return socialEventVenueName;
	}

	/**
	 * Sets the social event venue name.
	 *
	 * @param socialEventVenueName the socialEventVenueName to set
	 */
	public void setSocialEventVenueName(String socialEventVenueName) {
		this.socialEventVenueName = socialEventVenueName;
	}

	/**
	 * Gets the social event importancy.
	 *
	 * @return the socialEventImportancy
	 */
	public Integer getSocialEventImportancy() {
		return socialEventImportancy;
	}

	/**
	 * Sets the social event importancy.
	 *
	 * @param socialEventImportancy the socialEventImportancy to set
	 */
	public void setSocialEventImportancy(Integer socialEventImportancy) {
		this.socialEventImportancy = socialEventImportancy;
	}

	/**
	 * 	
	 * 
	 * 	/**.
	 *
	 * @return the socialEventTypology
	 */
	public String getSocialEventTypology() {
		return socialEventTypology;
	}

	/**
	 * Gets the social event date time.
	 *
	 * @return the socialEventDateTime
	 */
	public String getSocialEventDateTime() {
		return socialEventDateTime;
	}

	/**
	 * Sets the social event date time.
	 *
	 * @param socialEventDateTime the socialEventDateTime to set
	 */
	public void setSocialEventDateTime(String socialEventDateTime) {
		this.socialEventDateTime = socialEventDateTime;
	}

	/**
	 * Sets the social event typology.
	 *
	 * @param socialEventTypology the socialEventTypology to set
	 */
	public void setSocialEventTypology(String socialEventTypology) {
		this.socialEventTypology = socialEventTypology;
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

	
	
	
		    
}
