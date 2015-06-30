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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Powerlosses.
 */
@XmlRootElement(name = "powerlosses")
@XmlAccessorType(XmlAccessType.FIELD)
public class Powerlosses {

	/** The power losses id. */
	@XmlAttribute(required = true)
	private String powerLossesId;
		
	/** The current time. */
	@XmlElement(required = true)
	private long currentTime;

	/** The current power losses. */
	@XmlElement(required = true)
	private double currentPowerLosses;
	
	/** The after1h power losses. */
	@XmlElement(required = true)
	private double after1hPowerLosses;

	/** The after3h power losses. */
	@XmlElement(required = true)
	private double after3hPowerLosses;
	
	/** The after6h power losses. */
	@XmlElement(required = true)
	private double after6hPowerLosses;
	
	/** The after12h power losses. */
	@XmlElement(required = true)
	private double after12hPowerLosses;
	
	/** The after24h power losses. */
	@XmlElement(required = true)
	private double after24hPowerLosses;
	
	
	
	/**
	 * Instantiates a new powerlosses.
	 *
	 * @param powerLossesId the power losses id
	 */
	public Powerlosses(String powerLossesId) {
		super();
		// TODO Auto-generated constructor stub
	}



	/**
	 * Instantiates a new powerlosses.
	 *
	 * @param currentTime the current time
	 * @param currentPowerLosses the current power losses
	 * @param after1hPowerLosses the after1h power losses
	 * @param after3hPowerLosses the after3h power losses
	 * @param after6hPowerLosses the after6h power losses
	 * @param after12hPowerLosses the after12h power losses
	 * @param after24hPowerLosses the after24h power losses
	 */
	public Powerlosses(long currentTime, double currentPowerLosses,
			double after1hPowerLosses, double after3hPowerLosses,
			double after6hPowerLosses, double after12hPowerLosses,
			double after24hPowerLosses) {
		super();
		this.currentTime = currentTime;
		this.currentPowerLosses = currentPowerLosses;
		this.after1hPowerLosses = after1hPowerLosses;
		this.after3hPowerLosses = after3hPowerLosses;
		this.after6hPowerLosses = after6hPowerLosses;
		this.after12hPowerLosses = after12hPowerLosses;
		this.after24hPowerLosses = after24hPowerLosses;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Powerlosses [currentTime=" + currentTime
				+ ", currentPowerLosses=" + currentPowerLosses
				+ ", after1hPowerLosses=" + after1hPowerLosses
				+ ", after3hPowerLosses=" + after3hPowerLosses
				+ ", after6hPowerLosses=" + after6hPowerLosses
				+ ", after12hPowerLosses=" + after12hPowerLosses
				+ ", after24hPowerLosses=" + after24hPowerLosses + "]";
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
	 * Gets the current power losses.
	 *
	 * @return the currentPowerLosses
	 */
	public double getCurrentPowerLosses() {
		return currentPowerLosses;
	}



	/**
	 * Sets the current power losses.
	 *
	 * @param currentPowerLosses the currentPowerLosses to set
	 */
	public void setCurrentPowerLosses(double currentPowerLosses) {
		this.currentPowerLosses = currentPowerLosses;
	}



	/**
	 * Gets the after1h power losses.
	 *
	 * @return the after1hPowerLosses
	 */
	public double getAfter1hPowerLosses() {
		return after1hPowerLosses;
	}



	/**
	 * Sets the after1h power losses.
	 *
	 * @param after1hPowerLosses the after1hPowerLosses to set
	 */
	public void setAfter1hPowerLosses(double after1hPowerLosses) {
		this.after1hPowerLosses = after1hPowerLosses;
	}



	/**
	 * Gets the after3h power losses.
	 *
	 * @return the after3hPowerLosses
	 */
	public double getAfter3hPowerLosses() {
		return after3hPowerLosses;
	}



	/**
	 * Sets the after3h power losses.
	 *
	 * @param after3hPowerLosses the after3hPowerLosses to set
	 */
	public void setAfter3hPowerLosses(double after3hPowerLosses) {
		this.after3hPowerLosses = after3hPowerLosses;
	}



	/**
	 * Gets the after6h power losses.
	 *
	 * @return the after6hPowerLosses
	 */
	public double getAfter6hPowerLosses() {
		return after6hPowerLosses;
	}



	/**
	 * Sets the after6h power losses.
	 *
	 * @param after6hPowerLosses the after6hPowerLosses to set
	 */
	public void setAfter6hPowerLosses(double after6hPowerLosses) {
		this.after6hPowerLosses = after6hPowerLosses;
	}



	/**
	 * Gets the after12h power losses.
	 *
	 * @return the after12hPowerLosses
	 */
	public double getAfter12hPowerLosses() {
		return after12hPowerLosses;
	}



	/**
	 * Sets the after12h power losses.
	 *
	 * @param after12hPowerLosses the after12hPowerLosses to set
	 */
	public void setAfter12hPowerLosses(double after12hPowerLosses) {
		this.after12hPowerLosses = after12hPowerLosses;
	}



	/**
	 * Gets the after24h power losses.
	 *
	 * @return the after24hPowerLosses
	 */
	public double getAfter24hPowerLosses() {
		return after24hPowerLosses;
	}



	/**
	 * Sets the after24h power losses.
	 *
	 * @param after24hPowerLosses the after24hPowerLosses to set
	 */
	public void setAfter24hPowerLosses(double after24hPowerLosses) {
		this.after24hPowerLosses = after24hPowerLosses;
	}


	/**
	 * Gets the power losses id.
	 *
	 * @return the powerLossesId
	 */
	public String getPowerLossesId() {
		return powerLossesId;
	}



	/**
	 * Sets the power losses id.
	 *
	 * @param powerLossesId the powerLossesId to set
	 */
	public void setPowerLossesId(String powerLossesId) {
		this.powerLossesId = powerLossesId;
	}



	/**
	 * To xml.
	 */
	public void toXml() {
	    try {
	        JAXBContext ctx = JAXBContext.newInstance(Powerlosses.class);
	        Marshaller marshaller = ctx.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	        marshaller.marshal(this, System.out);
	    }
	    catch (Exception
	            e) {

	              //catch exception 
	    }
	}
	
}
