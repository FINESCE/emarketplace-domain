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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;


// TODO: Auto-generated Javadoc
/**
 * The Class WeatherDataList.
 */
@XmlRootElement(name="weatherDataList")
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherDataList {
	

	/** The weather date time. */
	@XmlElement(required=true)
	private String weatherDateTime;
	
	/** The weather current time. */
	@XmlElement(required=true)
	private long   weatherCurrentTime;
	
	/** The Temperature. */
	@XmlElement(required=true)
	private double Temperature;
		
	/** The Cloud cover. */
	@XmlElement(required=true)	
    private double CloudCover;  
	
	/** The Weather condition. */
	@XmlElement(required=true)
	private String WeatherCondition;
	
	/** The Wind speed. */
	@XmlElement(required=true)
	private double WindSpeed;

	/** The daily sunrise time. */
	@XmlElement(required=true)
	private long   dailySunriseTime;
	
	/** The daily sunset time. */
	@XmlElement(required=true)
	private long   dailySunsetTime;
	
	/** The temperature min. */
	@XmlElement(required=true)
	private double temperatureMin;
	
	/** The temperature max. */
	@XmlElement(required=true)
	private double temperatureMax;

	
	/**
	 * Gets the weather date time.
	 *
	 * @return the weatherDateTime
	 */
	public String getWeatherDateTime() {
		return weatherDateTime;
	}

	/**
	 * Sets the weather date time.
	 *
	 * @param weatherDateTime the weatherDateTime to set
	 */
	public void setWeatherDateTime(String weatherDateTime) {
		this.weatherDateTime = weatherDateTime;
	}

	/**
	 * Gets the weather current time.
	 *
	 * @return the weatherCurrentTime
	 */
	public long getWeatherCurrentTime() {
		return weatherCurrentTime;
	}

	/**
	 * Sets the weather current time.
	 *
	 * @param weatherCurrentTime the weatherCurrentTime to set
	 */
	public void setWeatherCurrentTime(long weatherCurrentTime) {
		this.weatherCurrentTime = weatherCurrentTime;
	}

	/**
	 * Gets the temperature.
	 *
	 * @return the temperature
	 */
	public double getTemperature() {
		return Temperature;
	}

	/**
	 * Sets the temperature.
	 *
	 * @param temperature the temperature to set
	 */
	public void setTemperature(double temperature) {
		Temperature = temperature;
	}

	/**
	 * Gets the cloud cover.
	 *
	 * @return the cloudCover
	 */
	public double getCloudCover() {
		return CloudCover;
	}

	/**
	 * Sets the cloud cover.
	 *
	 * @param cloudCover the cloudCover to set
	 */
	public void setCloudCover(double cloudCover) {
		CloudCover = cloudCover;
	}

	/**
	 * Gets the weather condition.
	 *
	 * @return the weatherCondition
	 */
	public String getWeatherCondition() {
		return WeatherCondition;
	}

	/**
	 * Sets the weather condition.
	 *
	 * @param weatherCondition the weatherCondition to set
	 */
	public void setWeatherCondition(String weatherCondition) {
		WeatherCondition = weatherCondition;
	}

	/**
	 * Gets the wind speed.
	 *
	 * @return the windSpeed
	 */
	public double getWindSpeed() {
		return WindSpeed;
	}

	/**
	 * Sets the wind speed.
	 *
	 * @param windSpeed the windSpeed to set
	 */
	public void setWindSpeed(double windSpeed) {
		WindSpeed = windSpeed;
	}

	/**
	 * Gets the daily sunrise time.
	 *
	 * @return the dailySunriseTime
	 */
	public long getDailySunriseTime() {
		return dailySunriseTime;
	}

	/**
	 * Sets the daily sunrise time.
	 *
	 * @param dailySunriseTime the dailySunriseTime to set
	 */
	public void setDailySunriseTime(long dailySunriseTime) {
		this.dailySunriseTime = dailySunriseTime;
	}

	/**
	 * Gets the daily sunset time.
	 *
	 * @return the dailySunsetTime
	 */
	public long getDailySunsetTime() {
		return dailySunsetTime;
	}

	/**
	 * Sets the daily sunset time.
	 *
	 * @param dailySunsetTime the dailySunsetTime to set
	 */
	public void setDailySunsetTime(long dailySunsetTime) {
		this.dailySunsetTime = dailySunsetTime;
	}

	/**
	 * Gets the temperature min.
	 *
	 * @return the temperatureMin
	 */
	public double getTemperatureMin() {
		return temperatureMin;
	}

	/**
	 * Sets the temperature min.
	 *
	 * @param temperatureMin the temperatureMin to set
	 */
	public void setTemperatureMin(double temperatureMin) {
		this.temperatureMin = temperatureMin;
	}

	/**
	 * Gets the temperature max.
	 *
	 * @return the temperatureMax
	 */
	public double getTemperatureMax() {
		return temperatureMax;
	}

	/**
	 * Sets the temperature max.
	 *
	 * @param temperatureMax the temperatureMax to set
	 */
	public void setTemperatureMax(double temperatureMax) {
		this.temperatureMax = temperatureMax;
	}
	
	    
}
