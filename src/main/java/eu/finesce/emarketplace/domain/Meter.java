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
 * The Class Meter.
 */
@XmlRootElement(name="meter")
@XmlAccessorType(XmlAccessType.FIELD)
public class Meter {

	/** The meter id. */
	@XmlAttribute(required=true)
	private String meterId;
	
	/** The is concentrator. */
	@XmlAttribute(required=true)
	private boolean isConcentrator;
	
	/** The current time. */
	@XmlElement(required=true)
	private long currentTime;
	
	/** The upsteam active power. */
	@XmlElement(required=true)
	private double upsteamActivePower;
	
	/** The downstream active power. */
	@XmlElement(required=true)
	private double downstreamActivePower;
	
	/** The reactive power q1. 
	 * */
	@XmlElement(required=true)
	private double reactivePowerQ1;
	
	/** The reactive power q2. */
	@XmlElement(required=true)
	private double reactivePowerQ2;
	
	/** The reactive power q3. */
	@XmlElement(required=true)
	private double reactivePowerQ3;
	
	/** The reactive power q4. */
	@XmlElement(required=true)
	private double reactivePowerQ4;
	
	/**
	 * Instantiates a new meter.
	 */
	public	Meter(){};
	
	/**
	 * Instantiates a new meter.
	 *
	 * @param meterId the meter id
	 * @param isConcentrator the is concentrator
	 */
	public Meter(String meterId, boolean isConcentrator){
		this.setMeterId(meterId);
		this.setConcentrator(isConcentrator);
	}
	
	/**
	 * Instantiates a new meter.
	 *
	 * @param meterId the meter id
	 * @param isConcentrator the is concentrator
	 * @param currentTime the current time
	 * @param upsteamActivePower the upsteam active power
	 * @param downstreamActivePower the downstream active power
	 * @param reactivePowerQ1 the reactive power q1
	 * @param reactivePowerQ2 the reactive power q2
	 * @param reactivePowerQ3 the reactive power q3
	 * @param reactivePowerQ4 the reactive power q4
	 */
	public Meter(String meterId, boolean isConcentrator, long currentTime,
			double upsteamActivePower, double downstreamActivePower,
			double reactivePowerQ1, double reactivePowerQ2,
			double reactivePowerQ3, double reactivePowerQ4) {
		super();
		this.meterId = meterId;
		this.isConcentrator = isConcentrator;
		this.currentTime = currentTime;
		this.upsteamActivePower = upsteamActivePower;
		this.downstreamActivePower = downstreamActivePower;
		this.reactivePowerQ1 = reactivePowerQ1;
		this.reactivePowerQ2 = reactivePowerQ2;
		this.reactivePowerQ3 = reactivePowerQ3;
		this.reactivePowerQ4 = reactivePowerQ4;
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
	 * Checks if is concentrator.
	 *
	 * @return the isConcentrator
	 */
	public boolean isConcentrator() {
		return isConcentrator;
	}

	/**
	 * Sets the concentrator.
	 *
	 * @param isConcentrator the isConcentrator to set
	 */
	public void setConcentrator(boolean isConcentrator) {
		this.isConcentrator = isConcentrator;
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
	 * Gets the upsteam active power.
	 *
	 * @return the upsteamActivePower
	 */
	public double getUpsteamActivePower() {
		return upsteamActivePower;
	}

	/**
	 * Sets the upsteam active power.
	 *
	 * @param upsteamActivePower the upsteamActivePower to set
	 */
	public void setUpsteamActivePower(double upsteamActivePower) {
		this.upsteamActivePower = upsteamActivePower;
	}

	/**
	 * Gets the downstream active power.
	 *
	 * @return the downstreamActivePower
	 */
	public double getDownstreamActivePower() {
		return downstreamActivePower;
	}

	/**
	 * Sets the downstream active power.
	 *
	 * @param downstreamActivePower the downstreamActivePower to set
	 */
	public void setDownstreamActivePower(double downstreamActivePower) {
		this.downstreamActivePower = downstreamActivePower;
	}

	/**
	 * Gets the reactive power q1.
	 *
	 * @return the reactivePowerQ1
	 */
	public double getReactivePowerQ1() {
		return reactivePowerQ1;
	}

	/**
	 * Sets the reactive power q1.
	 *
	 * @param reactivePowerQ1 the reactivePowerQ1 to set
	 */
	public void setReactivePowerQ1(double reactivePowerQ1) {
		this.reactivePowerQ1 = reactivePowerQ1;
	}

	/**
	 * Gets the reactive power q2.
	 *
	 * @return the reactivePowerQ2
	 */
	public double getReactivePowerQ2() {
		return reactivePowerQ2;
	}

	/**
	 * Sets the reactive power q2.
	 *
	 * @param reactivePowerQ2 the reactivePowerQ2 to set
	 */
	public void setReactivePowerQ2(double reactivePowerQ2) {
		this.reactivePowerQ2 = reactivePowerQ2;
	}

	/**
	 * Gets the reactive power q3.
	 *
	 * @return the reactivePowerQ3
	 */
	public double getReactivePowerQ3() {
		return reactivePowerQ3;
	}

	/**
	 * Sets the reactive power q3.
	 *
	 * @param reactivePowerQ3 the reactivePowerQ3 to set
	 */
	public void setReactivePowerQ3(double reactivePowerQ3) {
		this.reactivePowerQ3 = reactivePowerQ3;
	}

	/**
	 * Gets the reactive power q4.
	 *
	 * @return the reactivePowerQ4
	 */
	public double getReactivePowerQ4() {
		return reactivePowerQ4;
	}

	/**
	 * Sets the reactive power q4.
	 *
	 * @param reactivePowerQ4 the reactivePowerQ4 to set
	 */
	public void setReactivePowerQ4(double reactivePowerQ4) {
		this.reactivePowerQ4 = reactivePowerQ4;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (currentTime ^ (currentTime >>> 32));
		long temp;
		temp = Double.doubleToLongBits(downstreamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (isConcentrator ? 1231 : 1237);
		result = prime * result + ((meterId == null) ? 0 : meterId.hashCode());
		temp = Double.doubleToLongBits(reactivePowerQ1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(reactivePowerQ2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(reactivePowerQ3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(reactivePowerQ4);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(upsteamActivePower);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (!(obj instanceof Meter)) {
			return false;
		}
		Meter other = (Meter) obj;
		if (currentTime != other.currentTime) {
			return false;
		}
		if (Double.doubleToLongBits(downstreamActivePower) != Double
				.doubleToLongBits(other.downstreamActivePower)) {
			return false;
		}
		if (isConcentrator != other.isConcentrator) {
			return false;
		}
		if (meterId == null) {
			if (other.meterId != null) {
				return false;
			}
		} else if (!meterId.equals(other.meterId)) {
			return false;
		}
		if (Double.doubleToLongBits(reactivePowerQ1) != Double
				.doubleToLongBits(other.reactivePowerQ1)) {
			return false;
		}
		if (Double.doubleToLongBits(reactivePowerQ2) != Double
				.doubleToLongBits(other.reactivePowerQ2)) {
			return false;
		}
		if (Double.doubleToLongBits(reactivePowerQ3) != Double
				.doubleToLongBits(other.reactivePowerQ3)) {
			return false;
		}
		if (Double.doubleToLongBits(reactivePowerQ4) != Double
				.doubleToLongBits(other.reactivePowerQ4)) {
			return false;
		}
		if (Double.doubleToLongBits(upsteamActivePower) != Double
				.doubleToLongBits(other.upsteamActivePower)) {
			return false;
		}
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Meter [meterId=" + meterId + ", isConcentrator="
				+ isConcentrator + ", currentTime=" + currentTime
				+ ", upsteamActivePower=" + upsteamActivePower
				+ ", downstreamActivePower=" + downstreamActivePower
				+ ", reactivePowerQ1=" + reactivePowerQ1 + ", reactivePowerQ2="
				+ reactivePowerQ2 + ", reactivePowerQ3=" + reactivePowerQ3
				+ ", reactivePowerQ4=" + reactivePowerQ4 + "]";
	}


}
