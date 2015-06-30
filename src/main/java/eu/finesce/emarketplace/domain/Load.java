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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

// TODO: Auto-generated Javadoc
/**
 * The Class Load.
 */
@XmlRootElement(name = "load")
@XmlAccessorType(XmlAccessType.FIELD)
public class Load {

	/** The meter id. */
	@XmlAttribute(required = true)
	private String meterId;
	
	/** The is concentrator. */
	@XmlAttribute(required = true)
	private boolean isConcentrator;
	
	/** The current time. */
	@XmlElement(required = true)
	private long currentTime;

	/** The sample number. */
	@XmlElement(required = true)
	private int sampleNumber;

	/** The load sample date. */
	@XmlElement(required = true)
	private long loadSampleDate;

//	@XmlElement(required = true)
//	private double upstreamActivePowerEEA;

	/** The downstream active power eea. */
@XmlElement(required = true)
	private double downstreamActivePowerEEA;

	
	/** The reactive inductive power eei. */
	@XmlElement(required = true)
	private double reactiveInductivePowerEEI;

	/** The reactive capacitive power eec. */
	@XmlElement(required = true)
	private double reactiveCapacitivePowerEEC;

//	@XmlElement(required = true)
//	private double downstreamActivePowerEUA;
	
	/** The upstream active power eua. */
@XmlElement(required = true)
	private double upstreamActivePowerEUA;
	
	/** The reactive inductive power eui. */
	@XmlElement(required = true)
	private double reactiveInductivePowerEUI;

	/** The reactive capacitive power euc. */
	@XmlElement(required = true)
	private double reactiveCapacitivePowerEUC;

	/** The tariff type. */
	@XmlElement(required = true)
	private String tariffType;

	/** The integration period ref. */
	@XmlElement(required = true)
	private String integrationPeriodRef;

	/** The load time. */
	@XmlElement(required = true)
	private long loadTime;
	
	/**
	 * Instantiates a new load.
	 *
	 * @param meterId the meter id
	 * @param isConcentrator the is concentrator
	 */
	public Load(String meterId, boolean isConcentrator) {
		super();
		this.setMeterId(meterId);
		this.setConcentrator(isConcentrator);
	}
	
	

	/**
	 * Instantiates a new load.
	 */
	public Load() {
		super();
	}



	/**
	 * Instantiates a new load.
	 *
	 * @param meterId the meter id
	 * @param currentTime the current time
	 * @param isConcentrator the is concentrator
	 * @param sampleNumber the sample number
	 * @param loadSampleDate the load sample date
	 * @param upstreamActivePowerEUA the upstream active power eua
	 * @param reactiveInductivePowerEEI the reactive inductive power eei
	 * @param reactiveCapacitivePowerEEC the reactive capacitive power eec
	 * @param downstreamActivePowerEEA the downstream active power eea
	 * @param reactiveInductivePowerEUI the reactive inductive power eui
	 * @param reactiveCapacitivePowerEUC the reactive capacitive power euc
	 * @param tariffType the tariff type
	 * @param integrationPeriodRef the integration period ref
	 */
	public Load(String meterId, long currentTime, boolean isConcentrator,
			int sampleNumber, long loadSampleDate,
			double upstreamActivePowerEUA, double reactiveInductivePowerEEI,
			double reactiveCapacitivePowerEEC, double downstreamActivePowerEEA,
			double reactiveInductivePowerEUI,
			double reactiveCapacitivePowerEUC, String tariffType,
			String integrationPeriodRef) {
		super();
		this.meterId = meterId;
		this.currentTime = currentTime;
		this.isConcentrator = isConcentrator;
		this.sampleNumber = sampleNumber;
		this.loadSampleDate = loadSampleDate;
		this.downstreamActivePowerEEA = downstreamActivePowerEEA;
		this.reactiveInductivePowerEEI = reactiveInductivePowerEEI;
		this.reactiveCapacitivePowerEEC = reactiveCapacitivePowerEEC;
		this.upstreamActivePowerEUA = upstreamActivePowerEUA;
		this.reactiveInductivePowerEUI = reactiveInductivePowerEUI;
		this.reactiveCapacitivePowerEUC = reactiveCapacitivePowerEUC;
		this.tariffType = tariffType;
		this.integrationPeriodRef = integrationPeriodRef;
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
	 * @param meterId            the meterId to set
	 */
	public void setMeterId(String meterId) {
		this.meterId = meterId;
	}

	/**
	 * Checks if is concentrator.
	 *
	 * @return the isConcentrator
	 */
	public boolean isConcentrator() {
		return isConcentrator;
	}

	/**
	 * Sets the concentrator.
	 *
	 * @param isConcentrator            the isConcentrator to set
	 */
	public void setConcentrator(boolean isConcentrator) {
		this.isConcentrator = isConcentrator;
	}

	/**
	 * Gets the sample number.
	 *
	 * @return the sampleNumber
	 */
	public int getSampleNumber() {
		return sampleNumber;
	}

	/**
	 * Sets the sample number.
	 *
	 * @param sampleNumber            the sampleNumber to set
	 */
	public void setSampleNumber(int sampleNumber) {
		this.sampleNumber = sampleNumber;
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
	 * Gets the reactive inductive power eei.
	 *
	 * @return the reactiveInductivePowerEEI
	 */
	public double getReactiveInductivePowerEEI() {
		return reactiveInductivePowerEEI;
	}

	/**
	 * Sets the reactive inductive power eei.
	 *
	 * @param reactiveInductivePowerEEI            the reactiveInductivePowerEEI to set
	 */
	public void setReactiveInductivePowerEEI(double reactiveInductivePowerEEI) {
		this.reactiveInductivePowerEEI = reactiveInductivePowerEEI;
	}

	/**
	 * Gets the reactive capacitive power eec.
	 *
	 * @return the reactiveCapacitivePowerEEC
	 */
	public double getReactiveCapacitivePowerEEC() {
		return reactiveCapacitivePowerEEC;
	}

	/**
	 * Sets the reactive capacitive power eec.
	 *
	 * @param reactiveCapacitivePowerEEC            the reactiveCapacitivePowerEEC to set
	 */
	public void setReactiveCapacitivePowerEEC(double reactiveCapacitivePowerEEC) {
		this.reactiveCapacitivePowerEEC = reactiveCapacitivePowerEEC;
	}

	
	/**
	 * Gets the reactive inductive power eui.
	 *
	 * @return the reactiveInductivePowerEUI
	 */
	public double getReactiveInductivePowerEUI() {
		return reactiveInductivePowerEUI;
	}

	/**
	 * Sets the reactive inductive power eui.
	 *
	 * @param reactiveInductivePowerEUI            the reactiveInductivePowerEUI to set
	 */
	public void setReactiveInductivePowerEUI(double reactiveInductivePowerEUI) {
		this.reactiveInductivePowerEUI = reactiveInductivePowerEUI;
	}

	/**
	 * Gets the reactive capacitive power euc.
	 *
	 * @return the reactiveCapacitivePowerEUC
	 */
	public double getReactiveCapacitivePowerEUC() {
		return reactiveCapacitivePowerEUC;
	}

	/**
	 * Sets the reactive capacitive power euc.
	 *
	 * @param reactiveCapacitivePowerEUC            the reactiveCapacitivePowerEUC to set
	 */
	public void setReactiveCapacitivePowerEUC(double reactiveCapacitivePowerEUC) {
		this.reactiveCapacitivePowerEUC = reactiveCapacitivePowerEUC;
	}

	/**
	 * Gets the tariff type.
	 *
	 * @return the tariffType
	 */
	public String getTariffType() {
		return tariffType;
	}

	/**
	 * Sets the tariff type.
	 *
	 * @param tariffType            the tariffType to set
	 */
	public void setTariffType(String tariffType) {
		this.tariffType = tariffType;
	}

	/**
	 * Gets the integration period ref.
	 *
	 * @return the integrationPeriodRef
	 */
	public String getIntegrationPeriodRef() {
		return integrationPeriodRef;
	}

	/**
	 * Sets the integration period ref.
	 *
	 * @param integrationPeriodRef            the integrationPeriodRef to set
	 */
	public void setIntegrationPeriodRef(String integrationPeriodRef) {
		this.integrationPeriodRef = integrationPeriodRef;
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
	 * @param currentTime            the currentTime to set
	 */
	public void setCurrentTime(long currentTime) {
		this.currentTime = currentTime;
	}

	/**
	 * Gets the load time.
	 *
	 * @return the loadTime
	 */
	public long getLoadTime() {
		return loadTime;
	}

	/**
	 * Sets the load time.
	 *
	 * @param loadTime the loadTime to set
	 */
	public void setLoadTime(long loadTime) {
		this.loadTime = loadTime;
	}


	
	

	/**
	 * Gets the downstream active power eea.
	 *
	 * @return the downstreamActivePowerEEA
	 */
	public double getDownstreamActivePowerEEA() {
		return downstreamActivePowerEEA;
	}



	/**
	 * Sets the downstream active power eea.
	 *
	 * @param downstreamActivePowerEEA the downstreamActivePowerEEA to set
	 */
	public void setDownstreamActivePowerEEA(double downstreamActivePowerEEA) {
		this.downstreamActivePowerEEA = downstreamActivePowerEEA;
	}



	/**
	 * Gets the upstream active power eua.
	 *
	 * @return the upstreamActivePowerEUA
	 */
	public double getUpstreamActivePowerEUA() {
		return upstreamActivePowerEUA;
	}



	/**
	 * Sets the upstream active power eua.
	 *
	 * @param upstreamActivePowerEUA the upstreamActivePowerEUA to set
	 */
	public void setUpstreamActivePowerEUA(double upstreamActivePowerEUA) {
		this.upstreamActivePowerEUA = upstreamActivePowerEUA;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Load [meterId=" + meterId + ", isConcentrator="
				+ isConcentrator + ", currentTime=" + currentTime
				+ ", sampleNumber=" + sampleNumber + ", loadSampleDate="
				+ loadSampleDate + ", downstreamActivePowerEEA="
				+ downstreamActivePowerEEA + ", reactiveInductivePowerEEI="
				+ reactiveInductivePowerEEI + ", reactiveCapacitivePowerEEC="
				+ reactiveCapacitivePowerEEC + ", upstreamActivePowerEUA="
				+ upstreamActivePowerEUA + ", reactiveInductivePowerEUI="
				+ reactiveInductivePowerEUI + ", reactiveCapacitivePowerEUC="
				+ reactiveCapacitivePowerEUC + ", tariffType=" + tariffType
				+ ", integrationPeriodRef=" + integrationPeriodRef
				+ ", loadTime=" + loadTime + "]";
	}

	
	/**
	 * To xml.
	 */
	public void toXml() {
	    try {
	        JAXBContext ctx = JAXBContext.newInstance(Load.class);
	        Marshaller marshaller = ctx.createMarshaller();
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	        marshaller.marshal(this, System.out);
	    }
	    catch (Exception
	            e) {

	              //catch exception 
	    }
	}
	
}
