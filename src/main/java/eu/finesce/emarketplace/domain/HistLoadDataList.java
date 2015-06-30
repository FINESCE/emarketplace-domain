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
 * The Class HistLoadDataList.
 */
@XmlRootElement(name = "histLoadDataList")
@XmlAccessorType(XmlAccessType.FIELD)
public class HistLoadDataList {
	
	/** The load sample date. */
	@XmlElement(required = true)
	private long loadSampleDate;

	/** The sample number. */
	@XmlElement(required=true)
	private int sampleNumber;

	/** The upstream active power eua. */
	@XmlElement(required = true)
	private double upstreamActivePowerEUA;

	/** The reactive inductive power eei. */
	@XmlElement(required = true)
	private double reactiveInductivePowerEEI;

	/** The reactive capacitive power eec. */
	@XmlElement(required = true)
	private double reactiveCapacitivePowerEEC;

	/** The downstream active power eea. */
	@XmlElement(required = true)
	private double downstreamActivePowerEEA;

	/** The reactive inductive power eui. */
	@XmlElement(required = true)
	private double reactiveInductivePowerEUI;

	/** The reactive capacitive power euc. */
	@XmlElement(required = true)
	private double reactiveCapacitivePowerEUC;
	


	/** The meter id. */
	@XmlElement(required = true)
	private String meterID;


	/**
	 * Instantiates a new hist load data list.
	 */
	public	HistLoadDataList(){};
	

	/**
	 * Gets the load sample date.
	 *
	 * @return the load sample date
	 */
	public long getLoadSampleDate() {
		return loadSampleDate;
	}

	/**
	 * Sets the load sample date.
	 *
	 * @param loadSampleDate the new load sample date
	 */
	public void setLoadSampleDate(long loadSampleDate) {
		this.loadSampleDate = loadSampleDate;
	}

	/**
	 * Gets the sample number.
	 *
	 * @return the sample number
	 */
	public int getSampleNumber() {
		return sampleNumber;
	}

	/**
	 * Sets the sample number.
	 *
	 * @param sampleNumber the new sample number
	 */
	public void setSampleNumber(int sampleNumber) {
		this.sampleNumber = sampleNumber;
	}

	/**
	 * Gets the upstream active power eua.
	 *
	 * @return the upstream active power eua
	 */
	public double getUpstreamActivePowerEUA() {
		return upstreamActivePowerEUA;
	}

	/**
	 * Sets the upstream active power eua.
	 *
	 * @param upstreamActivePowerEUA the new upstream active power eua
	 */
	public void setUpstreamActivePowerEUA(double upstreamActivePowerEUA) {
		this.upstreamActivePowerEUA = upstreamActivePowerEUA;
	}

	/**
	 * Gets the reactive inductive power eei.
	 *
	 * @return the reactive inductive power eei
	 */
	public double getReactiveInductivePowerEEI() {
		return reactiveInductivePowerEEI;
	}

	/**
	 * Sets the reactive inductive power eei.
	 *
	 * @param reactiveInductivePowerEEI the new reactive inductive power eei
	 */
	public void setReactiveInductivePowerEEI(double reactiveInductivePowerEEI) {
		this.reactiveInductivePowerEEI = reactiveInductivePowerEEI;
	}

	/**
	 * Gets the reactive capacitive power eec.
	 *
	 * @return the reactive capacitive power eec
	 */
	public double getReactiveCapacitivePowerEEC() {
		return reactiveCapacitivePowerEEC;
	}

	/**
	 * Sets the reactive capacitive power eec.
	 *
	 * @param reactiveCapacitivePowerEEC the new reactive capacitive power eec
	 */
	public void setReactiveCapacitivePowerEEC(double reactiveCapacitivePowerEEC) {
		this.reactiveCapacitivePowerEEC = reactiveCapacitivePowerEEC;
	}

	/**
	 * Gets the downstream active power eea.
	 *
	 * @return the downstream active power eea
	 */
	public double getDownstreamActivePowerEEA() {
		return downstreamActivePowerEEA;
	}

	/**
	 * Sets the downstream active power eea.
	 *
	 * @param downstreamActivePowerEEA the new downstream active power eea
	 */
	public void setDownstreamActivePowerEEA(double downstreamActivePowerEEA) {
		this.downstreamActivePowerEEA = downstreamActivePowerEEA;
	}

	/**
	 * Gets the reactive inductive power eui.
	 *
	 * @return the reactive inductive power eui
	 */
	public double getReactiveInductivePowerEUI() {
		return reactiveInductivePowerEUI;
	}

	/**
	 * Sets the reactive inductive power eui.
	 *
	 * @param reactiveInductivePowerEUI the new reactive inductive power eui
	 */
	public void setReactiveInductivePowerEUI(double reactiveInductivePowerEUI) {
		this.reactiveInductivePowerEUI = reactiveInductivePowerEUI;
	}

	/**
	 * Gets the reactive capacitive power euc.
	 *
	 * @return the reactive capacitive power euc
	 */
	public double getReactiveCapacitivePowerEUC() {
		return reactiveCapacitivePowerEUC;
	}

	/**
	 * Sets the reactive capacitive power euc.
	 *
	 * @param reactiveCapacitivePowerEUC the new reactive capacitive power euc
	 */
	public void setReactiveCapacitivePowerEUC(double reactiveCapacitivePowerEUC) {
		this.reactiveCapacitivePowerEUC = reactiveCapacitivePowerEUC;
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
