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
 * The Class HistMeterDataList.
 */
@XmlRootElement(name = "histMeterDataList")
@XmlAccessorType(XmlAccessType.FIELD)
public class HistMeterDataList {
	
	/** The meter date. */
	@XmlElement(required = true)
	private long meterDate;

	/** The upstream. */
	@XmlElement(required = true)
	private double upstream;

	/** The downstream. */
	@XmlElement(required = true)
	private double downstream;

	/** The rp_q1. */
	@XmlElement(required = true)
	private double rp_q1;

	/** The rp_q2. */
	@XmlElement(required = true)
	private double rp_q2;
	
	/** The rp_q3. */
	@XmlElement(required = true)
	private double rp_q3;
	
	/** The rp_q4. */
	@XmlElement(required = true)
	private double rp_q4;

	/** The meter id. */
	@XmlElement(required = true)
	private String meterID;
	
	/**
	 * Instantiates a new hist meter data list.
	 */
	public	HistMeterDataList(){}

	/**
	 * Gets the meter date.
	 *
	 * @return the meterDate
	 */
	public long getMeterDate() {
		return meterDate;
	}

	/**
	 * Sets the meter date.
	 *
	 * @param meterDate the meterDate to set
	 */
	public void setMeterDate(long meterDate) {
		this.meterDate = meterDate;
	}

	/**
	 * Gets the upstream.
	 *
	 * @return the upstream
	 */
	public double getUpstream() {
		return upstream;
	}

	/**
	 * Sets the upstream.
	 *
	 * @param upstream the upstream to set
	 */
	public void setUpstream(double upstream) {
		this.upstream = upstream;
	}

	/**
	 * Gets the downstream.
	 *
	 * @return the downstream
	 */
	public double getDownstream() {
		return downstream;
	}

	/**
	 * Sets the downstream.
	 *
	 * @param downstream the downstream to set
	 */
	public void setDownstream(double downstream) {
		this.downstream = downstream;
	}

	/**
	 * Gets the rp_q1.
	 *
	 * @return the rp_q1
	 */
	public double getRp_q1() {
		return rp_q1;
	}

	/**
	 * Sets the rp_q1.
	 *
	 * @param rp_q1 the rp_q1 to set
	 */
	public void setRp_q1(double rp_q1) {
		this.rp_q1 = rp_q1;
	}

	/**
	 * Gets the rp_q2.
	 *
	 * @return the rp_q2
	 */
	public double getRp_q2() {
		return rp_q2;
	}

	/**
	 * Sets the rp_q2.
	 *
	 * @param rp_q2 the rp_q2 to set
	 */
	public void setRp_q2(double rp_q2) {
		this.rp_q2 = rp_q2;
	}

	/**
	 * Gets the rp_q3.
	 *
	 * @return the rp_q3
	 */
	public double getRp_q3() {
		return rp_q3;
	}

	/**
	 * Sets the rp_q3.
	 *
	 * @param rp_q3 the rp_q3 to set
	 */
	public void setRp_q3(double rp_q3) {
		this.rp_q3 = rp_q3;
	}

	/**
	 * Gets the rp_q4.
	 *
	 * @return the rp_q4
	 */
	public double getRp_q4() {
		return rp_q4;
	}

	/**
	 * Sets the rp_q4.
	 *
	 * @param rp_q4 the rp_q4 to set
	 */
	public void setRp_q4(double rp_q4) {
		this.rp_q4 = rp_q4;
	}
	

	/**
	 * Gets the meter id.
	 *
	 * @return the meterID
	 */
	public String getMeterID() {
		return meterID;
	}

	/**
	 * Sets the meter id.
	 *
	 * @param meterID the meterID to set
	 */
	public void setMeterID(String meterID) {
		this.meterID = meterID;
	}

	
}
