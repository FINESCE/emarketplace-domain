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
 * The Class LoadPrediction.
 */
@XmlRootElement(name="LoadPrediction")
@XmlAccessorType(XmlAccessType.FIELD)

public class LoadPrediction {
	
	/** The meter type. */
	@XmlElement(required=true)
	private String meterType;
	
	/** The current time. */
	@XmlElement(required=true)
	private long   currentTime;
	
	/** The after1h downstream. */
	@XmlElement(required=true)
	private Double after1hDownstream;

	/** The after1h upstream. */
	@XmlElement(required=true)
	private Double after1hUpstream;
	
	/** The after3h downstream. */
	@XmlElement(required=true)
	private Double after3hDownstream;

	/** The after3h upstream. */
	@XmlElement(required=true)
	private Double after3hUpstream;

	/** The after6h downstream. */
	@XmlElement(required=true)
	private Double after6hDownstream;

	/** The after6h upstream. */
	@XmlElement(required=true)
	private Double after6hUpstream;
	
	/** The after12h downstream. */
	@XmlElement(required=true)
	private Double after12hDownstream;

	/** The after12h upstream. */
	@XmlElement(required=true)
	private Double after12hUpstream;
	
	/** The after24h downstream. */
	@XmlElement(required=true)
	private Double after24hDownstream;

	/** The after24h upstream. */
	@XmlElement(required=true)
	private Double after24hUpstream;
	
	/**
	 * Gets the meter type.
	 *
	 * @return the meterType
	 */
	public String getMeterType() {
		return meterType;
	}

	/**
	 * Sets the meter type.
	 *
	 * @param meterType the meterType to set
	 */
	public void setMeterType(String meterType) {
		this.meterType = meterType;
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
	 * Gets the after1h downstream.
	 *
	 * @return the after1hDownstream
	 */
	public Double getAfter1hDownstream() {
		return after1hDownstream;
	}

	/**
	 * Sets the after1h downstream.
	 *
	 * @param after1hDownstream the after1hDownstream to set
	 */
	public void setAfter1hDownstream(Double after1hDownstream) {
		this.after1hDownstream = after1hDownstream;
	}

	/**
	 * Gets the after1h upstream.
	 *
	 * @return the after1hUpstream
	 */
	public Double getAfter1hUpstream() {
		return after1hUpstream;
	}

	/**
	 * Sets the after1h upstream.
	 *
	 * @param after1hUpstream the after1hUpstream to set
	 */
	public void setAfter1hUpstream(Double after1hUpstream) {
		this.after1hUpstream = after1hUpstream;
	}

	/**
	 * Gets the after3h downstream.
	 *
	 * @return the after3hDownstream
	 */
	public Double getAfter3hDownstream() {
		return after3hDownstream;
	}

	/**
	 * Sets the after3h downstream.
	 *
	 * @param after3hDownstream the after3hDownstream to set
	 */
	public void setAfter3hDownstream(Double after3hDownstream) {
		this.after3hDownstream = after3hDownstream;
	}

	/**
	 * Gets the after3h upstream.
	 *
	 * @return the after3hUpstream
	 */
	public Double getAfter3hUpstream() {
		return after3hUpstream;
	}

	/**
	 * Sets the after3h upstream.
	 *
	 * @param after3hUpstream the after3hUpstream to set
	 */
	public void setAfter3hUpstream(Double after3hUpstream) {
		this.after3hUpstream = after3hUpstream;
	}

	/**
	 * Gets the after6h downstream.
	 *
	 * @return the after6hDownstream
	 */
	public Double getAfter6hDownstream() {
		return after6hDownstream;
	}

	/**
	 * Sets the after6h downstream.
	 *
	 * @param after6hDownstream the after6hDownstream to set
	 */
	public void setAfter6hDownstream(Double after6hDownstream) {
		this.after6hDownstream = after6hDownstream;
	}

	/**
	 * Gets the after6h upstream.
	 *
	 * @return the after6hUpstream
	 */
	public Double getAfter6hUpstream() {
		return after6hUpstream;
	}

	/**
	 * Sets the after6h upstream.
	 *
	 * @param after6hUpstream the after6hUpstream to set
	 */
	public void setAfter6hUpstream(Double after6hUpstream) {
		this.after6hUpstream = after6hUpstream;
	}

	/**
	 * Gets the after12h downstream.
	 *
	 * @return the after12hDownstream
	 */
	public Double getAfter12hDownstream() {
		return after12hDownstream;
	}

	/**
	 * Sets the after12h downstream.
	 *
	 * @param after12hDownstream the after12hDownstream to set
	 */
	public void setAfter12hDownstream(Double after12hDownstream) {
		this.after12hDownstream = after12hDownstream;
	}

	/**
	 * Gets the after12h upstream.
	 *
	 * @return the after12hUpstream
	 */
	public Double getAfter12hUpstream() {
		return after12hUpstream;
	}

	/**
	 * Sets the after12h upstream.
	 *
	 * @param after12hUpstream the after12hUpstream to set
	 */
	public void setAfter12hUpstream(Double after12hUpstream) {
		this.after12hUpstream = after12hUpstream;
	}

	/**
	 * Gets the after24h downstream.
	 *
	 * @return the after24hDownstream
	 */
	public Double getAfter24hDownstream() {
		return after24hDownstream;
	}

	/**
	 * Sets the after24h downstream.
	 *
	 * @param after24hDownstream the after24hDownstream to set
	 */
	public void setAfter24hDownstream(Double after24hDownstream) {
		this.after24hDownstream = after24hDownstream;
	}

	/**
	 * Gets the after24h upstream.
	 *
	 * @return the after24hUpstream
	 */
	public Double getAfter24hUpstream() {
		return after24hUpstream;
	}

	/**
	 * Sets the after24h upstream.
	 *
	 * @param after24hUpstream the after24hUpstream to set
	 */
	public void setAfter24hUpstream(Double after24hUpstream) {
		this.after24hUpstream = after24hUpstream;
	}
}
