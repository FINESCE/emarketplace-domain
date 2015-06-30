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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


// TODO: Auto-generated Javadoc
/**
 * The Class MeterDetailsPublic.
 */
@XmlRootElement(name="meterDetails")
@XmlAccessorType(XmlAccessType.FIELD)
public class MeterDetailsPublic {

	/** The searchfield. */
	@XmlElement(required=true)
	private String searchfield;
	
	/** The searchfieldvalue. */
	@XmlElement(required=true)
	private String searchfieldvalue;
	
	/** The current time. */
	@XmlElement(required=true)
	private long currentTime;
	
	/** The autheticationstatus. */
	@XmlElement(required=true)
	private String autheticationstatus;
	
	/** The meterdetails list public. */
	@XmlElement(name="MeterDetailsListPublic", type=MeterDetailsListPublic.class)
    List<MeterDetailsListPublic> meterdetailsListPublic;

	/*
	 * @return the searchfield 
	 */
	/**
	 * Gets the searchfield.
	 *
	 * @return the searchfield
	 */
	public String getSearchfield() {
		return searchfield;
	}

	/**
	 * Sets the searchfield.
	 *
	 * @param searchfield the searchfield to set
	 */
	public void setSearchfield(String searchfield) {
		this.searchfield = searchfield;
	}

	/**
	 * Gets the searchfieldvalue.
	 *
	 * @return the searchfieldvalue
	 */
	public String getSearchfieldvalue() {
		return searchfieldvalue;
	}

	/**
	 * Sets the searchfieldvalue.
	 *
	 * @param searchfieldvalue the searchfieldvalue to set
	 */
	public void setSearchfieldvalue(String searchfieldvalue) {
		this.searchfieldvalue = searchfieldvalue;
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
	 * Gets the meterdetails list public.
	 *
	 * @return the meterdetailsList
	 */
	public List<MeterDetailsListPublic> getMeterdetailsListPublic() {
		return meterdetailsListPublic;
	}

	/**
	 * Sets the meterdetails list public.
	 *
	 * @param meterdetailsListPublic the new meterdetails list public
	 */
	public void setMeterdetailsListPublic(List<MeterDetailsListPublic> meterdetailsListPublic) {
		this.meterdetailsListPublic = meterdetailsListPublic;
	}
	

	/**
	 * Gets the autheticationstatus.
	 *
	 * @return the autheticationstatus
	 */
	public String getAutheticationstatus() {
		return autheticationstatus;
	}

	/**
	 * Sets the autheticationstatus.
	 *
	 * @param autheticationstatus the autheticationstatus to set
	 */
	public void setAutheticationstatus(String autheticationstatus) {
		this.autheticationstatus = autheticationstatus;
	}
}
