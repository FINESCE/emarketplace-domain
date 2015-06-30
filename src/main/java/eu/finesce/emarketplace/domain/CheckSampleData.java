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
 * The Class CheckSampleData.
 */
@XmlRootElement(name = "checkSampleData")
@XmlAccessorType(XmlAccessType.FIELD)
public class CheckSampleData {

	/** The Uts. */
	@XmlElement(required = true)
	private long Uts;
	
	/** The loaddata list. */
	@XmlElement(name="LoadDataList", type=CheckSampleDataList.class)
    List<CheckSampleDataList> loaddataList;

	/**
	 * Gets the uts.
	 *
	 * @return the uts
	 */
	public long getUts() {
		return Uts;
	}

	/**
	 * Sets the uts.
	 *
	 * @param uts the uts to set
	 */
	public void setUts(long uts) {
		Uts = uts;
	}

	/**
	 * Gets the loaddata list.
	 *
	 * @return the loaddataList
	 */
	public List<CheckSampleDataList> getLoaddataList() {
		return loaddataList;
	}

	/**
	 * Sets the loaddata list.
	 *
	 * @param loaddataList the loaddataList to set
	 */
	public void setLoaddataList(List<CheckSampleDataList> loaddataList) {
		this.loaddataList = loaddataList;
	}
	


	
}
