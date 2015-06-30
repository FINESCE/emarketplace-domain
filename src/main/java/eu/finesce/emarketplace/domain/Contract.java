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
 * The Class Contract.
 */
@XmlRootElement(name = "contract")
@XmlAccessorType(XmlAccessType.FIELD)
public class Contract {
	
	/** The current time. */
	@XmlElement(required=true)
	private long currentTime;
	
	
	@XmlElement(required=true)
	private long dateOfCreation;
	
	@XmlElement(required=true)
	private long dateOfApproval;
	
	/** The contract ID. */
	@XmlElement(required = true)
	private String contractID;

	/** The Incentive Plan ID. */
	@XmlElement(required = true)
	private String incentivePlanID;

	/** The customer ID. */
	@XmlElement(required = true)
	private String customerID;

	/** The meter ID. */
	@XmlElement(required = true)
	private String meterID;

	/** The ip1_target. */
	@XmlElement(required = true)
	private String ip1_planTarget;
	
	/** The ip1_type. */
	@XmlElement(required = true)
	private String ip1_type;
	
	/** The ip1_value. */
	@XmlElement(required = true)
	private double ip1_value;
	
	/** The ip1_start. */
	@XmlElement(required=true)
	private long ip1_start;

	/** The ip1_end. */
	@XmlElement(required=true)
	private long ip1_end;
	
	/** The ip1_customerApproval. */
	@XmlElement(required=true)
	private int ip1_customerApproval;
	
	@XmlElement(required=true)
	private String ip1_offer;
		
	/** The ip2_target. */
	@XmlElement(required = true)
	private String ip2_planTarget;
	
	/** The ip2_type. */
	@XmlElement(required = true)
	private String ip2_type;
	
	/** The ip2_value. */
	@XmlElement(required = true)
	private double ip2_value;
	
	/** The ip2_start. */
	@XmlElement(required=true)
	private long ip2_start;

	/** The ip2_end. */
	@XmlElement(required=true)
	private long ip2_end;
	
	/** The ip2_customerApproval. */
	@XmlElement(required=true)
	private int ip2_customerApproval;
	
	@XmlElement(required=true)
	private String ip2_offer;
	
	/** The ip3_target. */
	@XmlElement(required = true)
	private String ip3_planTarget;
	
	/** The ip3_type. */
	@XmlElement(required = true)
	private String ip3_type;
	
	/** The ip3_value. */
	@XmlElement(required = true)
	private double ip3_value;
	
	/** The ip3_start. */
	@XmlElement(required=true)
	private long ip3_start;

	/** The ip3_end. */
	@XmlElement(required=true)
	private long ip3_end;
	
	/** The ip3_customerApproval. */
	@XmlElement(required=true)
	private int ip3_customerApproval;
		
	@XmlElement(required=true)
	private String ip3_offer;
	
	/** The ip4_target. */
	@XmlElement(required = true)
	private String ip4_planTarget;
	
	/** The ip4_type. */
	@XmlElement(required = true)
	private String ip4_type;
	
	/** The ip4_value. */
	@XmlElement(required = true)
	private double ip4_value;
	
	/** The ip4_start. */
	@XmlElement(required=true)
	private long ip4_start;

	/** The ip4_end. */
	@XmlElement(required=true)
	private long ip4_end;
	
	/** The ip4_customerApproval. */
	@XmlElement(required=true)
	private int ip4_customerApproval;
	
	@XmlElement(required=true)
	private String ip4_offer;
	
	/** The ip5_target. */
	@XmlElement(required = true)
	private String ip5_planTarget;
	
	/** The ip5_type. */
	@XmlElement(required = true)
	private String ip5_type;
	
	/** The ip5_value. */
	@XmlElement(required = true)
	private double ip5_value;
	
	/** The ip5_start. */
	@XmlElement(required=true)
	private long ip5_start;

	/** The ip5_end. */
	@XmlElement(required=true)
	private long ip5_end;
	
	/** The ip5_customerApproval. */
	@XmlElement(required=true)
	private int ip5_customerApproval;
	
	@XmlElement(required=true)
	private String ip5_offer;
	
	/** The state. */
	@XmlElement(required = true)
	private String state;

	/**
	 * @return the currentTime
	 */
	public long getCurrentTime() {
		return currentTime;
	}

	/**
	 * @param currentTime the currentTime to set
	 */
	public void setCurrentTime(long currentTime) {
		this.currentTime = currentTime;
	}

	/**
	 * @return the contractID
	 */
	public String getContractID() {
		return contractID;
	}

	/**
	 * @param contractID the contractID to set
	 */
	public void setContractID(String contractID) {
		this.contractID = contractID;
	}

	/**
	 * @return the incentivePlanID
	 */
	public String getIncentivePlanID() {
		return incentivePlanID;
	}

	/**
	 * @param incentivePlanID the incentivePlanID to set
	 */
	public void setIncentivePlanID(String incentivePlanID) {
		this.incentivePlanID = incentivePlanID;
	}

	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the meterID
	 */
	public String getMeterID() {
		return meterID;
	}

	/**
	 * @param meterID the meterID to set
	 */
	public void setMeterID(String meterID) {
		this.meterID = meterID;
	}

	/**
	 * @return the ip1_planTarget
	 */
	public String getIp1_planTarget() {
		return ip1_planTarget;
	}

	/**
	 * @param ip1_planTarget the ip1_planTarget to set
	 */
	public void setIp1_planTarget(String ip1_planTarget) {
		this.ip1_planTarget = ip1_planTarget;
	}

	/**
	 * @return the ip1_type
	 */
	public String getIp1_type() {
		return ip1_type;
	}

	/**
	 * @param ip1_type the ip1_type to set
	 */
	public void setIp1_type(String ip1_type) {
		this.ip1_type = ip1_type;
	}

	/**
	 * @return the ip1_value
	 */
	public double getIp1_value() {
		return ip1_value;
	}

	/**
	 * @param ip1_value the ip1_value to set
	 */
	public void setIp1_value(double ip1_value) {
		this.ip1_value = ip1_value;
	}

	/**
	 * @return the ip1_start
	 */
	public long getIp1_start() {
		return ip1_start;
	}

	/**
	 * @param ip1_start the ip1_start to set
	 */
	public void setIp1_start(long ip1_start) {
		this.ip1_start = ip1_start;
	}

	/**
	 * @return the ip1_end
	 */
	public long getIp1_end() {
		return ip1_end;
	}

	/**
	 * @param ip1_end the ip1_end to set
	 */
	public void setIp1_end(long ip1_end) {
		this.ip1_end = ip1_end;
	}

	/**
	 * @return the ip1_customerApproval
	 */
	public int getIp1_customerApproval() {
		return ip1_customerApproval;
	}

	/**
	 * @param ip1_customerApproval the ip1_customerApproval to set
	 */
	public void setIp1_customerApproval(int ip1_customerApproval) {
		this.ip1_customerApproval = ip1_customerApproval;
	}

	/**
	 * @return the ip2_planTarget
	 */
	public String getIp2_planTarget() {
		return ip2_planTarget;
	}

	/**
	 * @param ip2_planTarget the ip2_planTarget to set
	 */
	public void setIp2_planTarget(String ip2_planTarget) {
		this.ip2_planTarget = ip2_planTarget;
	}

	/**
	 * @return the ip2_type
	 */
	public String getIp2_type() {
		return ip2_type;
	}

	/**
	 * @param ip2_type the ip2_type to set
	 */
	public void setIp2_type(String ip2_type) {
		this.ip2_type = ip2_type;
	}

	/**
	 * @return the ip2_value
	 */
	public double getIp2_value() {
		return ip2_value;
	}

	/**
	 * @param ip2_value the ip2_value to set
	 */
	public void setIp2_value(double ip2_value) {
		this.ip2_value = ip2_value;
	}

	/**
	 * @return the ip2_start
	 */
	public long getIp2_start() {
		return ip2_start;
	}

	/**
	 * @param ip2_start the ip2_start to set
	 */
	public void setIp2_start(long ip2_start) {
		this.ip2_start = ip2_start;
	}

	/**
	 * @return the ip2_end
	 */
	public long getIp2_end() {
		return ip2_end;
	}

	/**
	 * @param ip2_end the ip2_end to set
	 */
	public void setIp2_end(long ip2_end) {
		this.ip2_end = ip2_end;
	}

	/**
	 * @return the ip2_customerApproval
	 */
	public int getIp2_customerApproval() {
		return ip2_customerApproval;
	}

	/**
	 * @param ip2_customerApproval the ip2_customerApproval to set
	 */
	public void setIp2_customerApproval(int ip2_customerApproval) {
		this.ip2_customerApproval = ip2_customerApproval;
	}

	/**
	 * @return the ip3_planTarget
	 */
	public String getIp3_planTarget() {
		return ip3_planTarget;
	}

	/**
	 * @param ip3_planTarget the ip3_planTarget to set
	 */
	public void setIp3_planTarget(String ip3_planTarget) {
		this.ip3_planTarget = ip3_planTarget;
	}

	/**
	 * @return the ip3_type
	 */
	public String getIp3_type() {
		return ip3_type;
	}

	/**
	 * @param ip3_type the ip3_type to set
	 */
	public void setIp3_type(String ip3_type) {
		this.ip3_type = ip3_type;
	}

	/**
	 * @return the ip3_value
	 */
	public double getIp3_value() {
		return ip3_value;
	}

	/**
	 * @param ip3_value the ip3_value to set
	 */
	public void setIp3_value(double ip3_value) {
		this.ip3_value = ip3_value;
	}

	/**
	 * @return the ip3_start
	 */
	public long getIp3_start() {
		return ip3_start;
	}

	/**
	 * @param ip3_start the ip3_start to set
	 */
	public void setIp3_start(long ip3_start) {
		this.ip3_start = ip3_start;
	}

	/**
	 * @return the ip3_end
	 */
	public long getIp3_end() {
		return ip3_end;
	}

	/**
	 * @param ip3_end the ip3_end to set
	 */
	public void setIp3_end(long ip3_end) {
		this.ip3_end = ip3_end;
	}

	/**
	 * @return the ip3_customerApproval
	 */
	public int getIp3_customerApproval() {
		return ip3_customerApproval;
	}

	/**
	 * @param ip3_customerApproval the ip3_customerApproval to set
	 */
	public void setIp3_customerApproval(int ip3_customerApproval) {
		this.ip3_customerApproval = ip3_customerApproval;
	}

	/**
	 * @return the ip4_planTarget
	 */
	public String getIp4_planTarget() {
		return ip4_planTarget;
	}

	/**
	 * @param ip4_planTarget the ip4_planTarget to set
	 */
	public void setIp4_planTarget(String ip4_planTarget) {
		this.ip4_planTarget = ip4_planTarget;
	}

	/**
	 * @return the ip4_type
	 */
	public String getIp4_type() {
		return ip4_type;
	}

	/**
	 * @param ip4_type the ip4_type to set
	 */
	public void setIp4_type(String ip4_type) {
		this.ip4_type = ip4_type;
	}

	/**
	 * @return the ip4_value
	 */
	public double getIp4_value() {
		return ip4_value;
	}

	/**
	 * @param ip4_value the ip4_value to set
	 */
	public void setIp4_value(double ip4_value) {
		this.ip4_value = ip4_value;
	}

	/**
	 * @return the ip4_start
	 */
	public long getIp4_start() {
		return ip4_start;
	}

	/**
	 * @param ip4_start the ip4_start to set
	 */
	public void setIp4_start(long ip4_start) {
		this.ip4_start = ip4_start;
	}

	/**
	 * @return the ip4_end
	 */
	public long getIp4_end() {
		return ip4_end;
	}

	/**
	 * @param ip4_end the ip4_end to set
	 */
	public void setIp4_end(long ip4_end) {
		this.ip4_end = ip4_end;
	}

	/**
	 * @return the ip4_customerApproval
	 */
	public int getIp4_customerApproval() {
		return ip4_customerApproval;
	}

	/**
	 * @param ip4_customerApproval the ip4_customerApproval to set
	 */
	public void setIp4_customerApproval(int ip4_customerApproval) {
		this.ip4_customerApproval = ip4_customerApproval;
	}

	/**
	 * @return the ip5_planTarget
	 */
	public String getIp5_planTarget() {
		return ip5_planTarget;
	}

	/**
	 * @param ip5_planTarget the ip5_planTarget to set
	 */
	public void setIp5_planTarget(String ip5_planTarget) {
		this.ip5_planTarget = ip5_planTarget;
	}

	/**
	 * @return the ip5_type
	 */
	public String getIp5_type() {
		return ip5_type;
	}

	/**
	 * @param ip5_type the ip5_type to set
	 */
	public void setIp5_type(String ip5_type) {
		this.ip5_type = ip5_type;
	}

	/**
	 * @return the ip5_value
	 */
	public double getIp5_value() {
		return ip5_value;
	}

	/**
	 * @param ip5_value the ip5_value to set
	 */
	public void setIp5_value(double ip5_value) {
		this.ip5_value = ip5_value;
	}

	/**
	 * @return the ip5_start
	 */
	public long getIp5_start() {
		return ip5_start;
	}

	/**
	 * @param ip5_start the ip5_start to set
	 */
	public void setIp5_start(long ip5_start) {
		this.ip5_start = ip5_start;
	}

	/**
	 * @return the ip5_end
	 */
	public long getIp5_end() {
		return ip5_end;
	}

	/**
	 * @param ip5_end the ip5_end to set
	 */
	public void setIp5_end(long ip5_end) {
		this.ip5_end = ip5_end;
	}

	/**
	 * @return the ip5_customerApproval
	 */
	public int getIp5_customerApproval() {
		return ip5_customerApproval;
	}

	/**
	 * @param ip5_customerApproval the ip5_customerApproval to set
	 */
	public void setIp5_customerApproval(int ip5_customerApproval) {
		this.ip5_customerApproval = ip5_customerApproval;
	}

	
	
	public String getIp1_offer() {
		return ip1_offer;
	}

	public void setIp1_offer(String ip1_offer) {
		this.ip1_offer = ip1_offer;
	}

	public String getIp2_offer() {
		return ip2_offer;
	}

	public void setIp2_offer(String ip2_offer) {
		this.ip2_offer = ip2_offer;
	}

	public String getIp3_offer() {
		return ip3_offer;
	}

	public void setIp3_offer(String ip3_offer) {
		this.ip3_offer = ip3_offer;
	}

	public String getIp4_offer() {
		return ip4_offer;
	}

	public void setIp4_offer(String ip4_offer) {
		this.ip4_offer = ip4_offer;
	}

	public String getIp5_offer() {
		return ip5_offer;
	}

	public void setIp5_offer(String ip5_offer) {
		this.ip5_offer = ip5_offer;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	
	
	public long getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(long dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public long getDateOfApproval() {
		return dateOfApproval;
	}

	public void setDateOfApproval(long dateOfApproval) {
		this.dateOfApproval = dateOfApproval;
	}

	@Override
	public String toString() {
		return "Contract [currentTime=" + currentTime + ", dateOfCreation="
				+ dateOfCreation + ", dateOfApproval=" + dateOfApproval
				+ ", contractID=" + contractID + ", incentivePlanID="
				+ incentivePlanID + ", customerID=" + customerID + ", meterID="
				+ meterID + ", ip1_planTarget=" + ip1_planTarget
				+ ", ip1_type=" + ip1_type + ", ip1_value=" + ip1_value
				+ ", ip1_start=" + ip1_start + ", ip1_end=" + ip1_end
				+ ", ip1_customerApproval=" + ip1_customerApproval
				+ ", ip1_offer=" + ip1_offer + ", ip2_planTarget="
				+ ip2_planTarget + ", ip2_type=" + ip2_type + ", ip2_value="
				+ ip2_value + ", ip2_start=" + ip2_start + ", ip2_end="
				+ ip2_end + ", ip2_customerApproval=" + ip2_customerApproval
				+ ", ip2_offer=" + ip2_offer + ", ip3_planTarget="
				+ ip3_planTarget + ", ip3_type=" + ip3_type + ", ip3_value="
				+ ip3_value + ", ip3_start=" + ip3_start + ", ip3_end="
				+ ip3_end + ", ip3_customerApproval=" + ip3_customerApproval
				+ ", ip3_offer=" + ip3_offer + ", ip4_planTarget="
				+ ip4_planTarget + ", ip4_type=" + ip4_type + ", ip4_value="
				+ ip4_value + ", ip4_start=" + ip4_start + ", ip4_end="
				+ ip4_end + ", ip4_customerApproval=" + ip4_customerApproval
				+ ", ip4_offer=" + ip4_offer + ", ip5_planTarget="
				+ ip5_planTarget + ", ip5_type=" + ip5_type + ", ip5_value="
				+ ip5_value + ", ip5_start=" + ip5_start + ", ip5_end="
				+ ip5_end + ", ip5_customerApproval=" + ip5_customerApproval
				+ ", ip5_offer=" + ip5_offer + ", state=" + state + "]";
	}

	
	

}
