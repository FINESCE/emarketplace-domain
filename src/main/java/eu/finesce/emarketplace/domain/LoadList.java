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

import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * The Class LoadList.
 */
@XmlRootElement(name = "loadList")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		  "loadList"
		  })
public class LoadList implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The load list. */
	@XmlElement(name="load", required = true)
	private ArrayList<Load> loadList;

	/**
	 * Gets the load list.
	 *
	 * @return the loadList
	 */
	public ArrayList<Load> getLoadList() {
		return loadList;
	}

	/**
	 * Sets the load list.
	 *
	 * @param loadList the loadList to set
	 */
	public void setLoadList(ArrayList<Load> loadList) {
		this.loadList = loadList;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoadList [loadList=" + loadList + "]";
	}
	
	/**
	 * To xml.
	 */
	public void toXml() {
	    try {
	        JAXBContext ctx = JAXBContext.newInstance(LoadList.class);
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
