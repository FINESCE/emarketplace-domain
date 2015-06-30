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
 * The Class ContractInformation.
 */
@XmlRootElement(name="contractInformation")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContractInformation {
	

	/** The contract information id. */
	@XmlElement(required=true)
	private String contractInformationID;
	
	/** The cost of energy produced by ders. */
	@XmlElement(required=true)
	private double costOfEnergyProducedByDERS;
	
	/** The cost of system transmission power plants. */
	@XmlElement(required=true)
	private double costOfSystemTransmissionPowerPlants;
	
	/** The energy cost. */
	@XmlElement(required=true)
	private double energyCost;	
	
	/** The current time. */
	@XmlElement(required=true)
	private long currentTime;

	/** The validity start date. */
	@XmlElement(required=true)
	private long validityStartDate;
	
	/** The validity end date. */
	@XmlElement(required=true)
	private long validityEndDate;

	/**
	 * Gets the contract information id.
	 *
	 * @return the contractInformationID
	 */
	public String getContractInformationID() {
		return contractInformationID;
	}

	/**
	 * Sets the contract information id.
	 *
	 * @param contractInformationID the contractInformationID to set
	 */
	public void setContractInformationID(String contractInformationID) {
		this.contractInformationID = contractInformationID;
	}

	/**
	 * Gets the cost of energy produced by ders.
	 *
	 * @return the costOfEnergyProducedByDERS
	 */
	public double getCostOfEnergyProducedByDERS() {
		return costOfEnergyProducedByDERS;
	}

	/**
	 * Sets the cost of energy produced by ders.
	 *
	 * @param costOfEnergyProducedByDERS the costOfEnergyProducedByDERS to set
	 */
	public void setCostOfEnergyProducedByDERS(double costOfEnergyProducedByDERS) {
		this.costOfEnergyProducedByDERS = costOfEnergyProducedByDERS;
	}

	/**
	 * Gets the cost of system transmission power plants.
	 *
	 * @return the costOfSystemTransmissionPowerPlants
	 */
	public double getCostOfSystemTransmissionPowerPlants() {
		return costOfSystemTransmissionPowerPlants;
	}

	/**
	 * Sets the cost of system transmission power plants.
	 *
	 * @param costOfSystemTransmissionPowerPlants the costOfSystemTransmissionPowerPlants to set
	 */
	public void setCostOfSystemTransmissionPowerPlants(
			double costOfSystemTransmissionPowerPlants) {
		this.costOfSystemTransmissionPowerPlants = costOfSystemTransmissionPowerPlants;
	}

	/**
	 * Gets the energy cost.
	 *
	 * @return the energyCost
	 */
	public double getEnergyCost() {
		return energyCost;
	}

	/**
	 * Sets the energy cost.
	 *
	 * @param energyCost the energyCost to set
	 */
	public void setEnergyCost(double energyCost) {
		this.energyCost = energyCost;
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
	 * Gets the validity start date.
	 *
	 * @return the validityStartDate
	 */
	public long getValidityStartDate() {
		return validityStartDate;
	}

	/**
	 * Sets the validity start date.
	 *
	 * @param validityStartDate the validityStartDate to set
	 */
	public void setValidityStartDate(long validityStartDate) {
		this.validityStartDate = validityStartDate;
	}

	/**
	 * Gets the validity end date.
	 *
	 * @return the validityEndDate
	 */
	public long getValidityEndDate() {
		return validityEndDate;
	}

	/**
	 * Sets the validity end date.
	 *
	 * @param validityEndDate the validityEndDate to set
	 */
	public void setValidityEndDate(long validityEndDate) {
		this.validityEndDate = validityEndDate;
	}

	/**
	 * Instantiates a new contract information.
	 */
	public ContractInformation() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((contractInformationID == null) ? 0 : contractInformationID
						.hashCode());
		long temp;
		temp = Double.doubleToLongBits(costOfEnergyProducedByDERS);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(costOfSystemTransmissionPowerPlants);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (currentTime ^ (currentTime >>> 32));
		temp = Double.doubleToLongBits(energyCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result
				+ (int) (validityEndDate ^ (validityEndDate >>> 32));
		result = prime * result
				+ (int) (validityStartDate ^ (validityStartDate >>> 32));
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
		ContractInformation other = (ContractInformation) obj;
		if (contractInformationID == null) {
			if (other.contractInformationID != null)
				return false;
		} else if (!contractInformationID.equals(other.contractInformationID))
			return false;
		if (Double.doubleToLongBits(costOfEnergyProducedByDERS) != Double
				.doubleToLongBits(other.costOfEnergyProducedByDERS))
			return false;
		if (Double.doubleToLongBits(costOfSystemTransmissionPowerPlants) != Double
				.doubleToLongBits(other.costOfSystemTransmissionPowerPlants))
			return false;
		if (currentTime != other.currentTime)
			return false;
		if (Double.doubleToLongBits(energyCost) != Double
				.doubleToLongBits(other.energyCost))
			return false;
		if (validityEndDate != other.validityEndDate)
			return false;
		if (validityStartDate != other.validityStartDate)
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContractInformation [contractInformationID="
				+ contractInformationID + ", costOfEnergyProducedByDERS="
				+ costOfEnergyProducedByDERS
				+ ", costOfSystemTransmissionPowerPlants="
				+ costOfSystemTransmissionPowerPlants + ", energyCost="
				+ energyCost + ", currentTime=" + currentTime
				+ ", validityStartDate=" + validityStartDate
				+ ", validityEndDate=" + validityEndDate + "]";
	}

	/**
	 * Instantiates a new contract information.
	 *
	 * @param contractInformationID the contract information id
	 * @param costOfEnergyProducedByDERS the cost of energy produced by ders
	 * @param costOfSystemTransmissionPowerPlants the cost of system transmission power plants
	 * @param energyCost the energy cost
	 * @param currentTime the current time
	 * @param validityStartDate the validity start date
	 * @param validityEndDate the validity end date
	 */
	public ContractInformation(String contractInformationID,
			double costOfEnergyProducedByDERS,
			double costOfSystemTransmissionPowerPlants, double energyCost,
			long currentTime, long validityStartDate, long validityEndDate) {
		super();
		this.contractInformationID = contractInformationID;
		this.costOfEnergyProducedByDERS = costOfEnergyProducedByDERS;
		this.costOfSystemTransmissionPowerPlants = costOfSystemTransmissionPowerPlants;
		this.energyCost = energyCost;
		this.currentTime = currentTime;
		this.validityStartDate = validityStartDate;
		this.validityEndDate = validityEndDate;
	}

	
}
