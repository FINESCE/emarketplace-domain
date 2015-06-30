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
 * The Class IncentivePlanList.
 */
@XmlRootElement(name = "IncentivePlanList")
@XmlAccessorType(XmlAccessType.FIELD)
public class IncentivePlanList {
	
	/** The ip id. */
	@XmlElement(required = true)
	private String ipId;

	/** The current time. */
	@XmlElement(required=true)
	private long currentTime;

	/** The customerId. */
	@XmlElement(required = true)
	private String customerId;

	/** The meterId. */
	@XmlElement(required = true)
	private String meterId;

	/** The customerProfileObjectName. */
	@XmlElement(required = true)
	private String customerProfileObjectName;

	/** The irpId. */
	@XmlElement(required = true)
	private String irpId;

	/** The ip1_target. */
	@XmlElement(required = true)
	private String ip1_target;
	
	/** The ip1_type. */
	@XmlElement(required = true)
	private String ip1_type;
	
	/** The ip1_value. */
	@XmlElement(required = true)
	private String ip1_value;
	
	/** The ip1_start. */
	@XmlElement(required=true)
	private long ip1_start;

	/** The ip1_end. */
	@XmlElement(required=true)
	private long ip1_end;

	/** The ip1_offer. */
	@XmlElement(required=true)
	private String ip1_offer;
	
	/** The ip2_target. */
	@XmlElement(required = true)
	private String ip2_target;
	
	/** The ip2_type. */
	@XmlElement(required = true)
	private String ip2_type;
	
	/** The ip2_value. */
	@XmlElement(required = true)
	private String ip2_value;
	
	/** The ip2_start. */
	@XmlElement(required=true)
	private long ip2_start;

	/** The ip2_end. */
	@XmlElement(required=true)
	private long ip2_end;

	/** The ip2_offer. */
	@XmlElement(required=true)
	private String ip2_offer;
	
	/** The ip3_target. */
	@XmlElement(required = true)
	private String ip3_target;
	
	/** The ip3_type. */
	@XmlElement(required = true)
	private String ip3_type;
	
	/** The ip3_value. */
	@XmlElement(required = true)
	private String ip3_value;
	
	/** The ip3_start. */
	@XmlElement(required=true)
	private long ip3_start;

	/** The ip3_end. */
	@XmlElement(required=true)
	private long ip3_end;

	/** The ip3_offer. */
	@XmlElement(required=true)
	private String ip3_offer;
	
	/** The ip4_target. */
	@XmlElement(required = true)
	private String ip4_target;
	
	/** The ip4_type. */
	@XmlElement(required = true)
	private String ip4_type;
	
	/** The ip4_value. */
	@XmlElement(required = true)
	private String ip4_value;
	
	/** The ip4_start. */
	@XmlElement(required=true)
	private long ip4_start;

	/** The ip4_end. */
	@XmlElement(required=true)
	private long ip4_end;

	/** The ip4_offer. */
	@XmlElement(required=true)
	private String ip4_offer;
	
	/** The ip5_target. */
	@XmlElement(required = true)
	private String ip5_target;
	
	/** The ip5_type. */
	@XmlElement(required = true)
	private String ip5_type;
	
	/** The ip5_value. */
	@XmlElement(required = true)
	private String ip5_value;
	
	/** The ip5_start. */
	@XmlElement(required=true)
	private long ip5_start;

	/** The ip5_end. */
	@XmlElement(required=true)
	private long ip5_end;
	
	/** The ip5_offer. */
	@XmlElement(required=true)
	private String ip5_offer;
	
	/** The costOfEnergyProducedByDERS. */
	@XmlElement(required = true)
	private double costOfEnergyProducedByDERS;

	/** The costOfSystemTrasmissionPowerPlants. */
	@XmlElement(required = true)
	private double costOfSystemTrasmissionPowerPlants;

	/** The energyCost. */
	@XmlElement(required = true)
	private double energyCost;

	/** The state. */
	@XmlElement(required = true)
	private String state;

	/** The noteRetailer. */
	@XmlElement(required = true)
	private String noteRetailer;

	/** The noteMarketRegulator. */
	@XmlElement(required = true)
	private String noteMarketRegulator;

	/** The author. */
	@XmlElement(required = true)
	private String author;
	
	/** The author_email. */
	@XmlElement(required = true)
	private String author_email;

	/**
	 * Gets the ip id.
	 *
	 * @return the ipId
	 */
	public String getIpId() {
		return ipId;
	}

	/**
	 * Sets the ip id.
	 *
	 * @param ipId the ipId to set
	 */
	public void setIpId(String ipId) {
		this.ipId = ipId;
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
	 * Gets the customer id.
	 *
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}

	/**
	 * Sets the customer id.
	 *
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
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
	 * Gets the customer profile object name.
	 *
	 * @return the customerProfileObjectName
	 */
	public String getCustomerProfileObjectName() {
		return customerProfileObjectName;
	}

	/**
	 * Sets the customer profile object name.
	 *
	 * @param customerProfileObjectName the customerProfileObjectName to set
	 */
	public void setCustomerProfileObjectName(String customerProfileObjectName) {
		this.customerProfileObjectName = customerProfileObjectName;
	}

	/**
	 * Gets the irp id.
	 *
	 * @return the irpId
	 */
	public String getIrpId() {
		return irpId;
	}

	/**
	 * Sets the irp id.
	 *
	 * @param irpId the irpId to set
	 */
	public void setIrpId(String irpId) {
		this.irpId = irpId;
	}

	/**
	 * Gets the ip1_target.
	 *
	 * @return the ip1_target
	 */
	public String getIp1_target() {
		return ip1_target;
	}

	/**
	 * Sets the ip1_target.
	 *
	 * @param ip1_target the ip1_target to set
	 */
	public void setIp1_target(String ip1_target) {
		this.ip1_target = ip1_target;
	}

	/**
	 * Gets the ip1_type.
	 *
	 * @return the ip1_type
	 */
	public String getIp1_type() {
		return ip1_type;
	}

	/**
	 * Sets the ip1_type.
	 *
	 * @param ip1_type the ip1_type to set
	 */
	public void setIp1_type(String ip1_type) {
		this.ip1_type = ip1_type;
	}

	/**
	 * Gets the ip1_value.
	 *
	 * @return the ip1_value
	 */
	public String getIp1_value() {
		return ip1_value;
	}

	/**
	 * Sets the ip1_value.
	 *
	 * @param ip1_value the ip1_value to set
	 */
	public void setIp1_value(String ip1_value) {
		this.ip1_value = ip1_value;
	}

	/**
	 * Gets the ip1_start.
	 *
	 * @return the ip1_start
	 */
	public long getIp1_start() {
		return ip1_start;
	}

	/**
	 * Sets the ip1_start.
	 *
	 * @param ip1_start the ip1_start to set
	 */
	public void setIp1_start(long ip1_start) {
		this.ip1_start = ip1_start;
	}

	/**
	 * Gets the ip1_end.
	 *
	 * @return the ip1_end
	 */
	public long getIp1_end() {
		return ip1_end;
	}

	/**
	 * Sets the ip1_end.
	 *
	 * @param ip1_end the ip1_end to set
	 */
	public void setIp1_end(long ip1_end) {
		this.ip1_end = ip1_end;
	}

	/**
	 * Gets the ip2_target.
	 *
	 * @return the ip2_target
	 */
	public String getIp2_target() {
		return ip2_target;
	}

	/**
	 * Sets the ip2_target.
	 *
	 * @param ip2_target the ip2_target to set
	 */
	public void setIp2_target(String ip2_target) {
		this.ip2_target = ip2_target;
	}

	/**
	 * Gets the ip2_type.
	 *
	 * @return the ip2_type
	 */
	public String getIp2_type() {
		return ip2_type;
	}

	/**
	 * Sets the ip2_type.
	 *
	 * @param ip2_type the ip2_type to set
	 */
	public void setIp2_type(String ip2_type) {
		this.ip2_type = ip2_type;
	}

	/**
	 * Gets the ip2_value.
	 *
	 * @return the ip2_value
	 */
	public String getIp2_value() {
		return ip2_value;
	}

	/**
	 * Sets the ip2_value.
	 *
	 * @param ip2_value the ip2_value to set
	 */
	public void setIp2_value(String ip2_value) {
		this.ip2_value = ip2_value;
	}

	/**
	 * Gets the ip2_start.
	 *
	 * @return the ip2_start
	 */
	public long getIp2_start() {
		return ip2_start;
	}

	/**
	 * Sets the ip2_start.
	 *
	 * @param ip2_start the ip2_start to set
	 */
	public void setIp2_start(long ip2_start) {
		this.ip2_start = ip2_start;
	}

	/**
	 * Gets the ip2_end.
	 *
	 * @return the ip2_end
	 */
	public long getIp2_end() {
		return ip2_end;
	}

	/**
	 * Sets the ip2_end.
	 *
	 * @param ip2_end the ip2_end to set
	 */
	public void setIp2_end(long ip2_end) {
		this.ip2_end = ip2_end;
	}

	/**
	 * Gets the ip3_target.
	 *
	 * @return the ip3_target
	 */
	public String getIp3_target() {
		return ip3_target;
	}

	/**
	 * Sets the ip3_target.
	 *
	 * @param ip3_target the ip3_target to set
	 */
	public void setIp3_target(String ip3_target) {
		this.ip3_target = ip3_target;
	}

	/**
	 * Gets the ip3_type.
	 *
	 * @return the ip3_type
	 */
	public String getIp3_type() {
		return ip3_type;
	}

	/**
	 * Sets the ip3_type.
	 *
	 * @param ip3_type the ip3_type to set
	 */
	public void setIp3_type(String ip3_type) {
		this.ip3_type = ip3_type;
	}

	/**
	 * Gets the ip3_value.
	 *
	 * @return the ip3_value
	 */
	public String getIp3_value() {
		return ip3_value;
	}

	/**
	 * Sets the ip3_value.
	 *
	 * @param ip3_value the ip3_value to set
	 */
	public void setIp3_value(String ip3_value) {
		this.ip3_value = ip3_value;
	}

	/**
	 * Gets the ip3_start.
	 *
	 * @return the ip3_start
	 */
	public long getIp3_start() {
		return ip3_start;
	}

	/**
	 * Sets the ip3_start.
	 *
	 * @param ip3_start the ip3_start to set
	 */
	public void setIp3_start(long ip3_start) {
		this.ip3_start = ip3_start;
	}

	/**
	 * Gets the ip3_end.
	 *
	 * @return the ip3_end
	 */
	public long getIp3_end() {
		return ip3_end;
	}

	/**
	 * Sets the ip3_end.
	 *
	 * @param ip3_end the ip3_end to set
	 */
	public void setIp3_end(long ip3_end) {
		this.ip3_end = ip3_end;
	}

	/**
	 * Gets the ip4_target.
	 *
	 * @return the ip4_target
	 */
	public String getIp4_target() {
		return ip4_target;
	}

	/**
	 * Sets the ip4_target.
	 *
	 * @param ip4_target the ip4_target to set
	 */
	public void setIp4_target(String ip4_target) {
		this.ip4_target = ip4_target;
	}

	/**
	 * Gets the ip4_type.
	 *
	 * @return the ip4_type
	 */
	public String getIp4_type() {
		return ip4_type;
	}

	/**
	 * Sets the ip4_type.
	 *
	 * @param ip4_type the ip4_type to set
	 */
	public void setIp4_type(String ip4_type) {
		this.ip4_type = ip4_type;
	}

	/**
	 * Gets the ip4_value.
	 *
	 * @return the ip4_value
	 */
	public String getIp4_value() {
		return ip4_value;
	}

	/**
	 * Sets the ip4_value.
	 *
	 * @param ip4_value the ip4_value to set
	 */
	public void setIp4_value(String ip4_value) {
		this.ip4_value = ip4_value;
	}

	/**
	 * Gets the ip4_start.
	 *
	 * @return the ip4_start
	 */
	public long getIp4_start() {
		return ip4_start;
	}

	/**
	 * Sets the ip4_start.
	 *
	 * @param ip4_start the ip4_start to set
	 */
	public void setIp4_start(long ip4_start) {
		this.ip4_start = ip4_start;
	}

	/**
	 * Gets the ip4_end.
	 *
	 * @return the ip4_end
	 */
	public long getIp4_end() {
		return ip4_end;
	}

	/**
	 * Sets the ip4_end.
	 *
	 * @param ip4_end the ip4_end to set
	 */
	public void setIp4_end(long ip4_end) {
		this.ip4_end = ip4_end;
	}

	/**
	 * Gets the ip5_target.
	 *
	 * @return the ip5_target
	 */
	public String getIp5_target() {
		return ip5_target;
	}

	/**
	 * Sets the ip5_target.
	 *
	 * @param ip5_target the ip5_target to set
	 */
	public void setIp5_target(String ip5_target) {
		this.ip5_target = ip5_target;
	}

	/**
	 * Gets the ip5_type.
	 *
	 * @return the ip5_type
	 */
	public String getIp5_type() {
		return ip5_type;
	}

	/**
	 * Sets the ip5_type.
	 *
	 * @param ip5_type the ip5_type to set
	 */
	public void setIp5_type(String ip5_type) {
		this.ip5_type = ip5_type;
	}

	/**
	 * Gets the ip5_value.
	 *
	 * @return the ip5_value
	 */
	public String getIp5_value() {
		return ip5_value;
	}

	/**
	 * Sets the ip5_value.
	 *
	 * @param ip5_value the ip5_value to set
	 */
	public void setIp5_value(String ip5_value) {
		this.ip5_value = ip5_value;
	}

	/**
	 * Gets the ip5_start.
	 *
	 * @return the ip5_start
	 */
	public long getIp5_start() {
		return ip5_start;
	}

	/**
	 * Sets the ip5_start.
	 *
	 * @param ip5_start the ip5_start to set
	 */
	public void setIp5_start(long ip5_start) {
		this.ip5_start = ip5_start;
	}

	/**
	 * Gets the ip5_end.
	 *
	 * @return the ip5_end
	 */
	public long getIp5_end() {
		return ip5_end;
	}

	
	
	/**
	 * Gets the ip1_offer.
	 *
	 * @return the ip1_offer
	 */
	public String getIp1_offer() {
		return ip1_offer;
	}

	/**
	 * Sets the ip1_offer.
	 *
	 * @param ip1_offer the new ip1_offer
	 */
	public void setIp1_offer(String ip1_offer) {
		this.ip1_offer = ip1_offer;
	}

	/**
	 * Gets the ip2_offer.
	 *
	 * @return the ip2_offer
	 */
	public String getIp2_offer() {
		return ip2_offer;
	}

	/**
	 * Sets the ip2_offer.
	 *
	 * @param ip2_offer the new ip2_offer
	 */
	public void setIp2_offer(String ip2_offer) {
		this.ip2_offer = ip2_offer;
	}

	/**
	 * Gets the ip3_offer.
	 *
	 * @return the ip3_offer
	 */
	public String getIp3_offer() {
		return ip3_offer;
	}

	/**
	 * Sets the ip3_offer.
	 *
	 * @param ip3_offer the new ip3_offer
	 */
	public void setIp3_offer(String ip3_offer) {
		this.ip3_offer = ip3_offer;
	}

	/**
	 * Gets the ip4_offer.
	 *
	 * @return the ip4_offer
	 */
	public String getIp4_offer() {
		return ip4_offer;
	}

	/**
	 * Sets the ip4_offer.
	 *
	 * @param ip4_offer the new ip4_offer
	 */
	public void setIp4_offer(String ip4_offer) {
		this.ip4_offer = ip4_offer;
	}

	/**
	 * Gets the ip5_offer.
	 *
	 * @return the ip5_offer
	 */
	public String getIp5_offer() {
		return ip5_offer;
	}

	/**
	 * Sets the ip5_offer.
	 *
	 * @param ip5_offer the new ip5_offer
	 */
	public void setIp5_offer(String ip5_offer) {
		this.ip5_offer = ip5_offer;
	}

	/**
	 * Sets the ip5_end.
	 *
	 * @param ip5_end the ip5_end to set
	 */
	public void setIp5_end(long ip5_end) {
		this.ip5_end = ip5_end;
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
	 * Gets the cost of system trasmission power plants.
	 *
	 * @return the costOfSystemTrasmissionPowerPlants
	 */
	public double getCostOfSystemTrasmissionPowerPlants() {
		return costOfSystemTrasmissionPowerPlants;
	}

	/**
	 * Sets the cost of system trasmission power plants.
	 *
	 * @param costOfSystemTrasmissionPowerPlants the costOfSystemTrasmissionPowerPlants to set
	 */
	public void setCostOfSystemTrasmissionPowerPlants(
			double costOfSystemTrasmissionPowerPlants) {
		this.costOfSystemTrasmissionPowerPlants = costOfSystemTrasmissionPowerPlants;
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
	 * Gets the state.
	 *
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * Sets the state.
	 *
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * Gets the note retailer.
	 *
	 * @return the noteRetailer
	 */
	public String getNoteRetailer() {
		return noteRetailer;
	}

	/**
	 * Sets the note retailer.
	 *
	 * @param noteRetailer the noteRetailer to set
	 */
	public void setNoteRetailer(String noteRetailer) {
		this.noteRetailer = noteRetailer;
	}

	/**
	 * Gets the note market regulator.
	 *
	 * @return the noteMarketRegulator
	 */
	public String getNoteMarketRegulator() {
		return noteMarketRegulator;
	}

	/**
	 * Sets the note market regulator.
	 *
	 * @param noteMarketRegulator the noteMarketRegulator to set
	 */
	public void setNoteMarketRegulator(String noteMarketRegulator) {
		this.noteMarketRegulator = noteMarketRegulator;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the author_email.
	 *
	 * @return the author_email
	 */
	public String getAuthor_email() {
		return author_email;
	}

	/**
	 * Sets the author_email.
	 *
	 * @param author_email the author_email to set
	 */
	public void setAuthor_email(String author_email) {
		this.author_email = author_email;
	}


}
