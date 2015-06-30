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
 * The Class PowerVoltageData.
 */
@XmlRootElement(name = "powervoltagedata")
@XmlAccessorType(XmlAccessType.FIELD)
public class PowerVoltageData {

	/** The entity id. */
	@XmlAttribute(required = true)
	private String entityId;
	
	/** The date line. */
	@XmlElement(required = true)
	private long dateLine;

	/** The current time. */
	@XmlElement(required = true)
	private long currentTime;

	/** The current power losses. */
	@XmlElement(required = true)
	private double currentPowerLosses;
	
	/** The current voltage drops. */
	@XmlElement(required = true)
	private double currentVoltageDrops;

	
	/** The after1h power losses. */
	@XmlElement(required = true)
	private double after1hPowerLosses;
	
	/** The after1h voltage drops. */
	@XmlElement(required = true)
	private double after1hVoltageDrops;
	
	/** The after3h power losses. */
	@XmlElement(required = true)
	private double after3hPowerLosses;
	
	/** The after3h voltage drops. */
	@XmlElement(required = true)
	private double after3hVoltageDrops;
	
	/** The after6h power losses. */
	@XmlElement(required = true)
	private double after6hPowerLosses;
	
	/** The after6h voltage drops. */
	@XmlElement(required = true)
	private double after6hVoltageDrops;
	
	/** The after12h power losses. */
	@XmlElement(required = true)
	private double after12hPowerLosses;
	
	/** The after12h voltage drops. */
	@XmlElement(required = true)
	private double after12hVoltageDrops;
	
	/** The after24h power losses. */
	@XmlElement(required = true)
	private double after24hPowerLosses;
	
	/** The after24h voltage drops. */
	@XmlElement(required = true)
	private double after24hVoltageDrops;
	/**
	 * Gets the entity id.
	 *
	 * @return the entityId
	 */
	public String getEntityId() {
		return entityId;
	}

	/**
	 * Sets the entity id.
	 *
	 * @param entityId the entityId to set
	 */
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	

	/**
	 * Gets the date line.
	 *
	 * @return the dateLine
	 */
	public long getDateLine() {
		return dateLine;
	}

	/**
	 * Sets the date line.
	 *
	 * @param dateLine the dateLine to set
	 */
	public void setDateLine(long dateLine) {
		this.dateLine = dateLine;
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
	 * Gets the current voltage drops.
	 *
	 * @return the currentVoltageDrops
	 */
	public double getCurrentVoltageDrops() {
		return currentVoltageDrops;
	}

	/**
	 * Sets the current voltage drops.
	 *
	 * @param currentVoltageDrops the currentVoltageDrops to set
	 */
	public void setCurrentVoltageDrops(double currentVoltageDrops) {
		this.currentVoltageDrops = currentVoltageDrops;
	}
	
	
	
	
	/**
	 * Instantiates a new power voltage data.
	 */
	public PowerVoltageData() {
		super();
	}

	/**
	 * Gets the after1h power losses.
	 *
	 * @return the after1h power losses
	 */
	public double getAfter1hPowerLosses() {
		return after1hPowerLosses;
	}

	/**
	 * Sets the after1h power losses.
	 *
	 * @param after1hPowerLosses the new after1h power losses
	 */
	public void setAfter1hPowerLosses(double after1hPowerLosses) {
		this.after1hPowerLosses = after1hPowerLosses;
	}

	/**
	 * Gets the after1h voltage drops.
	 *
	 * @return the after1h voltage drops
	 */
	public double getAfter1hVoltageDrops() {
		return after1hVoltageDrops;
	}

	/**
	 * Sets the after1h voltage drops.
	 *
	 * @param after1hVoltageDrops the new after1h voltage drops
	 */
	public void setAfter1hVoltageDrops(double after1hVoltageDrops) {
		this.after1hVoltageDrops = after1hVoltageDrops;
	}

	/**
	 * Gets the after3h power losses.
	 *
	 * @return the after3h power losses
	 */
	public double getAfter3hPowerLosses() {
		return after3hPowerLosses;
	}

	/**
	 * Sets the after3h power losses.
	 *
	 * @param after3hPowerLosses the new after3h power losses
	 */
	public void setAfter3hPowerLosses(double after3hPowerLosses) {
		this.after3hPowerLosses = after3hPowerLosses;
	}

	/**
	 * Gets the after3h voltage drops.
	 *
	 * @return the after3h voltage drops
	 */
	public double getAfter3hVoltageDrops() {
		return after3hVoltageDrops;
	}

	/**
	 * Sets the after3h voltage drops.
	 *
	 * @param after3hVoltageDrops the new after3h voltage drops
	 */
	public void setAfter3hVoltageDrops(double after3hVoltageDrops) {
		this.after3hVoltageDrops = after3hVoltageDrops;
	}

	/**
	 * Gets the after6h power losses.
	 *
	 * @return the after6h power losses
	 */
	public double getAfter6hPowerLosses() {
		return after6hPowerLosses;
	}

	/**
	 * Sets the after6h power losses.
	 *
	 * @param after6hPowerLosses the new after6h power losses
	 */
	public void setAfter6hPowerLosses(double after6hPowerLosses) {
		this.after6hPowerLosses = after6hPowerLosses;
	}

	/**
	 * Gets the after6h voltage drops.
	 *
	 * @return the after6h voltage drops
	 */
	public double getAfter6hVoltageDrops() {
		return after6hVoltageDrops;
	}

	/**
	 * Sets the after6h voltage drops.
	 *
	 * @param after6hVoltageDrops the new after6h voltage drops
	 */
	public void setAfter6hVoltageDrops(double after6hVoltageDrops) {
		this.after6hVoltageDrops = after6hVoltageDrops;
	}

	/**
	 * Gets the after12h power losses.
	 *
	 * @return the after12h power losses
	 */
	public double getAfter12hPowerLosses() {
		return after12hPowerLosses;
	}

	/**
	 * Sets the after12h power losses.
	 *
	 * @param after12hPowerLosses the new after12h power losses
	 */
	public void setAfter12hPowerLosses(double after12hPowerLosses) {
		this.after12hPowerLosses = after12hPowerLosses;
	}

	/**
	 * Gets the after12h voltage drops.
	 *
	 * @return the after12h voltage drops
	 */
	public double getAfter12hVoltageDrops() {
		return after12hVoltageDrops;
	}

	/**
	 * Sets the after12h voltage drops.
	 *
	 * @param after12hVoltageDrops the new after12h voltage drops
	 */
	public void setAfter12hVoltageDrops(double after12hVoltageDrops) {
		this.after12hVoltageDrops = after12hVoltageDrops;
	}

	/**
	 * Gets the after24h power losses.
	 *
	 * @return the after24h power losses
	 */
	public double getAfter24hPowerLosses() {
		return after24hPowerLosses;
	}

	/**
	 * Sets the after24h power losses.
	 *
	 * @param after24hPowerLosses the new after24h power losses
	 */
	public void setAfter24hPowerLosses(double after24hPowerLosses) {
		this.after24hPowerLosses = after24hPowerLosses;
	}

	/**
	 * Gets the after24h voltage drops.
	 *
	 * @return the after24h voltage drops
	 */
	public double getAfter24hVoltageDrops() {
		return after24hVoltageDrops;
	}

	/**
	 * Sets the after24h voltage drops.
	 *
	 * @param after24hVoltageDrops the new after24h voltage drops
	 */
	public void setAfter24hVoltageDrops(double after24hVoltageDrops) {
		this.after24hVoltageDrops = after24hVoltageDrops;
	}

	/**
	 * Instantiates a new power voltage data.
	 *
	 * @param entityId the entity id
	 * @param dateLine the date line
	 * @param currentTime the current time
	 * @param currentPowerLosses the current power losses
	 * @param currentVoltageDrops the current voltage drops
	 * @param after1hPowerLosses the after1h power losses
	 * @param after1hVoltageDrops the after1h voltage drops
	 * @param after3hPowerLosses the after3h power losses
	 * @param after3hVoltageDrops the after3h voltage drops
	 * @param after6hPowerLosses the after6h power losses
	 * @param after6hVoltageDrops the after6h voltage drops
	 * @param after12hPowerLosses the after12h power losses
	 * @param after12hVoltageDrops the after12h voltage drops
	 * @param after24hPowerLosses the after24h power losses
	 * @param after24hVoltageDrops the after24h voltage drops
	 */
	public PowerVoltageData(String entityId, long dateLine, long currentTime,
			double currentPowerLosses, double currentVoltageDrops,
			double after1hPowerLosses, double after1hVoltageDrops,
			double after3hPowerLosses, double after3hVoltageDrops,
			double after6hPowerLosses, double after6hVoltageDrops,
			double after12hPowerLosses, double after12hVoltageDrops,
			double after24hPowerLosses, double after24hVoltageDrops) {
		super();
		this.entityId = entityId;
		this.dateLine = dateLine;
		this.currentTime = currentTime;
		this.currentPowerLosses = currentPowerLosses;
		this.currentVoltageDrops = currentVoltageDrops;
		this.after1hPowerLosses = after1hPowerLosses;
		this.after1hVoltageDrops = after1hVoltageDrops;
		this.after3hPowerLosses = after3hPowerLosses;
		this.after3hVoltageDrops = after3hVoltageDrops;
		this.after6hPowerLosses = after6hPowerLosses;
		this.after6hVoltageDrops = after6hVoltageDrops;
		this.after12hPowerLosses = after12hPowerLosses;
		this.after12hVoltageDrops = after12hVoltageDrops;
		this.after24hPowerLosses = after24hPowerLosses;
		this.after24hVoltageDrops = after24hVoltageDrops;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PowerVoltageData [entityId=" + entityId + ", dateLine="
				+ dateLine + ", currentTime=" + currentTime
				+ ", currentPowerLosses=" + currentPowerLosses
				+ ", currentVoltageDrops=" + currentVoltageDrops
				+ ", after1hPowerLosses=" + after1hPowerLosses
				+ ", after1hVoltageDrops=" + after1hVoltageDrops
				+ ", after3hPowerLosses=" + after3hPowerLosses
				+ ", after3hVoltageDrops=" + after3hVoltageDrops
				+ ", after6hPowerLosses=" + after6hPowerLosses
				+ ", after6hVoltageDrops=" + after6hVoltageDrops
				+ ", after12hPowerLosses=" + after12hPowerLosses
				+ ", after12hVoltageDrops=" + after12hVoltageDrops
				+ ", after24hPowerLosses=" + after24hPowerLosses
				+ ", after24hVoltageDrops=" + after24hVoltageDrops + "]";
	}

	
}
