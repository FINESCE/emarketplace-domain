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
 * The Class IssueResolutionPlanDataList.
 */
@XmlRootElement(name = "irpDataList")
@XmlAccessorType(XmlAccessType.FIELD)
public class IssueResolutionPlanDataList {
	
	/** The irp id. */
	@XmlElement(required = true)
	private String irpID;

	/** The current time. */
	@XmlElement(required=true)
	private long currentTime;

	/** The ecp_epp. */
	@XmlElement(required = true)
	private String ecp_epp;

	/** The sector. */
	@XmlElement(required = true)
	private String sector;

	/** The act1_target. */
	@XmlElement(required = true)
	private String act1_target;
	
	/** The act1_type. */
	@XmlElement(required = true)
	private String act1_type;
	
	/** The act1_value. */
	@XmlElement(required = true)
	private double act1_value;
	
	/** The act1_start. */
	@XmlElement(required=true)
	private long act1_start;

	/** The act1_end. */
	@XmlElement(required=true)
	private long act1_end;

	/** The act2_target. */
	@XmlElement(required = true)
	private String act2_target;
	
	/** The act2_type. */
	@XmlElement(required = true)
	private String act2_type;
	
	/** The act2_value. */
	@XmlElement(required = true)
	private double act2_value;
	
	/** The act2_start. */
	@XmlElement(required=true)
	private long act2_start;

	/** The act2_end. */
	@XmlElement(required=true)
	private long act2_end;
	
	/** The act3_target. */
	@XmlElement(required = true)
	private String act3_target;
	
	/** The act3_type. */
	@XmlElement(required = true)
	private String act3_type;
	
	/** The act3_value. */
	@XmlElement(required = true)
	private double act3_value;
	
	/** The act3_start. */
	@XmlElement(required=true)
	private long act3_start;

	/** The act3_end. */
	@XmlElement(required=true)
	private long act3_end;

	/** The act4_target. */
	@XmlElement(required = true)
	private String act4_target;
	
	/** The act4_type. */
	@XmlElement(required = true)
	private String act4_type;
	
	/** The act4_value. */
	@XmlElement(required = true)
	private double act4_value;
	
	/** The act4_start. */
	@XmlElement(required=true)
	private long act4_start;

	/** The act4_end. */
	@XmlElement(required=true)
	private long act4_end;
	
	/** The act5_target. */
	@XmlElement(required = true)
	private String act5_target;
	
	/** The act5_type. */
	@XmlElement(required = true)
	private String act5_type;
	
	/** The act5_value. */
	@XmlElement(required = true)
	private double act5_value;
	
	/** The act5_start. */
	@XmlElement(required=true)
	private long act5_start;

	/** The act5_end. */
	@XmlElement(required=true)
	private long act5_end;
	
	/** The state. */
	@XmlElement(required = true)
	private String state;

	/** The note_aggr. */
	@XmlElement(required = true)
	private String note_aggr;

	/** The note_dso. */
	@XmlElement(required = true)
	private String note_dso;

	/** The author. */
	@XmlElement(required = true)
	private String author;
	
	/** The author_email. */
	@XmlElement(required = true)
	private String author_email;

	/**
	 * Gets the irp id.
	 *
	 * @return the irpID
	 */
	public String getIrpID() {
		return irpID;
	}

	/**
	 * Sets the irp id.
	 *
	 * @param irpID the irpID to set
	 */
	public void setIrpID(String irpID) {
		this.irpID = irpID;
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
	 * Gets the ecp_epp.
	 *
	 * @return the ecp_epp
	 */
	public String getEcp_epp() {
		return ecp_epp;
	}

	/**
	 * Sets the ecp_epp.
	 *
	 * @param ecp_epp the ecp_epp to set
	 */
	public void setEcp_epp(String ecp_epp) {
		this.ecp_epp = ecp_epp;
	}

	/**
	 * Gets the sector.
	 *
	 * @return the sector
	 */
	public String getSector() {
		return sector;
	}

	/**
	 * Sets the sector.
	 *
	 * @param sector the sector to set
	 */
	public void setSector(String sector) {
		this.sector = sector;
	}

	/**
	 * Gets the act1_target.
	 *
	 * @return the act1_target
	 */
	public String getAct1_target() {
		return act1_target;
	}

	/**
	 * Sets the act1_target.
	 *
	 * @param act1_target the act1_target to set
	 */
	public void setAct1_target(String act1_target) {
		this.act1_target = act1_target;
	}

	/**
	 * Gets the act1_type.
	 *
	 * @return the act1_type
	 */
	public String getAct1_type() {
		return act1_type;
	}

	/**
	 * Sets the act1_type.
	 *
	 * @param act1_type the act1_type to set
	 */
	public void setAct1_type(String act1_type) {
		this.act1_type = act1_type;
	}

	/**
	 * Gets the act1_value.
	 *
	 * @return the act1_value
	 */
	public double getAct1_value() {
		return act1_value;
	}

	/**
	 * Sets the act1_value.
	 *
	 * @param act1_value the act1_value to set
	 */
	public void setAct1_value(double act1_value) {
		this.act1_value = act1_value;
	}

	/**
	 * Gets the act1_start.
	 *
	 * @return the act1_start
	 */
	public long getAct1_start() {
		return act1_start;
	}

	/**
	 * Sets the act1_start.
	 *
	 * @param act1_start the act1_start to set
	 */
	public void setAct1_start(long act1_start) {
		this.act1_start = act1_start;
	}

	/**
	 * Gets the act1_end.
	 *
	 * @return the act1_end
	 */
	public long getAct1_end() {
		return act1_end;
	}

	/**
	 * Sets the act1_end.
	 *
	 * @param act1_end the act1_end to set
	 */
	public void setAct1_end(long act1_end) {
		this.act1_end = act1_end;
	}

	/**
	 * Gets the act2_target.
	 *
	 * @return the act2_target
	 */
	public String getAct2_target() {
		return act2_target;
	}

	/**
	 * Sets the act2_target.
	 *
	 * @param act2_target the act2_target to set
	 */
	public void setAct2_target(String act2_target) {
		this.act2_target = act2_target;
	}

	/**
	 * Gets the act2_type.
	 *
	 * @return the act2_type
	 */
	public String getAct2_type() {
		return act2_type;
	}

	/**
	 * Sets the act2_type.
	 *
	 * @param act2_type the act2_type to set
	 */
	public void setAct2_type(String act2_type) {
		this.act2_type = act2_type;
	}

	/**
	 * Gets the act2_value.
	 *
	 * @return the act2_value
	 */
	public double getAct2_value() {
		return act2_value;
	}

	/**
	 * Sets the act2_value.
	 *
	 * @param act2_value the act2_value to set
	 */
	public void setAct2_value(double act2_value) {
		this.act2_value = act2_value;
	}

	/**
	 * Gets the act2_start.
	 *
	 * @return the act2_start
	 */
	public long getAct2_start() {
		return act2_start;
	}

	/**
	 * Sets the act2_start.
	 *
	 * @param act2_start the act2_start to set
	 */
	public void setAct2_start(long act2_start) {
		this.act2_start = act2_start;
	}

	/**
	 * Gets the act2_end.
	 *
	 * @return the act2_end
	 */
	public long getAct2_end() {
		return act2_end;
	}

	/**
	 * Sets the act2_end.
	 *
	 * @param act2_end the act2_end to set
	 */
	public void setAct2_end(long act2_end) {
		this.act2_end = act2_end;
	}

	/**
	 * Gets the act3_target.
	 *
	 * @return the act3_target
	 */
	public String getAct3_target() {
		return act3_target;
	}

	/**
	 * Sets the act3_target.
	 *
	 * @param act3_target the act3_target to set
	 */
	public void setAct3_target(String act3_target) {
		this.act3_target = act3_target;
	}

	/**
	 * Gets the act3_type.
	 *
	 * @return the act3_type
	 */
	public String getAct3_type() {
		return act3_type;
	}

	/**
	 * Sets the act3_type.
	 *
	 * @param act3_type the act3_type to set
	 */
	public void setAct3_type(String act3_type) {
		this.act3_type = act3_type;
	}

	/**
	 * Gets the act3_value.
	 *
	 * @return the act3_value
	 */
	public double getAct3_value() {
		return act3_value;
	}

	/**
	 * Sets the act3_value.
	 *
	 * @param act3_value the act3_value to set
	 */
	public void setAct3_value(double act3_value) {
		this.act3_value = act3_value;
	}

	/**
	 * Gets the act3_start.
	 *
	 * @return the act3_start
	 */
	public long getAct3_start() {
		return act3_start;
	}

	/**
	 * Sets the act3_start.
	 *
	 * @param act3_start the act3_start to set
	 */
	public void setAct3_start(long act3_start) {
		this.act3_start = act3_start;
	}

	/**
	 * Gets the act3_end.
	 *
	 * @return the act3_end
	 */
	public long getAct3_end() {
		return act3_end;
	}

	/**
	 * Sets the act3_end.
	 *
	 * @param act3_end the act3_end to set
	 */
	public void setAct3_end(long act3_end) {
		this.act3_end = act3_end;
	}

	/**
	 * Gets the act4_target.
	 *
	 * @return the act4_target
	 */
	public String getAct4_target() {
		return act4_target;
	}

	/**
	 * Sets the act4_target.
	 *
	 * @param act4_target the act4_target to set
	 */
	public void setAct4_target(String act4_target) {
		this.act4_target = act4_target;
	}

	/**
	 * Gets the act4_type.
	 *
	 * @return the act4_type
	 */
	public String getAct4_type() {
		return act4_type;
	}

	/**
	 * Sets the act4_type.
	 *
	 * @param act4_type the act4_type to set
	 */
	public void setAct4_type(String act4_type) {
		this.act4_type = act4_type;
	}

	/**
	 * Gets the act4_value.
	 *
	 * @return the act4_value
	 */
	public double getAct4_value() {
		return act4_value;
	}

	/**
	 * Sets the act4_value.
	 *
	 * @param act4_value the act4_value to set
	 */
	public void setAct4_value(double act4_value) {
		this.act4_value = act4_value;
	}

	/**
	 * Gets the act4_start.
	 *
	 * @return the act4_start
	 */
	public long getAct4_start() {
		return act4_start;
	}

	/**
	 * Sets the act4_start.
	 *
	 * @param act4_start the act4_start to set
	 */
	public void setAct4_start(long act4_start) {
		this.act4_start = act4_start;
	}

	/**
	 * Gets the act4_end.
	 *
	 * @return the act4_end
	 */
	public long getAct4_end() {
		return act4_end;
	}

	/**
	 * Sets the act4_end.
	 *
	 * @param act4_end the act4_end to set
	 */
	public void setAct4_end(long act4_end) {
		this.act4_end = act4_end;
	}

	/**
	 * Gets the act5_target.
	 *
	 * @return the act5_target
	 */
	public String getAct5_target() {
		return act5_target;
	}

	/**
	 * Sets the act5_target.
	 *
	 * @param act5_target the act5_target to set
	 */
	public void setAct5_target(String act5_target) {
		this.act5_target = act5_target;
	}

	/**
	 * Gets the act5_type.
	 *
	 * @return the act5_type
	 */
	public String getAct5_type() {
		return act5_type;
	}

	/**
	 * Sets the act5_type.
	 *
	 * @param act5_type the act5_type to set
	 */
	public void setAct5_type(String act5_type) {
		this.act5_type = act5_type;
	}

	/**
	 * Gets the act5_value.
	 *
	 * @return the act5_value
	 */
	public double getAct5_value() {
		return act5_value;
	}

	/**
	 * Sets the act5_value.
	 *
	 * @param act5_value the act5_value to set
	 */
	public void setAct5_value(double act5_value) {
		this.act5_value = act5_value;
	}

	/**
	 * Gets the act5_start.
	 *
	 * @return the act5_start
	 */
	public long getAct5_start() {
		return act5_start;
	}

	/**
	 * Sets the act5_start.
	 *
	 * @param act5_start the act5_start to set
	 */
	public void setAct5_start(long act5_start) {
		this.act5_start = act5_start;
	}

	/**
	 * Gets the act5_end.
	 *
	 * @return the act5_end
	 */
	public long getAct5_end() {
		return act5_end;
	}

	/**
	 * Sets the act5_end.
	 *
	 * @param act5_end the act5_end to set
	 */
	public void setAct5_end(long act5_end) {
		this.act5_end = act5_end;
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
	 * Gets the note_aggr.
	 *
	 * @return the note_aggr
	 */
	public String getNote_aggr() {
		return note_aggr;
	}

	/**
	 * Sets the note_aggr.
	 *
	 * @param note_aggr the note_aggr to set
	 */
	public void setNote_aggr(String note_aggr) {
		this.note_aggr = note_aggr;
	}

	/**
	 * Gets the note_dso.
	 *
	 * @return the note_dso
	 */
	public String getNote_dso() {
		return note_dso;
	}

	/**
	 * Sets the note_dso.
	 *
	 * @param note_dso the note_dso to set
	 */
	public void setNote_dso(String note_dso) {
		this.note_dso = note_dso;
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
