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

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * The Class HistMeterData.
 */
@XmlRootElement(name = "histMeterData")
@XmlAccessorType(XmlAccessType.FIELD)
public class HistMeterData {

//	Smart Meters Type = all; single meter; commercial; industrial
	/** The sm type. */
@XmlElement(required = true)
	private String smType;

// 	Horizon Data Meter = 24H / 12H / 6H / 3H / 1H
	/** The horizon meter. */
@XmlElement(required = true)
	private String horizonMeter;
	
	/** The current time. */
	@XmlElement(required = true)
	private long currentTime;

    
	/** The meterdata list. */
	@XmlElement(name="MeterDataList", type=HistMeterDataList.class)
    List<HistMeterDataList> meterdataList;


	/**
	 * Instantiates a new hist meter data.
	 */
	public	HistMeterData(){};

	/**
	 * Gets the sm type.
	 *
	 * @return the sm type
	 */
	public String getSmType() {
		return smType;
	}

	/**
	 * Sets the sm type.
	 *
	 * @param smType the new sm type
	 */
	public void setSmType(String smType) {
		this.smType = smType;
	}

	/**
	 * Gets the horizon meter.
	 *
	 * @return the horizon meter
	 */
	public String getHorizonMeter() {
		return horizonMeter;
	}

	/**
	 * Sets the horizon load.
	 *
	 * @param horizonMeter the new horizon load
	 */
	public void setHorizonLoad(String horizonMeter) {
		this.horizonMeter = horizonMeter;
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
	 * Gets the meterdata list.
	 *
	 * @return the meterdata list
	 */
	public List<HistMeterDataList> getMeterdataList() {
		return meterdataList;
	}

	
	/**
	 * Sets the meterdata list.
	 *
	 * @param meterdataList the new meterdata list
	 */
	public void setMeterdataList(List<HistMeterDataList> meterdataList) {
		this.meterdataList = meterdataList;
	}

	
	
}
