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
 * The Class HistSocialEvent.
 */
@XmlRootElement(name = "histSocialEvent")
@XmlAccessorType(XmlAccessType.FIELD)
public class HistSocialEvent {



	/** The last event number. */
	@XmlElement(required = true)
	private long lastEventNumber;
	
	/** The current time. */
	@XmlElement(required = true)
	private long currentTime;

    
	/** The socialevent list. */
	@XmlElement(name="HistSocialEventList", type=HistSocialEventList.class)
    List<HistSocialEventList> socialeventList;


	/**
	 * Instantiates a new hist social event.
	 */
	public	HistSocialEvent(){};

	/**
	 * Gets the last event number.
	 *
	 * @return the lastEventNumber
	 */
	public Long getLastEventNumber() {
		return lastEventNumber;
	}


	/**
	 * Sets the last event number.
	 *
	 * @param lastEventNumber the lastEventNumber to set
	 */
	public void setLastEventNumber(Long lastEventNumber) {
		this.lastEventNumber = lastEventNumber;
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
	 * Gets the socialevent list.
	 *
	 * @return the socialeventList
	 */
	public List<HistSocialEventList> getSocialeventList() {
		return socialeventList;
	}


	/**
	 * Sets the socialevent list.
	 *
	 * @param socialeventList the socialeventList to set
	 */
	public void setSocialeventList(List<HistSocialEventList> socialeventList) {
		this.socialeventList = socialeventList;
	}

	
	
}
