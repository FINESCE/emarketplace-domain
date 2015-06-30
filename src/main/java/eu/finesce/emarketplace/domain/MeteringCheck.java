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
 * The Class MeteringCheck.
 */
@XmlRootElement(name = "meteringCheck")
@XmlAccessorType(XmlAccessType.FIELD)
public class MeteringCheck {

	/** The meter id. */
	@XmlAttribute(required=true)
	private String meterId;
	
	/** The metering missing. */
	@XmlElement(required = true)
	private String meteringMissing;
	

	/** The current time. */
	@XmlElement(required = true)
	private long currentTime;


	/** The sample date. */
	@XmlElement(required = true)
	private long sampleDate;
	
	/**
	 * Gets the sample date.
	 *
	 * @return the sample date
	 */
	public long getSampleDate() {
		return sampleDate;
	}


	/**
	 * Sets the sample date.
	 *
	 * @param sampleDate the new sample date
	 */
	public void setSampleDate(long sampleDate) {
		this.sampleDate = sampleDate;
	}


	/**
	 * Gets the metering missing.
	 *
	 * @return the metering missing
	 */
	public String getMeteringMissing() {
		return meteringMissing;
	}


	/**
	 * Sets the metering missing.
	 *
	 * @param meteringMissing the new metering missing
	 */
	public void setMeteringMissing(String meteringMissing) {
		this.meteringMissing = meteringMissing;
	}


	/**
	 * Gets the current time.
	 *
	 * @return the current time
	 */
	public long getCurrentTime() {
		return currentTime;
	}


	/**
	 * Sets the current time.
	 *
	 * @param currentTime the new current time
	 */
	public void setCurrentTime(long currentTime) {
		this.currentTime = currentTime;
	}





	/**
	 * Gets the meter id.
	 *
	 * @return the meter id
	 */
	public String getMeterId() {
		return meterId;
	}


	/**
	 * Sets the meter id.
	 *
	 * @param meterId the new meter id
	 */
	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}


	/**
	 * Instantiates a new metering check.
	 */
	public MeteringCheck() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * Instantiates a new metering check.
	 *
	 * @param meterId the meter id
	 * @param meteringMissing the metering missing
	 * @param currentTime the current time
	 */
	public MeteringCheck(String meterId, String meteringMissing,
			long currentTime) {
		super();
		this.meterId = meterId;
		this.meteringMissing = meteringMissing;
		this.currentTime = currentTime;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MeteringCheck [meterId=" + meterId + ", meteringMissing="
				+ meteringMissing + ", currentTime=" + currentTime + "]";
	}

	
}
