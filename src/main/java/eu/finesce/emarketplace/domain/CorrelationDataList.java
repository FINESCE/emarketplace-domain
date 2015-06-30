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
 * The Class CorrelationDataList.
 */
@XmlRootElement(name="corrCloudProduction")
@XmlAccessorType(XmlAccessType.FIELD)

public class CorrelationDataList {

	/** The key. */
	@XmlElement(required=true)
	private Double key;
	
	/** The value. */
	@XmlElement(required=true)
	private Double value;
	
	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public Double getKey() {
		return key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key the key to set
	 */
	public void setKey(Double key) {
		this.key = key;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public Double getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value the value to set
	 */
	public void setValue(Double value) {
		this.value = value;
	}


}
