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
 * The Class Voltage.
 */
@XmlRootElement(name = "voltageDrops")
@XmlAccessorType(XmlAccessType.FIELD)
public class Voltage {

	/** The voltage id. */
	@XmlAttribute(required=true)
	private String voltageID;
		
	/** The current time. */
	@XmlElement(required = true)
	private long currentTime;

	/** The current voltage. */
	@XmlElement(required = true)
	private double currentVoltage;
	
	/** The after1h voltage. */
	@XmlElement(required = true)
	private double after1hVoltage;

	/** The after3h voltage. */
	@XmlElement(required = true)
	private double after3hVoltage;
	
	/** The after6h voltage. */
	@XmlElement(required = true)
	private double after6hVoltage;
	
	/** The after12h voltage. */
	@XmlElement(required = true)
	private double after12hVoltage;
	
	/** The after24h voltage. */
	@XmlElement(required = true)
	private double after24hVoltage;
	
	
	
	
	/**
	 * Instantiates a new voltage.
	 *
	 * @param voltageId the voltage id
	 */
	public Voltage(String voltageId) {
		super();
		// TODO Auto-generated constructor stub
	}




	/**
	 * Gets the voltage id.
	 *
	 * @return the voltageID
	 */
	public String getVoltageID() {
		return voltageID;
	}




	/**
	 * Sets the voltage id.
	 *
	 * @param voltageID the voltageID to set
	 */
	public void setVoltageID(String voltageID) {
		this.voltageID = voltageID;
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
	 * Gets the current voltage.
	 *
	 * @return the currentVoltage
	 */
	public double getCurrentVoltage() {
		return currentVoltage;
	}




	/**
	 * Sets the current voltage.
	 *
	 * @param currentVoltage the currentVoltage to set
	 */
	public void setCurrentVoltage(double currentVoltage) {
		this.currentVoltage = currentVoltage;
	}




	/**
	 * Gets the after1h voltage.
	 *
	 * @return the after1hVoltage
	 */
	public double getAfter1hVoltage() {
		return after1hVoltage;
	}




	/**
	 * Sets the after1h voltage.
	 *
	 * @param after1hVoltage the after1hVoltage to set
	 */
	public void setAfter1hVoltage(double after1hVoltage) {
		this.after1hVoltage = after1hVoltage;
	}




	/**
	 * Gets the after3h voltage.
	 *
	 * @return the after3hVoltage
	 */
	public double getAfter3hVoltage() {
		return after3hVoltage;
	}




	/**
	 * Sets the after3h voltage.
	 *
	 * @param after3hVoltage the after3hVoltage to set
	 */
	public void setAfter3hVoltage(double after3hVoltage) {
		this.after3hVoltage = after3hVoltage;
	}




	/**
	 * Gets the after6h voltage.
	 *
	 * @return the after6hVoltage
	 */
	public double getAfter6hVoltage() {
		return after6hVoltage;
	}




	/**
	 * Sets the after6h voltage.
	 *
	 * @param after6hVoltage the after6hVoltage to set
	 */
	public void setAfter6hVoltage(double after6hVoltage) {
		this.after6hVoltage = after6hVoltage;
	}




	/**
	 * Gets the after12h voltage.
	 *
	 * @return the after12hVoltage
	 */
	public double getAfter12hVoltage() {
		return after12hVoltage;
	}




	/**
	 * Sets the after12h voltage.
	 *
	 * @param after12hVoltage the after12hVoltage to set
	 */
	public void setAfter12hVoltage(double after12hVoltage) {
		this.after12hVoltage = after12hVoltage;
	}




	/**
	 * Gets the after24h voltage.
	 *
	 * @return the after24hVoltage
	 */
	public double getAfter24hVoltage() {
		return after24hVoltage;
	}




	/**
	 * Sets the after24h voltage.
	 *
	 * @param after24hVoltage the after24hVoltage to set
	 */
	public void setAfter24hVoltage(double after24hVoltage) {
		this.after24hVoltage = after24hVoltage;
	}




	/**
	 * Instantiates a new voltage.
	 *
	 * @param voltageID the voltage id
	 * @param currentTime the current time
	 * @param currentVoltage the current voltage
	 * @param after1hVoltage the after1h voltage
	 * @param after3hVoltage the after3h voltage
	 * @param after6hVoltage the after6h voltage
	 * @param after12hVoltage the after12h voltage
	 * @param after24hVoltage the after24h voltage
	 */
	public Voltage(String voltageID, long currentTime, double currentVoltage,
			double after1hVoltage, double after3hVoltage,
			double after6hVoltage, double after12hVoltage,
			double after24hVoltage) {
		super();
		this.voltageID = voltageID;
		this.currentTime = currentTime;
		this.currentVoltage = currentVoltage;
		this.after1hVoltage = after1hVoltage;
		this.after3hVoltage = after3hVoltage;
		this.after6hVoltage = after6hVoltage;
		this.after12hVoltage = after12hVoltage;
		this.after24hVoltage = after24hVoltage;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Voltage [voltageID=" + voltageID + ", currentTime="
				+ currentTime + ", currentVoltage=" + currentVoltage
				+ ", after1hVoltage=" + after1hVoltage + ", after3hVoltage="
				+ after3hVoltage + ", after6hVoltage=" + after6hVoltage
				+ ", after12hVoltage=" + after12hVoltage + ", after24hVoltage="
				+ after24hVoltage + "]";
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(after12hVoltage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after1hVoltage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after24hVoltage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after3hVoltage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after6hVoltage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (currentTime ^ (currentTime >>> 32));
		temp = Double.doubleToLongBits(currentVoltage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ ((voltageID == null) ? 0 : voltageID.hashCode());
		return result;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voltage other = (Voltage) obj;
		if (Double.doubleToLongBits(after12hVoltage) != Double
				.doubleToLongBits(other.after12hVoltage))
			return false;
		if (Double.doubleToLongBits(after1hVoltage) != Double
				.doubleToLongBits(other.after1hVoltage))
			return false;
		if (Double.doubleToLongBits(after24hVoltage) != Double
				.doubleToLongBits(other.after24hVoltage))
			return false;
		if (Double.doubleToLongBits(after3hVoltage) != Double
				.doubleToLongBits(other.after3hVoltage))
			return false;
		if (Double.doubleToLongBits(after6hVoltage) != Double
				.doubleToLongBits(other.after6hVoltage))
			return false;
		if (currentTime != other.currentTime)
			return false;
		if (Double.doubleToLongBits(currentVoltage) != Double
				.doubleToLongBits(other.currentVoltage))
			return false;
		if (voltageID == null) {
			if (other.voltageID != null)
				return false;
		} else if (!voltageID.equals(other.voltageID))
			return false;
		return true;
	}




	
}
