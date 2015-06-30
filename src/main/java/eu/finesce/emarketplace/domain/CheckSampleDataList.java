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
 * The Class CheckSampleDataList.
 */
@XmlRootElement(name = "checkSampleDataList")
@XmlAccessorType(XmlAccessType.FIELD)
public class CheckSampleDataList {
	
	/** The meter. */
	@XmlElement(required = true)
	private String meter;
	
	/** The load sample date. */
	@XmlElement(required = true)
	private long loadSampleDate;

	/** The sample number. */
	@XmlElement(required=true)
	private String sampleNumber;

	/**
	 * Gets the meter.
	 *
	 * @return the meter
	 */
	public String getMeter() {
		return meter;
	}

	/**
	 * Sets the meter.
	 *
	 * @param meter the meter to set
	 */
	public void setMeter(String meter) {
		this.meter = meter;
	}

	/**
	 * Gets the load sample date.
	 *
	 * @return the loadSampleDate
	 */
	public long getLoadSampleDate() {
		return loadSampleDate;
	}

	/**
	 * Sets the load sample date.
	 *
	 * @param loadSampleDate the loadSampleDate to set
	 */
	public void setLoadSampleDate(long loadSampleDate) {
		this.loadSampleDate = loadSampleDate;
	}

	/**
	 * Gets the sample number.
	 *
	 * @return the sampleNumber
	 */
	public String getSampleNumber() {
		return sampleNumber;
	}

	/**
	 * Sets the sample number.
	 *
	 * @param sampleNumber the sampleNumber to set
	 */
	public void setSampleNumber(String sampleNumber) {
		this.sampleNumber = sampleNumber;
	}

	
}
