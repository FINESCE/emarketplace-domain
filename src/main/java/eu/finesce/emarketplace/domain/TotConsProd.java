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
 * The Class TotConsProd.
 */
@XmlRootElement(name="totalConsProd")
@XmlAccessorType(XmlAccessType.FIELD)

public class TotConsProd {
	
	/** The total cons prod id. */
	@XmlAttribute(required=true)
	private String totalConsProdID;
	
	/** The current time. */
	@XmlElement(required=true)
	private long   currentTime;
	
	/** The total consumption. */
	@XmlElement(required=true)
	private double totalConsumption;
	
	/** The total production. */
	@XmlElement(required=true)
	private double totalProduction;
	
	/** The total consumption ss. */
	@XmlElement(required=true)
	private double totalConsumptionSS;
	
	/** The total production ss. */
	@XmlElement(required=true)
	private double totalProductionSS;

	/**
	 * Gets the total cons prod id.
	 *
	 * @return the TotalConsProdID
	 */
	public String getTotalConsProdID() {
		return totalConsProdID;
	}

	/**
	 * Sets the total cons prod id.
	 *
	 * @param totalConsProdID the totalConsProdID to set
	 */
	public void setTotalConsProdID(String totalConsProdID) {
		this.totalConsProdID = totalConsProdID;
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
	 * Gets the total consumption.
	 *
	 * @return the totalConsumption
	 */
	public double getTotalConsumption() {
		return totalConsumption;
	}

	/**
	 * Sets the total consumption.
	 *
	 * @param totalConsumption the totalConsumption to set
	 */
	public void setTotalConsumption(double totalConsumption) {
		this.totalConsumption = totalConsumption;
	}

	/**
	 * Gets the total production.
	 *
	 * @return the totalProduction
	 */
	public double getTotalProduction() {
		return totalProduction;
	}

	/**
	 * Sets the total production.
	 *
	 * @param totalProduction the totalProduction to set
	 */
	public void setTotalProduction(double totalProduction) {
		this.totalProduction = totalProduction;
	}

	/**
	 * Gets the total consumption ss.
	 *
	 * @return the totalConsumptionSS
	 */
	public double getTotalConsumptionSS() {
		return totalConsumptionSS;
	}

	/**
	 * Sets the total consumption ss.
	 *
	 * @param totalConsumptionSS the totalConsumptionSS to set
	 */
	public void setTotalConsumptionSS(double totalConsumptionSS) {
		this.totalConsumptionSS = totalConsumptionSS;
	}

	/**
	 * Gets the total production ss.
	 *
	 * @return the totalProductionSS
	 */
	public double getTotalProductionSS() {
		return totalProductionSS;
	}

	/**
	 * Sets the total production ss.
	 *
	 * @param totalProductionSS the totalProductionSS to set
	 */
	public void setTotalProductionSS(double totalProductionSS) {
		this.totalProductionSS = totalProductionSS;
	}

	
}
