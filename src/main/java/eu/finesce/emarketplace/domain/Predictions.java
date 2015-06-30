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
 * The Class Predictions.
 */
@XmlRootElement(name="meter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Predictions {

	/** The meter id. */
	@XmlAttribute(required=true)
	private String meterId;
	
	/** The load predictions time. */
	@XmlElement(required = true)
	private long loadPredictionsTime;
	
	/** The id user. */
	@XmlElement(required = true)
	private String idUser;
	
	/** The current time. */
	@XmlElement(required=true)
	private long currentTime;
	
	/** The after1h downstream active power. */
	@XmlElement(required=true)
	private double after1hDownstreamActivePower;
	
	/** The after1h upstream active power. */
	@XmlElement(required=true)
	private double after1hUpstreamActivePower;
	
	/** The after1h downstream reactive power. */
	@XmlElement(required=true)
	private double after1hDownstreamReactivePower;
	
	/** The after1h upstream reactive power. */
	@XmlElement(required=true)
	private double after1hUpstreamReactivePower;
	
	/** The after3h downstream active power. */
	@XmlElement(required=true)
	private double after3hDownstreamActivePower;
	
	/** The after3h upstream active power. */
	@XmlElement(required=true)
	private double after3hUpstreamActivePower;
	
	/** The after3h downstream reactive power. */
	@XmlElement(required=true)
	private double after3hDownstreamReactivePower;
	
	/** The after3h upstream reactive power. */
	@XmlElement(required=true)
	private double after3hUpstreamReactivePower;
	
	/** The after6h downstream active power. */
	@XmlElement(required=true)
	private double after6hDownstreamActivePower;
	
	/** The after6h upstream active power. */
	@XmlElement(required=true)
	private double after6hUpstreamActivePower;
	
	/** The after6h downstream reactive power. */
	@XmlElement(required=true)
	private double after6hDownstreamReactivePower;
	
	/** The after6h upstream reactive power. */
	@XmlElement(required=true)
	private double after6hUpstreamReactivePower;
	
	/** The after12h downstream active power. */
	@XmlElement(required=true)
	private double after12hDownstreamActivePower;
	
	/** The after12h upstream active power. */
	@XmlElement(required=true)
	private double after12hUpstreamActivePower;
	
	/** The after12h downstream reactive power. */
	@XmlElement(required=true)
	private double after12hDownstreamReactivePower;
	
	/** The after12h upstream reactive power. */
	@XmlElement(required=true)
	private double after12hUpstreamReactivePower;
	
	/** The after24h downstream active power. */
	@XmlElement(required=true)
	private double after24hDownstreamActivePower;
	
	/** The after24h upstream active power. */
	@XmlElement(required=true)
	private double after24hUpstreamActivePower;
	
	/** The after24h downstream reactive power. */
	@XmlElement(required=true)
	private double after24hDownstreamReactivePower;
	
	/** The after24h upstream reactive power. */
	@XmlElement(required=true)
	private double after24hUpstreamReactivePower;

	
	
	/**
	 * Instantiates a new predictions.
	 */
	public Predictions() {
		super();
		// TODO Auto-generated constructor stub
	}



	


	/**
	 * Gets the id user.
	 *
	 * @return the id user
	 */
	public String getIdUser() {
		return idUser;
	}






	/**
	 * Sets the id user.
	 *
	 * @param idUser the new id user
	 */
	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}






	/**
	 * Gets the after1h downstream reactive power.
	 *
	 * @return the after1h downstream reactive power
	 */
	public double getAfter1hDownstreamReactivePower() {
		return after1hDownstreamReactivePower;
	}






	/**
	 * Sets the after1h downstream reactive power.
	 *
	 * @param after1hDownstreamReactivePower the new after1h downstream reactive power
	 */
	public void setAfter1hDownstreamReactivePower(
			double after1hDownstreamReactivePower) {
		this.after1hDownstreamReactivePower = after1hDownstreamReactivePower;
	}






	/**
	 * Gets the after1h upstream reactive power.
	 *
	 * @return the after1h upstream reactive power
	 */
	public double getAfter1hUpstreamReactivePower() {
		return after1hUpstreamReactivePower;
	}






	/**
	 * Sets the after1h upstream reactive power.
	 *
	 * @param after1hUpstreamReactivePower the new after1h upstream reactive power
	 */
	public void setAfter1hUpstreamReactivePower(double after1hUpstreamReactivePower) {
		this.after1hUpstreamReactivePower = after1hUpstreamReactivePower;
	}






	/**
	 * Gets the after3h downstream reactive power.
	 *
	 * @return the after3h downstream reactive power
	 */
	public double getAfter3hDownstreamReactivePower() {
		return after3hDownstreamReactivePower;
	}






	/**
	 * Sets the after3h downstream reactive power.
	 *
	 * @param after3hDownstreamReactivePower the new after3h downstream reactive power
	 */
	public void setAfter3hDownstreamReactivePower(
			double after3hDownstreamReactivePower) {
		this.after3hDownstreamReactivePower = after3hDownstreamReactivePower;
	}






	/**
	 * Gets the after3h upstream reactive power.
	 *
	 * @return the after3h upstream reactive power
	 */
	public double getAfter3hUpstreamReactivePower() {
		return after3hUpstreamReactivePower;
	}






	/**
	 * Sets the after3h upstream reactive power.
	 *
	 * @param after3hUpstreamReactivePower the new after3h upstream reactive power
	 */
	public void setAfter3hUpstreamReactivePower(double after3hUpstreamReactivePower) {
		this.after3hUpstreamReactivePower = after3hUpstreamReactivePower;
	}






	/**
	 * Gets the after6h downstream reactive power.
	 *
	 * @return the after6h downstream reactive power
	 */
	public double getAfter6hDownstreamReactivePower() {
		return after6hDownstreamReactivePower;
	}






	/**
	 * Sets the after6h downstream reactive power.
	 *
	 * @param after6hDownstreamReactivePower the new after6h downstream reactive power
	 */
	public void setAfter6hDownstreamReactivePower(
			double after6hDownstreamReactivePower) {
		this.after6hDownstreamReactivePower = after6hDownstreamReactivePower;
	}






	/**
	 * Gets the after6h upstream reactive power.
	 *
	 * @return the after6h upstream reactive power
	 */
	public double getAfter6hUpstreamReactivePower() {
		return after6hUpstreamReactivePower;
	}






	/**
	 * Sets the after6h upstream reactive power.
	 *
	 * @param after6hUpstreamReactivePower the new after6h upstream reactive power
	 */
	public void setAfter6hUpstreamReactivePower(double after6hUpstreamReactivePower) {
		this.after6hUpstreamReactivePower = after6hUpstreamReactivePower;
	}






	/**
	 * Gets the after12h downstream reactive power.
	 *
	 * @return the after12h downstream reactive power
	 */
	public double getAfter12hDownstreamReactivePower() {
		return after12hDownstreamReactivePower;
	}






	/**
	 * Sets the after12h downstream reactive power.
	 *
	 * @param after12hDownstreamReactivePower the new after12h downstream reactive power
	 */
	public void setAfter12hDownstreamReactivePower(
			double after12hDownstreamReactivePower) {
		this.after12hDownstreamReactivePower = after12hDownstreamReactivePower;
	}






	/**
	 * Gets the after12h upstream reactive power.
	 *
	 * @return the after12h upstream reactive power
	 */
	public double getAfter12hUpstreamReactivePower() {
		return after12hUpstreamReactivePower;
	}






	/**
	 * Sets the after12h upstream reactive power.
	 *
	 * @param after12hUpstreamReactivePower the new after12h upstream reactive power
	 */
	public void setAfter12hUpstreamReactivePower(
			double after12hUpstreamReactivePower) {
		this.after12hUpstreamReactivePower = after12hUpstreamReactivePower;
	}






	/**
	 * Gets the after24h downstream reactive power.
	 *
	 * @return the after24h downstream reactive power
	 */
	public double getAfter24hDownstreamReactivePower() {
		return after24hDownstreamReactivePower;
	}






	/**
	 * Sets the after24h downstream reactive power.
	 *
	 * @param after24hDownstreamReactivePower the new after24h downstream reactive power
	 */
	public void setAfter24hDownstreamReactivePower(
			double after24hDownstreamReactivePower) {
		this.after24hDownstreamReactivePower = after24hDownstreamReactivePower;
	}






	/**
	 * Gets the after24h upstream reactive power.
	 *
	 * @return the after24h upstream reactive power
	 */
	public double getAfter24hUpstreamReactivePower() {
		return after24hUpstreamReactivePower;
	}






	/**
	 * Sets the after24h upstream reactive power.
	 *
	 * @param after24hUpstreamReactivePower the new after24h upstream reactive power
	 */
	public void setAfter24hUpstreamReactivePower(
			double after24hUpstreamReactivePower) {
		this.after24hUpstreamReactivePower = after24hUpstreamReactivePower;
	}






	/**
	 * Gets the meter id.
	 *
	 * @return the meterId
	 */
	public String getMeterId() {
		return meterId;
	}

	/**
	 * Sets the meter id.
	 *
	 * @param meterId the meterId to set
	 */
	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	

	/**
	 * Gets the load predictions time.
	 *
	 * @return the loadPredictionsTime
	 */
	public long getLoadPredictionsTime() {
		return loadPredictionsTime;
	}



	/**
	 * Sets the load predictions time.
	 *
	 * @param loadPredictionsTime the loadPredictionsTime to set
	 */
	public void setLoadPredictionsTime(long loadPredictionsTime) {
		this.loadPredictionsTime = loadPredictionsTime;
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
	 * Gets the after1h downstream active power.
	 *
	 * @return the after1hDownstreamActivePower
	 */
	public double getAfter1hDownstreamActivePower() {
		return after1hDownstreamActivePower;
	}

	/**
	 * Sets the after1h downstream active power.
	 *
	 * @param after1hDownstreamActivePower the after1hDownstreamActivePower to set
	 */
	public void setAfter1hDownstreamActivePower(double after1hDownstreamActivePower) {
		this.after1hDownstreamActivePower = after1hDownstreamActivePower;
	}

	/**
	 * Gets the after1h upstream active power.
	 *
	 * @return the after1hUpstreamActivePower
	 */
	public double getAfter1hUpstreamActivePower() {
		return after1hUpstreamActivePower;
	}

	/**
	 * Sets the after1h upstream active power.
	 *
	 * @param after1hUpstreamActivePower the after1hUpstreamActivePower to set
	 */
	public void setAfter1hUpstreamActivePower(double after1hUpstreamActivePower) {
		this.after1hUpstreamActivePower = after1hUpstreamActivePower;
	}

	/**
	 * Gets the after3h downstream active power.
	 *
	 * @return the after3hDownstreamActivePower
	 */
	public double getAfter3hDownstreamActivePower() {
		return after3hDownstreamActivePower;
	}

	/**
	 * Sets the after3h downstream active power.
	 *
	 * @param after3hDownstreamActivePower the after3hDownstreamActivePower to set
	 */
	public void setAfter3hDownstreamActivePower(double after3hDownstreamActivePower) {
		this.after3hDownstreamActivePower = after3hDownstreamActivePower;
	}

	/**
	 * Gets the after3h upstream active power.
	 *
	 * @return the after3hUpstreamActivePower
	 */
	public double getAfter3hUpstreamActivePower() {
		return after3hUpstreamActivePower;
	}

	/**
	 * Sets the after3h upstream active power.
	 *
	 * @param after3hUpstreamActivePower the after3hUpstreamActivePower to set
	 */
	public void setAfter3hUpstreamActivePower(double after3hUpstreamActivePower) {
		this.after3hUpstreamActivePower = after3hUpstreamActivePower;
	}

	/**
	 * Gets the after6h downstream active power.
	 *
	 * @return the after6hDownstreamActivePower
	 */
	public double getAfter6hDownstreamActivePower() {
		return after6hDownstreamActivePower;
	}

	/**
	 * Sets the after6h downstream active power.
	 *
	 * @param after6hDownstreamActivePower the after6hDownstreamActivePower to set
	 */
	public void setAfter6hDownstreamActivePower(double after6hDownstreamActivePower) {
		this.after6hDownstreamActivePower = after6hDownstreamActivePower;
	}

	/**
	 * Gets the after6h upstream active power.
	 *
	 * @return the after6hUpstreamActivePower
	 */
	public double getAfter6hUpstreamActivePower() {
		return after6hUpstreamActivePower;
	}

	/**
	 * Sets the after6h upstream active power.
	 *
	 * @param after6hUpstreamActivePower the after6hUpstreamActivePower to set
	 */
	public void setAfter6hUpstreamActivePower(double after6hUpstreamActivePower) {
		this.after6hUpstreamActivePower = after6hUpstreamActivePower;
	}

	/**
	 * Gets the after12h downstream active power.
	 *
	 * @return the after12hDownstreamActivePower
	 */
	public double getAfter12hDownstreamActivePower() {
		return after12hDownstreamActivePower;
	}

	/**
	 * Sets the after12h downstream active power.
	 *
	 * @param after12hDownstreamActivePower the after12hDownstreamActivePower to set
	 */
	public void setAfter12hDownstreamActivePower(
			double after12hDownstreamActivePower) {
		this.after12hDownstreamActivePower = after12hDownstreamActivePower;
	}

	/**
	 * Gets the after12h upstream active power.
	 *
	 * @return the after12hUpstreamActivePower
	 */
	public double getAfter12hUpstreamActivePower() {
		return after12hUpstreamActivePower;
	}

	/**
	 * Sets the after12h upstream active power.
	 *
	 * @param after12hUpstreamActivePower the after12hUpstreamActivePower to set
	 */
	public void setAfter12hUpstreamActivePower(double after12hUpstreamActivePower) {
		this.after12hUpstreamActivePower = after12hUpstreamActivePower;
	}

	/**
	 * Gets the after24h downstream active power.
	 *
	 * @return the after24hDownstreamActivePower
	 */
	public double getAfter24hDownstreamActivePower() {
		return after24hDownstreamActivePower;
	}

	/**
	 * Sets the after24h downstream active power.
	 *
	 * @param after24hDownstreamActivePower the after24hDownstreamActivePower to set
	 */
	public void setAfter24hDownstreamActivePower(
			double after24hDownstreamActivePower) {
		this.after24hDownstreamActivePower = after24hDownstreamActivePower;
	}

	/**
	 * Gets the after24h upstream active power.
	 *
	 * @return the after24hUpstreamActivePower
	 */
	public double getAfter24hUpstreamActivePower() {
		return after24hUpstreamActivePower;
	}

	/**
	 * Sets the after24h upstream active power.
	 *
	 * @param after24hUpstreamActivePower the after24hUpstreamActivePower to set
	 */
	public void setAfter24hUpstreamActivePower(double after24hUpstreamActivePower) {
		this.after24hUpstreamActivePower = after24hUpstreamActivePower;
	}






	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Predictions [meterId=" + meterId + ", loadPredictionsTime="
				+ loadPredictionsTime + ", idUser=" + idUser + ", currentTime="
				+ currentTime + ", after1hDownstreamActivePower="
				+ after1hDownstreamActivePower
				+ ", after1hUpstreamActivePower=" + after1hUpstreamActivePower
				+ ", after1hDownstreamReactivePower="
				+ after1hDownstreamReactivePower
				+ ", after1hUpstreamReactivePower="
				+ after1hUpstreamReactivePower
				+ ", after3hDownstreamActivePower="
				+ after3hDownstreamActivePower
				+ ", after3hUpstreamActivePower=" + after3hUpstreamActivePower
				+ ", after3hDownstreamReactivePower="
				+ after3hDownstreamReactivePower
				+ ", after3hUpstreamReactivePower="
				+ after3hUpstreamReactivePower
				+ ", after6hDownstreamActivePower="
				+ after6hDownstreamActivePower
				+ ", after6hUpstreamActivePower=" + after6hUpstreamActivePower
				+ ", after6hDownstreamReactivePower="
				+ after6hDownstreamReactivePower
				+ ", after6hUpstreamReactivePower="
				+ after6hUpstreamReactivePower
				+ ", after12hDownstreamActivePower="
				+ after12hDownstreamActivePower
				+ ", after12hUpstreamActivePower="
				+ after12hUpstreamActivePower
				+ ", after12hDownstreamReactivePower="
				+ after12hDownstreamReactivePower
				+ ", after12hUpstreamReactivePower="
				+ after12hUpstreamReactivePower
				+ ", after24hDownstreamActivePower="
				+ after24hDownstreamActivePower
				+ ", after24hUpstreamActivePower="
				+ after24hUpstreamActivePower
				+ ", after24hDownstreamReactivePower="
				+ after24hDownstreamReactivePower
				+ ", after24hUpstreamReactivePower="
				+ after24hUpstreamReactivePower + "]";
	}






	/**
	 * Instantiates a new predictions.
	 *
	 * @param meterId the meter id
	 * @param loadPredictionsTime the load predictions time
	 * @param idUser the id user
	 * @param currentTime the current time
	 * @param after1hDownstreamActivePower the after1h downstream active power
	 * @param after1hUpstreamActivePower the after1h upstream active power
	 * @param after1hDownstreamReactivePower the after1h downstream reactive power
	 * @param after1hUpstreamReactivePower the after1h upstream reactive power
	 * @param after3hDownstreamActivePower the after3h downstream active power
	 * @param after3hUpstreamActivePower the after3h upstream active power
	 * @param after3hDownstreamReactivePower the after3h downstream reactive power
	 * @param after3hUpstreamReactivePower the after3h upstream reactive power
	 * @param after6hDownstreamActivePower the after6h downstream active power
	 * @param after6hUpstreamActivePower the after6h upstream active power
	 * @param after6hDownstreamReactivePower the after6h downstream reactive power
	 * @param after6hUpstreamReactivePower the after6h upstream reactive power
	 * @param after12hDownstreamActivePower the after12h downstream active power
	 * @param after12hUpstreamActivePower the after12h upstream active power
	 * @param after12hDownstreamReactivePower the after12h downstream reactive power
	 * @param after12hUpstreamReactivePower the after12h upstream reactive power
	 * @param after24hDownstreamActivePower the after24h downstream active power
	 * @param after24hUpstreamActivePower the after24h upstream active power
	 * @param after24hDownstreamReactivePower the after24h downstream reactive power
	 * @param after24hUpstreamReactivePower the after24h upstream reactive power
	 */
	public Predictions(String meterId, long loadPredictionsTime, String idUser,
			long currentTime, double after1hDownstreamActivePower,
			double after1hUpstreamActivePower,
			double after1hDownstreamReactivePower,
			double after1hUpstreamReactivePower,
			double after3hDownstreamActivePower,
			double after3hUpstreamActivePower,
			double after3hDownstreamReactivePower,
			double after3hUpstreamReactivePower,
			double after6hDownstreamActivePower,
			double after6hUpstreamActivePower,
			double after6hDownstreamReactivePower,
			double after6hUpstreamReactivePower,
			double after12hDownstreamActivePower,
			double after12hUpstreamActivePower,
			double after12hDownstreamReactivePower,
			double after12hUpstreamReactivePower,
			double after24hDownstreamActivePower,
			double after24hUpstreamActivePower,
			double after24hDownstreamReactivePower,
			double after24hUpstreamReactivePower) {
		super();
		this.meterId = meterId;
		this.loadPredictionsTime = loadPredictionsTime;
		this.idUser = idUser;
		this.currentTime = currentTime;
		this.after1hDownstreamActivePower = after1hDownstreamActivePower;
		this.after1hUpstreamActivePower = after1hUpstreamActivePower;
		this.after1hDownstreamReactivePower = after1hDownstreamReactivePower;
		this.after1hUpstreamReactivePower = after1hUpstreamReactivePower;
		this.after3hDownstreamActivePower = after3hDownstreamActivePower;
		this.after3hUpstreamActivePower = after3hUpstreamActivePower;
		this.after3hDownstreamReactivePower = after3hDownstreamReactivePower;
		this.after3hUpstreamReactivePower = after3hUpstreamReactivePower;
		this.after6hDownstreamActivePower = after6hDownstreamActivePower;
		this.after6hUpstreamActivePower = after6hUpstreamActivePower;
		this.after6hDownstreamReactivePower = after6hDownstreamReactivePower;
		this.after6hUpstreamReactivePower = after6hUpstreamReactivePower;
		this.after12hDownstreamActivePower = after12hDownstreamActivePower;
		this.after12hUpstreamActivePower = after12hUpstreamActivePower;
		this.after12hDownstreamReactivePower = after12hDownstreamReactivePower;
		this.after12hUpstreamReactivePower = after12hUpstreamReactivePower;
		this.after24hDownstreamActivePower = after24hDownstreamActivePower;
		this.after24hUpstreamActivePower = after24hUpstreamActivePower;
		this.after24hDownstreamReactivePower = after24hDownstreamReactivePower;
		this.after24hUpstreamReactivePower = after24hUpstreamReactivePower;
	}






	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(after12hDownstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after12hDownstreamReactivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after12hUpstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after12hUpstreamReactivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after1hDownstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after1hDownstreamReactivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after1hUpstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after1hUpstreamReactivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after24hDownstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after24hDownstreamReactivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after24hUpstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after24hUpstreamReactivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after3hDownstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after3hDownstreamReactivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after3hUpstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after3hUpstreamReactivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after6hDownstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after6hDownstreamReactivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after6hUpstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(after6hUpstreamReactivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (currentTime ^ (currentTime >>> 32));
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		result = prime * result
				+ (int) (loadPredictionsTime ^ (loadPredictionsTime >>> 32));
		result = prime * result + ((meterId == null) ? 0 : meterId.hashCode());
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
		Predictions other = (Predictions) obj;
		if (Double.doubleToLongBits(after12hDownstreamActivePower) != Double
				.doubleToLongBits(other.after12hDownstreamActivePower))
			return false;
		if (Double.doubleToLongBits(after12hDownstreamReactivePower) != Double
				.doubleToLongBits(other.after12hDownstreamReactivePower))
			return false;
		if (Double.doubleToLongBits(after12hUpstreamActivePower) != Double
				.doubleToLongBits(other.after12hUpstreamActivePower))
			return false;
		if (Double.doubleToLongBits(after12hUpstreamReactivePower) != Double
				.doubleToLongBits(other.after12hUpstreamReactivePower))
			return false;
		if (Double.doubleToLongBits(after1hDownstreamActivePower) != Double
				.doubleToLongBits(other.after1hDownstreamActivePower))
			return false;
		if (Double.doubleToLongBits(after1hDownstreamReactivePower) != Double
				.doubleToLongBits(other.after1hDownstreamReactivePower))
			return false;
		if (Double.doubleToLongBits(after1hUpstreamActivePower) != Double
				.doubleToLongBits(other.after1hUpstreamActivePower))
			return false;
		if (Double.doubleToLongBits(after1hUpstreamReactivePower) != Double
				.doubleToLongBits(other.after1hUpstreamReactivePower))
			return false;
		if (Double.doubleToLongBits(after24hDownstreamActivePower) != Double
				.doubleToLongBits(other.after24hDownstreamActivePower))
			return false;
		if (Double.doubleToLongBits(after24hDownstreamReactivePower) != Double
				.doubleToLongBits(other.after24hDownstreamReactivePower))
			return false;
		if (Double.doubleToLongBits(after24hUpstreamActivePower) != Double
				.doubleToLongBits(other.after24hUpstreamActivePower))
			return false;
		if (Double.doubleToLongBits(after24hUpstreamReactivePower) != Double
				.doubleToLongBits(other.after24hUpstreamReactivePower))
			return false;
		if (Double.doubleToLongBits(after3hDownstreamActivePower) != Double
				.doubleToLongBits(other.after3hDownstreamActivePower))
			return false;
		if (Double.doubleToLongBits(after3hDownstreamReactivePower) != Double
				.doubleToLongBits(other.after3hDownstreamReactivePower))
			return false;
		if (Double.doubleToLongBits(after3hUpstreamActivePower) != Double
				.doubleToLongBits(other.after3hUpstreamActivePower))
			return false;
		if (Double.doubleToLongBits(after3hUpstreamReactivePower) != Double
				.doubleToLongBits(other.after3hUpstreamReactivePower))
			return false;
		if (Double.doubleToLongBits(after6hDownstreamActivePower) != Double
				.doubleToLongBits(other.after6hDownstreamActivePower))
			return false;
		if (Double.doubleToLongBits(after6hDownstreamReactivePower) != Double
				.doubleToLongBits(other.after6hDownstreamReactivePower))
			return false;
		if (Double.doubleToLongBits(after6hUpstreamActivePower) != Double
				.doubleToLongBits(other.after6hUpstreamActivePower))
			return false;
		if (Double.doubleToLongBits(after6hUpstreamReactivePower) != Double
				.doubleToLongBits(other.after6hUpstreamReactivePower))
			return false;
		if (currentTime != other.currentTime)
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		if (loadPredictionsTime != other.loadPredictionsTime)
			return false;
		if (meterId == null) {
			if (other.meterId != null)
				return false;
		} else if (!meterId.equals(other.meterId))
			return false;
		return true;
	}
	
	

}
