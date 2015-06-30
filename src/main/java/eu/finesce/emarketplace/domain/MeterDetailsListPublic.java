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
 * The Class MeterDetailsListPublic.
 */
@XmlRootElement(name = "meterDetailsList")
@XmlAccessorType(XmlAccessType.FIELD)
public class MeterDetailsListPublic {
	
	/** The customer id. */
	@XmlElement(required = true)
    private String customerId;
	
 	/** The new meter code. */
	 @XmlElement(required = true)
 	private String newMeterCode=" ";
	
 	/** The sector. */
	 @XmlElement(required = true)
 	private String sector=" ";

 	/** The user power. */
	 @XmlElement(required = true)
 	private String userPower=" ";
	
 	/** The id. */
	 @XmlElement(required = true)
 	private String id=" ";
 	
 	/** The producer power. */
	 @XmlElement(required = true)
 	private String producerPower=" ";
 	
 	/** The street name. */
	 @XmlElement(required = true)
 	private String streetName=" ";
 	
 	/** The house number. */
	 @XmlElement(required = true)
 	private String houseNumber=" ";
 	
 	/** The is domestic. */
	 @XmlElement(required = true)
 	private String isDomestic=" ";
 	
 	/** The install code. */
	 @XmlElement(required = true)
 	private String installCode=" ";
 	
 	/** The phase. */
	 @XmlElement(required = true)
 	private String phase=" ";
 	
 	/** The meter code. */
	 @XmlElement(required = true)
 	private String meterCode=" ";
 	
 	/** The current time. */
	 @XmlElement(required=true)
	private String currentTime=" ";
 	
 	/** The reading. */
	 @XmlElement(required = true)
 	private String reading=" ";
 	
 	/** The city. */
	 @XmlElement(required = true)
 	private String city=" ";
 	
 	/** The latitude. */
	 @XmlElement(required = true)
 	private String latitude=" ";
 	
 	/** The longitude. */
	 @XmlElement(required = true)
 	private String longitude=" ";
 	
 	/** The is registered. */
	 @XmlElement(required = true)
 	private String isRegistered=" ";
 
 	/** The k new meter. */
	 @XmlElement(required = true)
 	private String kNewMeter=" ";
 	
 	/** The sim meter. */
	 @XmlElement(required = true)
 	private String simMeter=" ";
 	
 	/** The new meter. */
	 @XmlElement(required = true)
 	private String newMeter="";

 	/** The secondary substation code. */
	 @XmlElement(required = true)
 	private String secondarySubstationCode=" ";
 	
 	/** The trafo number. */
	 @XmlElement(required = true)
 	private String trafoNumber=" ";
 	
 	/** The feeder name. */
	 @XmlElement(required = true)
 	private String feederName=" ";
 	
 	/** The node. */
	 @XmlElement(required = true)
 	private String node=" ";

	/**
	 * Gets the customer id.
	 *
	 * @return the custormerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * Sets the customer id.
	 *
	 * @param customerId the new customer id
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	/**
	 * Gets the user power.
	 *
	 * @return the userPower
	 */
	public String getUserPower() {
		return userPower;
	}

	/**
	 * Sets the user power.
	 *
	 * @param userPower the userPower to set
	 */
	public void setUserPower(String userPower) {
		this.userPower = userPower;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Gets the producer power.
	 *
	 * @return the producerPower
	 */
	public String getProducerPower() {
		return producerPower;
	}

	/**
	 * Sets the producer power.
	 *
	 * @param producerPower the producerPower to set
	 */
	public void setProducerPower(String producerPower) {
		this.producerPower = producerPower;
	}

	/**
	 * Gets the street name.
	 *
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Sets the street name.
	 *
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * Gets the house number.
	 *
	 * @return the houseNumber
	 */
	public String getHouseNumber() {
		return houseNumber;
	}

	/**
	 * Sets the house number.
	 *
	 * @param houseNumber the houseNumber to set
	 */
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	/**
	 * Checks if is domestic.
	 *
	 * @return the isDomestic
	 */
	public String isDomestic() {
		return isDomestic;
	}

	/**
	 * Sets the domestic.
	 *
	 * @param isDomestic the isDomestic to set
	 */
	public void setDomestic(String isDomestic) {
		this.isDomestic = isDomestic;
	}

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

	/**
	 * Gets the install code.
	 *
	 * @return the installCode
	 */
	public String getInstallCode() {
		return installCode;
	}

	/**
	 * Sets the install code.
	 *
	 * @param installCode the installCode to set
	 */
	public void setInstallCode(String installCode) {
		this.installCode = installCode;
	}

	/**
	 * Gets the phase.
	 *
	 * @return the phase
	 */
	public String getPhase() {
		return phase;
	}

	/**
	 * Sets the phase.
	 *
	 * @param phase the phase to set
	 */
	public void setPhase(String phase) {
		this.phase = phase;
	}

	/**
	 * Gets the meter code.
	 *
	 * @return the meterCode
	 */
	public String getMeterCode() {
		return meterCode;
	}

	/**
	 * Sets the meter code.
	 *
	 * @param meterCode the meterCode to set
	 */
	public void setMeterCode(String meterCode) {
		this.meterCode = meterCode;
	}

	/**
	 * Gets the current time.
	 *
	 * @return the currentTime
	 */
	public String getCurrentTime() {
		return currentTime;
	}

	/**
	 * Sets the current time.
	 *
	 * @param currentTime the currentTime to set
	 */
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}

	/**
	 * Gets the reading.
	 *
	 * @return the reading
	 */
	public String getReading() {
		return reading;
	}

	/**
	 * Sets the reading.
	 *
	 * @param reading the reading to set
	 */
	public void setReading(String reading) {
		this.reading = reading;
	}

	/**
	 * Gets the city.
	 *
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * Sets the city.
	 *
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Gets the latitude.
	 *
	 * @return the latitude
	 */
	public String getLatitude() {
		return latitude;
	}

	/**
	 * Sets the latitude.
	 *
	 * @param latitude the latitude to set
	 */
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	/**
	 * Gets the longitude.
	 *
	 * @return the longitude
	 */
	public String getLongitude() {
		return longitude;
	}

	/**
	 * Sets the longitude.
	 *
	 * @param longitude the longitude to set
	 */
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	/**
	 * Checks if is registered.
	 *
	 * @return the isRegistered
	 */
	public String isRegistered() {
		return isRegistered;
	}

	/**
	 * Sets the registered.
	 *
	 * @param isRegistered the isRegistered to set
	 */
	public void setRegistered(String isRegistered) {
		this.isRegistered = isRegistered;
	}

	/**
	 * Gets the new meter code.
	 *
	 * @return the newMeterCode
	 */
	public String getNewMeterCode() {
		return newMeterCode;
	}

	/**
	 * Sets the new meter code.
	 *
	 * @param newMeterCode the newMeterCode to set
	 */
	public void setNewMeterCode(String newMeterCode) {
		this.newMeterCode = newMeterCode;
	}

	/**
	 * Gets the k new meter.
	 *
	 * @return the kNewMeter
	 */
	public String getkNewMeter() {
		return kNewMeter;
	}

	/**
	 * Sets the k new meter.
	 *
	 * @param kNewMeter the kNewMeter to set
	 */
	public void setkNewMeter(String kNewMeter) {
		this.kNewMeter = kNewMeter;
	}

	/**
	 * Gets the sim meter.
	 *
	 * @return the simMeter
	 */
	public String getSimMeter() {
		return simMeter;
	}

	/**
	 * Sets the sim meter.
	 *
	 * @param simMeter the simMeter to set
	 */
	public void setSimMeter(String simMeter) {
		this.simMeter = simMeter;
	}

	/**
	 * Gets the new meter.
	 *
	 * @return the newMeter
	 */
	public String getNewMeter() {
		return newMeter;
	}

	/**
	 * Sets the new meter.
	 *
	 * @param newMeter the newMeter to set
	 */
	public void setNewMeter(String newMeter) {
		this.newMeter = newMeter;
	}

	/**
	 * Gets the secondary substation code.
	 *
	 * @return the secondarySubstationCode
	 */
	public String getSecondarySubstationCode() {
		return secondarySubstationCode;
	}

	/**
	 * Sets the secondary substation code.
	 *
	 * @param secondarySubstationCode the secondarySubstationCode to set
	 */
	public void setSecondarySubstationCode(String secondarySubstationCode) {
		this.secondarySubstationCode = secondarySubstationCode;
	}

	/**
	 * Gets the trafo number.
	 *
	 * @return the trafoNumber
	 */
	public String getTrafoNumber() {
		return trafoNumber;
	}

	/**
	 * Sets the trafo number.
	 *
	 * @param trafoNumber the trafoNumber to set
	 */
	public void setTrafoNumber(String trafoNumber) {
		this.trafoNumber = trafoNumber;
	}

	/**
	 * Gets the feeder name.
	 *
	 * @return the feederName
	 */
	public String getFeederName() {
		return feederName;
	}

	/**
	 * Sets the feeder name.
	 *
	 * @param feederName the feederName to set
	 */
	public void setFeederName(String feederName) {
		this.feederName = feederName;
	}

	/**
	 * Gets the node.
	 *
	 * @return the node
	 */
	public String getNode() {
		return node;
	}

	/**
	 * Sets the node.
	 *
	 * @param node the node to set
	 */
	public void setNode(String node) {
		this.node = node;
	}

}
