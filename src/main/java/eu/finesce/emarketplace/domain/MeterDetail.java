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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


// TODO: Auto-generated Javadoc
/**
 * The Class MeterDetail.
 */
@XmlRootElement(name = "meterDetail")
@XmlAccessorType(XmlAccessType.FIELD)
public class MeterDetail {
	
	
	/** The custormer id. */
	@XmlAttribute(required = true)
    private String custormerId;
	
	/** The user power. */
	@XmlAttribute(required = true)
 	private String userPower;
	
 	/** The id. */
	 @XmlElement(required = true)
 	private String id;
 	
 	/** The producer power. */
	 @XmlElement(required = true)
 	private String producerPower;
 	
 	/** The street name. */
	 @XmlElement(required = true)
 	private String streetName;
 	
 	/** The house number. */
	 @XmlElement(required = true)
 	private String houseNumber;
 	
 	/** The is domestic. */
	 @XmlElement(required = true)
 	private boolean isDomestic;
 	
 	/** The sector. */
	 @XmlElement(required = true)
 	private String sector;
 	
 	/** The install code. */
	 @XmlElement(required = true)
 	private String installCode;
 	
 	/** The phase. */
	 @XmlElement(required = true)
 	private String phase;
 	
 	/** The meter code. */
	 @XmlElement(required = true)
 	private String meterCode;
 	
 	/** The current time. */
	 @XmlElement(required=true)
	private long currentTime;
 	
 	/** The reading. */
	 @XmlElement(required = true)
 	private String reading;
 	
 	/** The city. */
	 @XmlElement(required = true)
 	private String city;
 	
 	/** The latitude. */
	 @XmlElement(required = true)
 	private String latitude;
 	
 	/** The longitude. */
	 @XmlElement(required = true)
 	private String longitude;
 	
 	/** The is registered. */
	 @XmlElement(required = true)
 	private boolean isRegistered=false;
 
 	/** The new meter code. */
	 @XmlElement(required = true)
 	private String newMeterCode;
 	
 	/** The k new meter. */
	 @XmlElement(required = true)
 	private int kNewMeter;
 	
 	/** The sim meter. */
	 @XmlElement(required = true)
 	private long simMeter;
 	
 	/** The new meter. */
	 @XmlElement(required = true)
 	private String newMeter;

 	/** The secondary substation code. */
	 @XmlElement(required = true)
 	private String secondarySubstationCode;
 	
 	/** The trafo number. */
	 @XmlElement(required = true)
 	private String trafoNumber;
 	
 	/** The feeder name. */
	 @XmlElement(required = true)
 	private String feederName;
 	
 	/** The node. */
	 @XmlElement(required = true)
 	private String node;
 	
 	
 	/**
	  * Instantiates a new meter detail.
	  */
	 public MeterDetail(){
 		
 	}
 	
    /**
     * Instantiates a new meter detail.
     *
     * @param custormerId the custormer id
     * @param userPower the user power
     */
    public MeterDetail(String custormerId, String userPower) {
		super();
		this.custormerId = custormerId;
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
	 * Gets the custormer id.
	 *
	 * @return the custormerId
	 */
	public String getCustormerId() {
		return custormerId;
	}

	/**
	 * Sets the custormer id.
	 *
	 * @param custormerId the custormerId to set
	 */
	public void setCustormerId(String custormerId) {
		this.custormerId = custormerId;
	}

	

	
	

	/**
	 * Gets the street name.
	 *
	 * @return the street name
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * Sets the street name.
	 *
	 * @param streetName the new street name
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
	 * @return true, if is domestic
	 */
	public boolean isDomestic() {
		return isDomestic;
	}

	/**
	 * Sets the domestic.
	 *
	 * @param isDomestic the new domestic
	 */
	public void setDomestic(boolean isDomestic) {
		this.isDomestic = isDomestic;
	}

	

	/**
	 * Gets the install code.
	 *
	 * @return the install code
	 */
	public String getInstallCode() {
		return installCode;
	}

	/**
	 * Sets the install code.
	 *
	 * @param installCode the new install code
	 */
	public void setInstallCode(String installCode) {
		this.installCode = installCode;
	}

	
	/**
	 * Gets the meter code.
	 *
	 * @return the meter code
	 */
	public String getMeterCode() {
		return meterCode;
	}

	/**
	 * Sets the meter code.
	 *
	 * @param meterCode the new meter code
	 */
	public void setMeterCode(String meterCode) {
		this.meterCode = meterCode;
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
	 * @param city the new city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * Checks if is registered.
	 *
	 * @return true, if is registered
	 */
	public boolean isRegistered() {
		return isRegistered;
	}

	/**
	 * Sets the registered.
	 *
	 * @param isRegistered the new registered
	 */
	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
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
	public int getkNewMeter() {
		return kNewMeter;
	}

	/**
	 * Sets the k new meter.
	 *
	 * @param kNewMeter the kNewMeter to set
	 */
	public void setkNewMeter(int kNewMeter) {
		this.kNewMeter = kNewMeter;
	}

	/**
	 * Gets the sim meter.
	 *
	 * @return the simMeter
	 */
	public long getSimMeter() {
		return simMeter;
	}

	/**
	 * Sets the sim meter.
	 *
	 * @param simMeter the simMeter to set
	 */
	public void setSimMeter(long simMeter) {
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((custormerId == null) ? 0 : custormerId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((installCode == null) ? 0 : installCode.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MeterDetail)) {
			return false;
		}
		MeterDetail other = (MeterDetail) obj;
		if (custormerId == null) {
			if (other.custormerId != null) {
				return false;
			}
		} else if (!custormerId.equals(other.custormerId)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (installCode == null) {
			if (other.installCode != null) {
				return false;
			}
		} else if (!installCode.equals(other.installCode)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeterDetail [id=");
		builder.append(id);
		builder.append(", custormerId=");
		builder.append(custormerId);
		builder.append(", userPower=");
		builder.append(userPower);
		builder.append(", producerPower=");
		builder.append(producerPower);
		builder.append(", streetName=");
		builder.append(streetName);
		builder.append(", houseNumber=");
		builder.append(houseNumber);
		builder.append(", isDomestic=");
		builder.append(isDomestic);
		builder.append(", sector=");
		builder.append(sector);
		builder.append(", installCode=");
		builder.append(installCode);
		builder.append(", phase=");
		builder.append(phase);
		builder.append(", meterCode=");
		builder.append(meterCode);
		builder.append(", reading=");
		builder.append(reading);
		builder.append(", city=");
		builder.append(city);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", longitude=");
		builder.append(longitude);
		builder.append(", isRegistered=");
		builder.append(isRegistered);
		builder.append("]");
		return builder.toString();
	}

	

}
