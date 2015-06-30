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
 * The Class RestErrorMessage.
 */
@XmlRootElement(name = "RestErrorMessage")
@XmlAccessorType(XmlAccessType.FIELD)
public class RestErrorMessage {

	/** The rest method. */
	@XmlElement(required = true)
	private String restMethod;

	
	/** The error message. */
	@XmlElement(required = true)
	private String errorMessage;

	/**
	 * Gets the rest method.
	 *
	 * @return the restMethod
	 */
	public String getRestMethod() {
		return restMethod;
	}

	/**
	 * Sets the rest method.
	 *
	 * @param restMethod the restMethod to set
	 */
	public void setRestMethod(String restMethod) {
		this.restMethod = restMethod;
	}

	/**
	 * Gets the error message.
	 *
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}

	/**
	 * Sets the error message.
	 *
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
