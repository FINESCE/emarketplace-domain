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


/**
 * The Class WeatherForecast.
 */
@XmlRootElement(name="weather")
@XmlAccessorType(XmlAccessType.FIELD)
public class WeatherForecast {
	

	/** The weather id. */
	@XmlElement(required=true)
	private String weatherID;
	
	/** The current temperature. */
	@XmlElement(required=true)
	private double currentTemperature;
	
	/** The current cloud cover. */
	@XmlElement(required=true)	
    private double currentCloudCover;  
	
	/** The current weather condition. */
	@XmlElement(required=true)
	private String currentWeatherCondition;
	
	/** The current wind speed. */
	@XmlElement(required=true)
	private double currentWindSpeed;
	
	/** The current time. */
	@XmlElement(required=true)
	private long   currentTime;
	
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
	
	/** The after1h time. */
	@XmlElement(required=true)
	private long   after1hTime;
	
	/** The after1h temperature. */
	@XmlElement(required=true)
	private double after1hTemperature;
	
	/** The after1h cloud cover. */
	@XmlElement(required=true)
	private double after1hCloudCover;
	
	/** The after1h wind speed. */
	@XmlElement(required=true)
	private double after1hWindSpeed;

	/** The after1h precip intensity. */
	@XmlElement(required=true)
	private double after1hPrecipIntensity;
	
	/** The after1h precip probability. */
	@XmlElement(required=true)
	private double after1hPrecipProbability;
	
	/** The after2h time. */
	@XmlElement(required=true)
	private long   after2hTime;
	
	/** The after2h temperature. */
	@XmlElement(required=true)
	private double after2hTemperature;
	
	/** The after2h cloud cover. */
	@XmlElement(required=true)
	private double after2hCloudCover;
	
	/** The after2h wind speed. */
	@XmlElement(required=true)
	private double after2hWindSpeed;

	/** The after2h precip intensity. */
	@XmlElement(required=true)
	private double after2hPrecipIntensity;
	
	/** The after2h precip probability. */
	@XmlElement(required=true)
	private double after2hPrecipProbability;

	/** The after3h time. */
	@XmlElement(required=true)
	private long   after3hTime;
	
	/** The after3h temperature. */
	@XmlElement(required=true)
	private double after3hTemperature;
	
	/** The after3h cloud cover. */
	@XmlElement(required=true)
	private double after3hCloudCover;
	
	/** The after3h wind speed. */
	@XmlElement(required=true)
	private double after3hWindSpeed;
	
	/** The after3h precip intensity. */
	@XmlElement(required=true)
	private double after3hPrecipIntensity;
	
	/** The after3h precip probability. */
	@XmlElement(required=true)
	private double after3hPrecipProbability;
	
	/** The after4h time. */
	@XmlElement(required=true)
	private long   after4hTime;
	
	/** The after4h temperature. */
	@XmlElement(required=true)
	private double after4hTemperature;
	
	/** The after4h cloud cover. */
	@XmlElement(required=true)
	private double after4hCloudCover;
	
	/** The after4h wind speed. */
	@XmlElement(required=true)
	private double after4hWindSpeed;

	/** The after4h precip intensity. */
	@XmlElement(required=true)
	private double after4hPrecipIntensity;
	
	/** The after4h precip probability. */
	@XmlElement(required=true)
	private double after4hPrecipProbability;
	
	/** The after5h time. */
	@XmlElement(required=true)
	private long   after5hTime;
	
	/** The after5h temperature. */
	@XmlElement(required=true)
	private double after5hTemperature;
	
	/** The after5h cloud cover. */
	@XmlElement(required=true)
	private double after5hCloudCover;
	
	/** The after5h wind speed. */
	@XmlElement(required=true)
	private double after5hWindSpeed;

	/** The after5h precip intensity. */
	@XmlElement(required=true)
	private double after5hPrecipIntensity;
	
	/** The after5h precip probability. */
	@XmlElement(required=true)
	private double after5hPrecipProbability;
	
	/** The after6h time. */
	@XmlElement(required=true)
	private long   after6hTime;
	
	/** The after6h temperature. */
	@XmlElement(required=true)
	private double after6hTemperature;
	
	/** The after6h cloud cover. */
	@XmlElement(required=true)
	private double after6hCloudCover;
	
	/** The after6h wind speed. */
	@XmlElement(required=true)
	private double after6hWindSpeed;

	/** The after6h precip intensity. */
	@XmlElement(required=true)
	private double after6hPrecipIntensity;
	
	/** The after6h precip probability. */
	@XmlElement(required=true)
	private double after6hPrecipProbability;

	/** The after7h time. */
	@XmlElement(required=true)
	private long   after7hTime;
	
	/** The after7h temperature. */
	@XmlElement(required=true)
	private double after7hTemperature;
	
	/** The after7h cloud cover. */
	@XmlElement(required=true)
	private double after7hCloudCover;
	
	/** The after7h wind speed. */
	@XmlElement(required=true)
	private double after7hWindSpeed;

	/** The after7h precip intensity. */
	@XmlElement(required=true)
	private double after7hPrecipIntensity;
	
	/** The after7h precip probability. */
	@XmlElement(required=true)
	private double after7hPrecipProbability;

	/** The after8h time. */
	@XmlElement(required=true)
	private long   after8hTime;
	
	/** The after8h temperature. */
	@XmlElement(required=true)
	private double after8hTemperature;
	
	/** The after8h cloud cover. */
	@XmlElement(required=true)
	private double after8hCloudCover;
	
	/** The after8h wind speed. */
	@XmlElement(required=true)
	private double after8hWindSpeed;

	/** The after8h precip intensity. */
	@XmlElement(required=true)
	private double after8hPrecipIntensity;
	
	/** The after8h precip probability. */
	@XmlElement(required=true)
	private double after8hPrecipProbability;

	/** The after9h time. */
	@XmlElement(required=true)
	private long   after9hTime;
	
	/** The after9h temperature. */
	@XmlElement(required=true)
	private double after9hTemperature;
	
	/** The after9h cloud cover. */
	@XmlElement(required=true)
	private double after9hCloudCover;
	
	/** The after9h wind speed. */
	@XmlElement(required=true)
	private double after9hWindSpeed;

	/** The after9h precip intensity. */
	@XmlElement(required=true)
	private double after9hPrecipIntensity;
	
	/** The after9h precip probability. */
	@XmlElement(required=true)
	private double after9hPrecipProbability;

	/** The after10h time. */
	@XmlElement(required=true)
	private long   after10hTime;
	
	/** The after10h temperature. */
	@XmlElement(required=true)
	private double after10hTemperature;
	
	/** The after10h cloud cover. */
	@XmlElement(required=true)
	private double after10hCloudCover;
	
	/** The after10h wind speed. */
	@XmlElement(required=true)
	private double after10hWindSpeed;

	/** The after10h precip intensity. */
	@XmlElement(required=true)
	private double after10hPrecipIntensity;
	
	/** The after10h precip probability. */
	@XmlElement(required=true)
	private double after10hPrecipProbability;

	/** The after11h time. */
	@XmlElement(required=true)
	private long   after11hTime;
	
	/** The after11h temperature. */
	@XmlElement(required=true)
	private double after11hTemperature;
	
	/** The after11h cloud cover. */
	@XmlElement(required=true)
	private double after11hCloudCover;
	
	/** The after11h wind speed. */
	@XmlElement(required=true)
	private double after11hWindSpeed;

	/** The after11h precip intensity. */
	@XmlElement(required=true)
	private double after11hPrecipIntensity;
	
	/** The after11h precip probability. */
	@XmlElement(required=true)
	private double after11hPrecipProbability;

	/** The after12h time. */
	@XmlElement(required=true)
	private long   after12hTime;
	
	/** The after12h temperature. */
	@XmlElement(required=true)
	private double after12hTemperature;
	
	/** The after12h cloud cover. */
	@XmlElement(required=true)
	private double after12hCloudCover;
	
	/** The after12h wind speed. */
	@XmlElement(required=true)
	private double after12hWindSpeed;
	
	/** The after12h precip intensity. */
	@XmlElement(required=true)
	private double after12hPrecipIntensity;

	/** The after12h precip probability. */
	@XmlElement(required=true)
	private double after12hPrecipProbability;
	
	/** The after13h time. */
	@XmlElement(required=true)
	private long   after13hTime;
	
	/** The after13h temperature. */
	@XmlElement(required=true)
	private double after13hTemperature;
	
	/** The after13h cloud cover. */
	@XmlElement(required=true)
	private double after13hCloudCover;
	
	/** The after13h wind speed. */
	@XmlElement(required=true)
	private double after13hWindSpeed;

	/** The after13h precip intensity. */
	@XmlElement(required=true)
	private double after13hPrecipIntensity;
	
	/** The after13h precip probability. */
	@XmlElement(required=true)
	private double after13hPrecipProbability;

	/** The after14h time. */
	@XmlElement(required=true)
	private long   after14hTime;
	
	/** The after14h temperature. */
	@XmlElement(required=true)
	private double after14hTemperature;
	
	/** The after14h cloud cover. */
	@XmlElement(required=true)
	private double after14hCloudCover;
	
	/** The after14h wind speed. */
	@XmlElement(required=true)
	private double after14hWindSpeed;

	/** The after14h precip intensity. */
	@XmlElement(required=true)
	private double after14hPrecipIntensity;
	
	/** The after14h precip probability. */
	@XmlElement(required=true)
	private double after14hPrecipProbability;

	/** The after15h time. */
	@XmlElement(required=true)
	private long   after15hTime;
	
	/** The after15h temperature. */
	@XmlElement(required=true)
	private double after15hTemperature;
	
	/** The after15h cloud cover. */
	@XmlElement(required=true)
	private double after15hCloudCover;
	
	/** The after15h wind speed. */
	@XmlElement(required=true)
	private double after15hWindSpeed;

	/** The after15h precip intensity. */
	@XmlElement(required=true)
	private double after15hPrecipIntensity;
	
	/** The after15h precip probability. */
	@XmlElement(required=true)
	private double after15hPrecipProbability;
	
	/** The after16h time. */
	@XmlElement(required=true)
	private long   after16hTime;
	
	/** The after16h temperature. */
	@XmlElement(required=true)
	private double after16hTemperature;
	
	/** The after16h cloud cover. */
	@XmlElement(required=true)
	private double after16hCloudCover;
	
	/** The after16h wind speed. */
	@XmlElement(required=true)
	private double after16hWindSpeed;

	/** The after16h precip intensity. */
	@XmlElement(required=true)
	private double after16hPrecipIntensity;
	
	/** The after16h precip probability. */
	@XmlElement(required=true)
	private double after16hPrecipProbability;
	
	/** The after17h time. */
	@XmlElement(required=true)
	private long   after17hTime;
	
	/** The after17h temperature. */
	@XmlElement(required=true)
	private double after17hTemperature;
	
	/** The after17h cloud cover. */
	@XmlElement(required=true)
	private double after17hCloudCover;
	
	/** The after17h wind speed. */
	@XmlElement(required=true)
	private double after17hWindSpeed;

	/** The after17h precip intensity. */
	@XmlElement(required=true)
	private double after17hPrecipIntensity;
	
	/** The after17h precip probability. */
	@XmlElement(required=true)
	private double after17hPrecipProbability;

	/** The after18h time. */
	@XmlElement(required=true)
	private long   after18hTime;
	
	/** The after18h temperature. */
	@XmlElement(required=true)
	private double after18hTemperature;
	
	/** The after18h cloud cover. */
	@XmlElement(required=true)
	private double after18hCloudCover;
	
	/** The after18h wind speed. */
	@XmlElement(required=true)
	private double after18hWindSpeed;

	/** The after18h precip intensity. */
	@XmlElement(required=true)
	private double after18hPrecipIntensity;
	
	/** The after18h precip probability. */
	@XmlElement(required=true)
	private double after18hPrecipProbability;
	
	/** The after19h time. */
	@XmlElement(required=true)
	private long   after19hTime;
	
	/** The after19h temperature. */
	@XmlElement(required=true)
	private double after19hTemperature;
	
	/** The after19h cloud cover. */
	@XmlElement(required=true)
	private double after19hCloudCover;
	
	/** The after19h wind speed. */
	@XmlElement(required=true)
	private double after19hWindSpeed;

	/** The after19h precip intensity. */
	@XmlElement(required=true)
	private double after19hPrecipIntensity;
	
	/** The after19h precip probability. */
	@XmlElement(required=true)
	private double after19hPrecipProbability;

	/** The after20h time. */
	@XmlElement(required=true)
	private long   after20hTime;
	
	/** The after20h temperature. */
	@XmlElement(required=true)
	private double after20hTemperature;
	
	/** The after20h cloud cover. */
	@XmlElement(required=true)
	private double after20hCloudCover;
	
	/** The after20h wind speed. */
	@XmlElement(required=true)
	private double after20hWindSpeed;

	/** The after20h precip intensity. */
	@XmlElement(required=true)
	private double after20hPrecipIntensity;
	
	/** The after20h precip probability. */
	@XmlElement(required=true)
	private double after20hPrecipProbability;

	/** The after21h time. */
	@XmlElement(required=true)
	private long   after21hTime;
	
	/** The after21h temperature. */
	@XmlElement(required=true)
	private double after21hTemperature;
	
	/** The after21h cloud cover. */
	@XmlElement(required=true)
	private double after21hCloudCover;
	
	/** The after21h wind speed. */
	@XmlElement(required=true)
	private double after21hWindSpeed;

	/** The after21h precip intensity. */
	@XmlElement(required=true)
	private double after21hPrecipIntensity;
	
	/** The after21h precip probability. */
	@XmlElement(required=true)
	private double after21hPrecipProbability;
	
	/** The after22h time. */
	@XmlElement(required=true)
	private long   after22hTime;
	
	/** The after22h temperature. */
	@XmlElement(required=true)
	private double after22hTemperature;
	
	/** The after22h cloud cover. */
	@XmlElement(required=true)
	private double after22hCloudCover;
	
	/** The after22h wind speed. */
	@XmlElement(required=true)
	private double after22hWindSpeed;

	/** The after22h precip intensity. */
	@XmlElement(required=true)
	private double after22hPrecipIntensity;
	
	/** The after22h precip probability. */
	@XmlElement(required=true)
	private double after22hPrecipProbability;
	
	/** The after23h time. */
	@XmlElement(required=true)
	private long   after23hTime;
	
	/** The after23h temperature. */
	@XmlElement(required=true)
	private double after23hTemperature;
	
	/** The after23h cloud cover. */
	@XmlElement(required=true)
	private double after23hCloudCover;
	
	/** The after23h wind speed. */
	@XmlElement(required=true)
	private double after23hWindSpeed;

	/** The after23h precip intensity. */
	@XmlElement(required=true)
	private double after23hPrecipIntensity;
	
	/** The after23h precip probability. */
	@XmlElement(required=true)
	private double after23hPrecipProbability;

	/** The after24h time. */
	@XmlElement(required=true)
	private long   after24hTime;
	
	/** The after24h temperature. */
	@XmlElement(required=true)
	private double after24hTemperature;
	
	/** The after24h cloud cover. */
	@XmlElement(required=true)
	private double after24hCloudCover;
	
	/** The after24h wind speed. */
	@XmlElement(required=true)
	private double after24hWindSpeed;

	/** The after24h precip intensity. */
	@XmlElement(required=true)
	private double after24hPrecipIntensity;
	
	/** The after24h precip probability. */
	@XmlElement(required=true)
	private double after24hPrecipProbability;

	/**
	 * Gets the weather id.
	 *
	 * @return the weather id
	 */
	public String getWeatherID() {
		return weatherID;
	}

	/**
	 * Sets the weather id.
	 *
	 * @param weatherID the new weather id
	 */
	public void setWeatherID(String weatherID) {
		this.weatherID = weatherID;
	}

	/**
	 * Gets the current temperature.
	 *
	 * @return the current temperature
	 */
	public double getCurrentTemperature() {
		return currentTemperature;
	}

	/**
	 * Sets the current temperature.
	 *
	 * @param currentTemperature the new current temperature
	 */
	public void setCurrentTemperature(double currentTemperature) {
		this.currentTemperature = currentTemperature;
	}

	/**
	 * Gets the current cloud cover.
	 *
	 * @return the current cloud cover
	 */
	public double getCurrentCloudCover() {
		return currentCloudCover;
	}

	/**
	 * Sets the current cloud cover.
	 *
	 * @param currentCloudCover the new current cloud cover
	 */
	public void setCurrentCloudCover(double currentCloudCover) {
		this.currentCloudCover = currentCloudCover;
	}

	/**
	 * Gets the current weather condition.
	 *
	 * @return the current weather condition
	 */
	public String getCurrentWeatherCondition() {
		return currentWeatherCondition;
	}

	/**
	 * Sets the current weather condition.
	 *
	 * @param currentWeatherCondition the new current weather condition
	 */
	public void setCurrentWeatherCondition(String currentWeatherCondition) {
		this.currentWeatherCondition = currentWeatherCondition;
	}

	/**
	 * Gets the current wind speed.
	 *
	 * @return the current wind speed
	 */
	public double getCurrentWindSpeed() {
		return currentWindSpeed;
	}

	/**
	 * Sets the current wind speed.
	 *
	 * @param currentWindSpeed the new current wind speed
	 */
	public void setCurrentWindSpeed(double currentWindSpeed) {
		this.currentWindSpeed = currentWindSpeed;
	}

	/**
	 * Gets the current time.
	 *
	 * @return the current time
	 */
	public long getCurrentTime() {
		return currentTime;
	}

	/**
	 * Sets the current time.
	 *
	 * @param currentTime the new current time
	 */
	public void setCurrentTime(long currentTime) {
		this.currentTime = currentTime;
	}

	/**
	 * Gets the daily sunrise time.
	 *
	 * @return the daily sunrise time
	 */
	public long getDailySunriseTime() {
		return dailySunriseTime;
	}

	/**
	 * Sets the daily sunrise time.
	 *
	 * @param dailySunriseTime the new daily sunrise time
	 */
	public void setDailySunriseTime(long dailySunriseTime) {
		this.dailySunriseTime = dailySunriseTime;
	}

	/**
	 * Gets the daily sunset time.
	 *
	 * @return the daily sunset time
	 */
	public long getDailySunsetTime() {
		return dailySunsetTime;
	}

	/**
	 * Sets the daily sunset time.
	 *
	 * @param dailySunsetTime the new daily sunset time
	 */
	public void setDailySunsetTime(long dailySunsetTime) {
		this.dailySunsetTime = dailySunsetTime;
	}

	/**
	 * Gets the temperature min.
	 *
	 * @return the temperature min
	 */
	public double getTemperatureMin() {
		return temperatureMin;
	}

	/**
	 * Sets the temperature min.
	 *
	 * @param temperatureMin the new temperature min
	 */
	public void setTemperatureMin(double temperatureMin) {
		this.temperatureMin = temperatureMin;
	}

	/**
	 * Gets the temperature max.
	 *
	 * @return the temperature max
	 */
	public double getTemperatureMax() {
		return temperatureMax;
	}

	/**
	 * Sets the temperature max.
	 *
	 * @param temperatureMax the new temperature max
	 */
	public void setTemperatureMax(double temperatureMax) {
		this.temperatureMax = temperatureMax;
	}

	/**
	 * Gets the after1h time.
	 *
	 * @return the after1h time
	 */
	public long getAfter1hTime() {
		return after1hTime;
	}

	/**
	 * Sets the after1h time.
	 *
	 * @param after1hTime the new after1h time
	 */
	public void setAfter1hTime(long after1hTime) {
		this.after1hTime = after1hTime;
	}

	/**
	 * Gets the after1h temperature.
	 *
	 * @return the after1h temperature
	 */
	public double getAfter1hTemperature() {
		return after1hTemperature;
	}

	/**
	 * Sets the after1h temperature.
	 *
	 * @param after1hTemperature the new after1h temperature
	 */
	public void setAfter1hTemperature(double after1hTemperature) {
		this.after1hTemperature = after1hTemperature;
	}

	/**
	 * Gets the after1h cloud cover.
	 *
	 * @return the after1h cloud cover
	 */
	public double getAfter1hCloudCover() {
		return after1hCloudCover;
	}

	/**
	 * Sets the after1h cloud cover.
	 *
	 * @param after1hCloudCover the new after1h cloud cover
	 */
	public void setAfter1hCloudCover(double after1hCloudCover) {
		this.after1hCloudCover = after1hCloudCover;
	}

	/**
	 * Gets the after1h wind speed.
	 *
	 * @return the after1h wind speed
	 */
	public double getAfter1hWindSpeed() {
		return after1hWindSpeed;
	}

	/**
	 * Sets the after1h wind speed.
	 *
	 * @param after1hWindSpeed the new after1h wind speed
	 */
	public void setAfter1hWindSpeed(double after1hWindSpeed) {
		this.after1hWindSpeed = after1hWindSpeed;
	}

	/**
	 * Gets the after1h precip intensity.
	 *
	 * @return the after1h precip intensity
	 */
	public double getAfter1hPrecipIntensity() {
		return after1hPrecipIntensity;
	}

	/**
	 * Sets the after1h precip intensity.
	 *
	 * @param after1hPrecipIntensity the new after1h precip intensity
	 */
	public void setAfter1hPrecipIntensity(double after1hPrecipIntensity) {
		this.after1hPrecipIntensity = after1hPrecipIntensity;
	}

	/**
	 * Gets the after1h precip probability.
	 *
	 * @return the after1h precip probability
	 */
	public double getAfter1hPrecipProbability() {
		return after1hPrecipProbability;
	}

	/**
	 * Sets the after1h precip probability.
	 *
	 * @param after1hPrecipProbability the new after1h precip probability
	 */
	public void setAfter1hPrecipProbability(double after1hPrecipProbability) {
		this.after1hPrecipProbability = after1hPrecipProbability;
	}

	/**
	 * Gets the after2h time.
	 *
	 * @return the after2h time
	 */
	public long getAfter2hTime() {
		return after2hTime;
	}

	/**
	 * Sets the after2h time.
	 *
	 * @param after2hTime the new after2h time
	 */
	public void setAfter2hTime(long after2hTime) {
		this.after2hTime = after2hTime;
	}

	/**
	 * Gets the after2h temperature.
	 *
	 * @return the after2h temperature
	 */
	public double getAfter2hTemperature() {
		return after2hTemperature;
	}

	/**
	 * Sets the after2h temperature.
	 *
	 * @param after2hTemperature the new after2h temperature
	 */
	public void setAfter2hTemperature(double after2hTemperature) {
		this.after2hTemperature = after2hTemperature;
	}

	/**
	 * Gets the after2h cloud cover.
	 *
	 * @return the after2h cloud cover
	 */
	public double getAfter2hCloudCover() {
		return after2hCloudCover;
	}

	/**
	 * Sets the after2h cloud cover.
	 *
	 * @param after2hCloudCover the new after2h cloud cover
	 */
	public void setAfter2hCloudCover(double after2hCloudCover) {
		this.after2hCloudCover = after2hCloudCover;
	}

	/**
	 * Gets the after2h wind speed.
	 *
	 * @return the after2h wind speed
	 */
	public double getAfter2hWindSpeed() {
		return after2hWindSpeed;
	}

	/**
	 * Sets the after2h wind speed.
	 *
	 * @param after2hWindSpeed the new after2h wind speed
	 */
	public void setAfter2hWindSpeed(double after2hWindSpeed) {
		this.after2hWindSpeed = after2hWindSpeed;
	}

	/**
	 * Gets the after2h precip intensity.
	 *
	 * @return the after2h precip intensity
	 */
	public double getAfter2hPrecipIntensity() {
		return after2hPrecipIntensity;
	}

	/**
	 * Sets the after2h precip intensity.
	 *
	 * @param after2hPrecipIntensity the new after2h precip intensity
	 */
	public void setAfter2hPrecipIntensity(double after2hPrecipIntensity) {
		this.after2hPrecipIntensity = after2hPrecipIntensity;
	}

	/**
	 * Gets the after2h precip probability.
	 *
	 * @return the after2h precip probability
	 */
	public double getAfter2hPrecipProbability() {
		return after2hPrecipProbability;
	}

	/**
	 * Sets the after2h precip probability.
	 *
	 * @param after2hPrecipProbability the new after2h precip probability
	 */
	public void setAfter2hPrecipProbability(double after2hPrecipProbability) {
		this.after2hPrecipProbability = after2hPrecipProbability;
	}

	/**
	 * Gets the after3h time.
	 *
	 * @return the after3h time
	 */
	public long getAfter3hTime() {
		return after3hTime;
	}

	/**
	 * Sets the after3h time.
	 *
	 * @param after3hTime the new after3h time
	 */
	public void setAfter3hTime(long after3hTime) {
		this.after3hTime = after3hTime;
	}

	/**
	 * Gets the after3h temperature.
	 *
	 * @return the after3h temperature
	 */
	public double getAfter3hTemperature() {
		return after3hTemperature;
	}

	/**
	 * Sets the after3h temperature.
	 *
	 * @param after3hTemperature the new after3h temperature
	 */
	public void setAfter3hTemperature(double after3hTemperature) {
		this.after3hTemperature = after3hTemperature;
	}

	/**
	 * Gets the after3h cloud cover.
	 *
	 * @return the after3h cloud cover
	 */
	public double getAfter3hCloudCover() {
		return after3hCloudCover;
	}

	/**
	 * Sets the after3h cloud cover.
	 *
	 * @param after3hCloudCover the new after3h cloud cover
	 */
	public void setAfter3hCloudCover(double after3hCloudCover) {
		this.after3hCloudCover = after3hCloudCover;
	}

	/**
	 * Gets the after3h wind speed.
	 *
	 * @return the after3h wind speed
	 */
	public double getAfter3hWindSpeed() {
		return after3hWindSpeed;
	}

	/**
	 * Sets the after3h wind speed.
	 *
	 * @param after3hWindSpeed the new after3h wind speed
	 */
	public void setAfter3hWindSpeed(double after3hWindSpeed) {
		this.after3hWindSpeed = after3hWindSpeed;
	}

	/**
	 * Gets the after3h precip intensity.
	 *
	 * @return the after3h precip intensity
	 */
	public double getAfter3hPrecipIntensity() {
		return after3hPrecipIntensity;
	}

	/**
	 * Sets the after3h precip intensity.
	 *
	 * @param after3hPrecipIntensity the new after3h precip intensity
	 */
	public void setAfter3hPrecipIntensity(double after3hPrecipIntensity) {
		this.after3hPrecipIntensity = after3hPrecipIntensity;
	}

	/**
	 * Gets the after3h precip probability.
	 *
	 * @return the after3h precip probability
	 */
	public double getAfter3hPrecipProbability() {
		return after3hPrecipProbability;
	}

	/**
	 * Sets the after3h precip probability.
	 *
	 * @param after3hPrecipProbability the new after3h precip probability
	 */
	public void setAfter3hPrecipProbability(double after3hPrecipProbability) {
		this.after3hPrecipProbability = after3hPrecipProbability;
	}

	/**
	 * Gets the after4h time.
	 *
	 * @return the after4h time
	 */
	public long getAfter4hTime() {
		return after4hTime;
	}

	/**
	 * Sets the after4h time.
	 *
	 * @param after4hTime the new after4h time
	 */
	public void setAfter4hTime(long after4hTime) {
		this.after4hTime = after4hTime;
	}

	/**
	 * Gets the after4h temperature.
	 *
	 * @return the after4h temperature
	 */
	public double getAfter4hTemperature() {
		return after4hTemperature;
	}

	/**
	 * Sets the after4h temperature.
	 *
	 * @param after4hTemperature the new after4h temperature
	 */
	public void setAfter4hTemperature(double after4hTemperature) {
		this.after4hTemperature = after4hTemperature;
	}

	/**
	 * Gets the after4h cloud cover.
	 *
	 * @return the after4h cloud cover
	 */
	public double getAfter4hCloudCover() {
		return after4hCloudCover;
	}

	/**
	 * Sets the after4h cloud cover.
	 *
	 * @param after4hCloudCover the new after4h cloud cover
	 */
	public void setAfter4hCloudCover(double after4hCloudCover) {
		this.after4hCloudCover = after4hCloudCover;
	}

	/**
	 * Gets the after4h wind speed.
	 *
	 * @return the after4h wind speed
	 */
	public double getAfter4hWindSpeed() {
		return after4hWindSpeed;
	}

	/**
	 * Sets the after4h wind speed.
	 *
	 * @param after4hWindSpeed the new after4h wind speed
	 */
	public void setAfter4hWindSpeed(double after4hWindSpeed) {
		this.after4hWindSpeed = after4hWindSpeed;
	}

	/**
	 * Gets the after4h precip intensity.
	 *
	 * @return the after4h precip intensity
	 */
	public double getAfter4hPrecipIntensity() {
		return after4hPrecipIntensity;
	}

	/**
	 * Sets the after4h precip intensity.
	 *
	 * @param after4hPrecipIntensity the new after4h precip intensity
	 */
	public void setAfter4hPrecipIntensity(double after4hPrecipIntensity) {
		this.after4hPrecipIntensity = after4hPrecipIntensity;
	}

	/**
	 * Gets the after4h precip probability.
	 *
	 * @return the after4h precip probability
	 */
	public double getAfter4hPrecipProbability() {
		return after4hPrecipProbability;
	}

	/**
	 * Sets the after4h precip probability.
	 *
	 * @param after4hPrecipProbability the new after4h precip probability
	 */
	public void setAfter4hPrecipProbability(double after4hPrecipProbability) {
		this.after4hPrecipProbability = after4hPrecipProbability;
	}

	/**
	 * Gets the after5h time.
	 *
	 * @return the after5h time
	 */
	public long getAfter5hTime() {
		return after5hTime;
	}

	/**
	 * Sets the after5h time.
	 *
	 * @param after5hTime the new after5h time
	 */
	public void setAfter5hTime(long after5hTime) {
		this.after5hTime = after5hTime;
	}

	/**
	 * Gets the after5h temperature.
	 *
	 * @return the after5h temperature
	 */
	public double getAfter5hTemperature() {
		return after5hTemperature;
	}

	/**
	 * Sets the after5h temperature.
	 *
	 * @param after5hTemperature the new after5h temperature
	 */
	public void setAfter5hTemperature(double after5hTemperature) {
		this.after5hTemperature = after5hTemperature;
	}

	/**
	 * Gets the after5h cloud cover.
	 *
	 * @return the after5h cloud cover
	 */
	public double getAfter5hCloudCover() {
		return after5hCloudCover;
	}

	/**
	 * Sets the after5h cloud cover.
	 *
	 * @param after5hCloudCover the new after5h cloud cover
	 */
	public void setAfter5hCloudCover(double after5hCloudCover) {
		this.after5hCloudCover = after5hCloudCover;
	}

	/**
	 * Gets the after5h wind speed.
	 *
	 * @return the after5h wind speed
	 */
	public double getAfter5hWindSpeed() {
		return after5hWindSpeed;
	}

	/**
	 * Sets the after5h wind speed.
	 *
	 * @param after5hWindSpeed the new after5h wind speed
	 */
	public void setAfter5hWindSpeed(double after5hWindSpeed) {
		this.after5hWindSpeed = after5hWindSpeed;
	}

	/**
	 * Gets the after5h precip intensity.
	 *
	 * @return the after5h precip intensity
	 */
	public double getAfter5hPrecipIntensity() {
		return after5hPrecipIntensity;
	}

	/**
	 * Sets the after5h precip intensity.
	 *
	 * @param after5hPrecipIntensity the new after5h precip intensity
	 */
	public void setAfter5hPrecipIntensity(double after5hPrecipIntensity) {
		this.after5hPrecipIntensity = after5hPrecipIntensity;
	}

	/**
	 * Gets the after5h precip probability.
	 *
	 * @return the after5h precip probability
	 */
	public double getAfter5hPrecipProbability() {
		return after5hPrecipProbability;
	}

	/**
	 * Sets the after5h precip probability.
	 *
	 * @param after5hPrecipProbability the new after5h precip probability
	 */
	public void setAfter5hPrecipProbability(double after5hPrecipProbability) {
		this.after5hPrecipProbability = after5hPrecipProbability;
	}

	/**
	 * Gets the after6h time.
	 *
	 * @return the after6h time
	 */
	public long getAfter6hTime() {
		return after6hTime;
	}

	/**
	 * Sets the after6h time.
	 *
	 * @param after6hTime the new after6h time
	 */
	public void setAfter6hTime(long after6hTime) {
		this.after6hTime = after6hTime;
	}

	/**
	 * Gets the after6h temperature.
	 *
	 * @return the after6h temperature
	 */
	public double getAfter6hTemperature() {
		return after6hTemperature;
	}

	/**
	 * Sets the after6h temperature.
	 *
	 * @param after6hTemperature the new after6h temperature
	 */
	public void setAfter6hTemperature(double after6hTemperature) {
		this.after6hTemperature = after6hTemperature;
	}

	/**
	 * Gets the after6h cloud cover.
	 *
	 * @return the after6h cloud cover
	 */
	public double getAfter6hCloudCover() {
		return after6hCloudCover;
	}

	/**
	 * Sets the after6h cloud cover.
	 *
	 * @param after6hCloudCover the new after6h cloud cover
	 */
	public void setAfter6hCloudCover(double after6hCloudCover) {
		this.after6hCloudCover = after6hCloudCover;
	}

	/**
	 * Gets the after6h wind speed.
	 *
	 * @return the after6h wind speed
	 */
	public double getAfter6hWindSpeed() {
		return after6hWindSpeed;
	}

	/**
	 * Sets the after6h wind speed.
	 *
	 * @param after6hWindSpeed the new after6h wind speed
	 */
	public void setAfter6hWindSpeed(double after6hWindSpeed) {
		this.after6hWindSpeed = after6hWindSpeed;
	}

	/**
	 * Gets the after6h precip intensity.
	 *
	 * @return the after6h precip intensity
	 */
	public double getAfter6hPrecipIntensity() {
		return after6hPrecipIntensity;
	}

	/**
	 * Sets the after6h precip intensity.
	 *
	 * @param after6hPrecipIntensity the new after6h precip intensity
	 */
	public void setAfter6hPrecipIntensity(double after6hPrecipIntensity) {
		this.after6hPrecipIntensity = after6hPrecipIntensity;
	}

	/**
	 * Gets the after6h precip probability.
	 *
	 * @return the after6h precip probability
	 */
	public double getAfter6hPrecipProbability() {
		return after6hPrecipProbability;
	}

	/**
	 * Sets the after6h precip probability.
	 *
	 * @param after6hPrecipProbability the new after6h precip probability
	 */
	public void setAfter6hPrecipProbability(double after6hPrecipProbability) {
		this.after6hPrecipProbability = after6hPrecipProbability;
	}

	/**
	 * Gets the after7h time.
	 *
	 * @return the after7h time
	 */
	public long getAfter7hTime() {
		return after7hTime;
	}

	/**
	 * Sets the after7h time.
	 *
	 * @param after7hTime the new after7h time
	 */
	public void setAfter7hTime(long after7hTime) {
		this.after7hTime = after7hTime;
	}

	/**
	 * Gets the after7h temperature.
	 *
	 * @return the after7h temperature
	 */
	public double getAfter7hTemperature() {
		return after7hTemperature;
	}

	/**
	 * Sets the after7h temperature.
	 *
	 * @param after7hTemperature the new after7h temperature
	 */
	public void setAfter7hTemperature(double after7hTemperature) {
		this.after7hTemperature = after7hTemperature;
	}

	/**
	 * Gets the after7h cloud cover.
	 *
	 * @return the after7h cloud cover
	 */
	public double getAfter7hCloudCover() {
		return after7hCloudCover;
	}

	/**
	 * Sets the after7h cloud cover.
	 *
	 * @param after7hCloudCover the new after7h cloud cover
	 */
	public void setAfter7hCloudCover(double after7hCloudCover) {
		this.after7hCloudCover = after7hCloudCover;
	}

	/**
	 * Gets the after7h wind speed.
	 *
	 * @return the after7h wind speed
	 */
	public double getAfter7hWindSpeed() {
		return after7hWindSpeed;
	}

	/**
	 * Sets the after7h wind speed.
	 *
	 * @param after7hWindSpeed the new after7h wind speed
	 */
	public void setAfter7hWindSpeed(double after7hWindSpeed) {
		this.after7hWindSpeed = after7hWindSpeed;
	}

	/**
	 * Gets the after7h precip intensity.
	 *
	 * @return the after7h precip intensity
	 */
	public double getAfter7hPrecipIntensity() {
		return after7hPrecipIntensity;
	}

	/**
	 * Sets the after7h precip intensity.
	 *
	 * @param after7hPrecipIntensity the new after7h precip intensity
	 */
	public void setAfter7hPrecipIntensity(double after7hPrecipIntensity) {
		this.after7hPrecipIntensity = after7hPrecipIntensity;
	}

	/**
	 * Gets the after7h precip probability.
	 *
	 * @return the after7h precip probability
	 */
	public double getAfter7hPrecipProbability() {
		return after7hPrecipProbability;
	}

	/**
	 * Sets the after7h precip probability.
	 *
	 * @param after7hPrecipProbability the new after7h precip probability
	 */
	public void setAfter7hPrecipProbability(double after7hPrecipProbability) {
		this.after7hPrecipProbability = after7hPrecipProbability;
	}

	/**
	 * Gets the after8h time.
	 *
	 * @return the after8h time
	 */
	public long getAfter8hTime() {
		return after8hTime;
	}

	/**
	 * Sets the after8h time.
	 *
	 * @param after8hTime the new after8h time
	 */
	public void setAfter8hTime(long after8hTime) {
		this.after8hTime = after8hTime;
	}

	/**
	 * Gets the after8h temperature.
	 *
	 * @return the after8h temperature
	 */
	public double getAfter8hTemperature() {
		return after8hTemperature;
	}

	/**
	 * Sets the after8h temperature.
	 *
	 * @param after8hTemperature the new after8h temperature
	 */
	public void setAfter8hTemperature(double after8hTemperature) {
		this.after8hTemperature = after8hTemperature;
	}

	/**
	 * Gets the after8h cloud cover.
	 *
	 * @return the after8h cloud cover
	 */
	public double getAfter8hCloudCover() {
		return after8hCloudCover;
	}

	/**
	 * Sets the after8h cloud cover.
	 *
	 * @param after8hCloudCover the new after8h cloud cover
	 */
	public void setAfter8hCloudCover(double after8hCloudCover) {
		this.after8hCloudCover = after8hCloudCover;
	}

	/**
	 * Gets the after8h wind speed.
	 *
	 * @return the after8h wind speed
	 */
	public double getAfter8hWindSpeed() {
		return after8hWindSpeed;
	}

	/**
	 * Sets the after8h wind speed.
	 *
	 * @param after8hWindSpeed the new after8h wind speed
	 */
	public void setAfter8hWindSpeed(double after8hWindSpeed) {
		this.after8hWindSpeed = after8hWindSpeed;
	}

	/**
	 * Gets the after8h precip intensity.
	 *
	 * @return the after8h precip intensity
	 */
	public double getAfter8hPrecipIntensity() {
		return after8hPrecipIntensity;
	}

	/**
	 * Sets the after8h precip intensity.
	 *
	 * @param after8hPrecipIntensity the new after8h precip intensity
	 */
	public void setAfter8hPrecipIntensity(double after8hPrecipIntensity) {
		this.after8hPrecipIntensity = after8hPrecipIntensity;
	}

	/**
	 * Gets the after8h precip probability.
	 *
	 * @return the after8h precip probability
	 */
	public double getAfter8hPrecipProbability() {
		return after8hPrecipProbability;
	}

	/**
	 * Sets the after8h precip probability.
	 *
	 * @param after8hPrecipProbability the new after8h precip probability
	 */
	public void setAfter8hPrecipProbability(double after8hPrecipProbability) {
		this.after8hPrecipProbability = after8hPrecipProbability;
	}

	/**
	 * Gets the after9h time.
	 *
	 * @return the after9h time
	 */
	public long getAfter9hTime() {
		return after9hTime;
	}

	/**
	 * Sets the after9h time.
	 *
	 * @param after9hTime the new after9h time
	 */
	public void setAfter9hTime(long after9hTime) {
		this.after9hTime = after9hTime;
	}

	/**
	 * Gets the after9h temperature.
	 *
	 * @return the after9h temperature
	 */
	public double getAfter9hTemperature() {
		return after9hTemperature;
	}

	/**
	 * Sets the after9h temperature.
	 *
	 * @param after9hTemperature the new after9h temperature
	 */
	public void setAfter9hTemperature(double after9hTemperature) {
		this.after9hTemperature = after9hTemperature;
	}

	/**
	 * Gets the after9h cloud cover.
	 *
	 * @return the after9h cloud cover
	 */
	public double getAfter9hCloudCover() {
		return after9hCloudCover;
	}

	/**
	 * Sets the after9h cloud cover.
	 *
	 * @param after9hCloudCover the new after9h cloud cover
	 */
	public void setAfter9hCloudCover(double after9hCloudCover) {
		this.after9hCloudCover = after9hCloudCover;
	}

	/**
	 * Gets the after9h wind speed.
	 *
	 * @return the after9h wind speed
	 */
	public double getAfter9hWindSpeed() {
		return after9hWindSpeed;
	}

	/**
	 * Sets the after9h wind speed.
	 *
	 * @param after9hWindSpeed the new after9h wind speed
	 */
	public void setAfter9hWindSpeed(double after9hWindSpeed) {
		this.after9hWindSpeed = after9hWindSpeed;
	}

	/**
	 * Gets the after9h precip intensity.
	 *
	 * @return the after9h precip intensity
	 */
	public double getAfter9hPrecipIntensity() {
		return after9hPrecipIntensity;
	}

	/**
	 * Sets the after9h precip intensity.
	 *
	 * @param after9hPrecipIntensity the new after9h precip intensity
	 */
	public void setAfter9hPrecipIntensity(double after9hPrecipIntensity) {
		this.after9hPrecipIntensity = after9hPrecipIntensity;
	}

	/**
	 * Gets the after9h precip probability.
	 *
	 * @return the after9h precip probability
	 */
	public double getAfter9hPrecipProbability() {
		return after9hPrecipProbability;
	}

	/**
	 * Sets the after9h precip probability.
	 *
	 * @param after9hPrecipProbability the new after9h precip probability
	 */
	public void setAfter9hPrecipProbability(double after9hPrecipProbability) {
		this.after9hPrecipProbability = after9hPrecipProbability;
	}

	/**
	 * Gets the after10h time.
	 *
	 * @return the after10h time
	 */
	public long getAfter10hTime() {
		return after10hTime;
	}

	/**
	 * Sets the after10h time.
	 *
	 * @param after10hTime the new after10h time
	 */
	public void setAfter10hTime(long after10hTime) {
		this.after10hTime = after10hTime;
	}

	/**
	 * Gets the after10h temperature.
	 *
	 * @return the after10h temperature
	 */
	public double getAfter10hTemperature() {
		return after10hTemperature;
	}

	/**
	 * Sets the after10h temperature.
	 *
	 * @param after10hTemperature the new after10h temperature
	 */
	public void setAfter10hTemperature(double after10hTemperature) {
		this.after10hTemperature = after10hTemperature;
	}

	/**
	 * Gets the after10h cloud cover.
	 *
	 * @return the after10h cloud cover
	 */
	public double getAfter10hCloudCover() {
		return after10hCloudCover;
	}

	/**
	 * Sets the after10h cloud cover.
	 *
	 * @param after10hCloudCover the new after10h cloud cover
	 */
	public void setAfter10hCloudCover(double after10hCloudCover) {
		this.after10hCloudCover = after10hCloudCover;
	}

	/**
	 * Gets the after10h wind speed.
	 *
	 * @return the after10h wind speed
	 */
	public double getAfter10hWindSpeed() {
		return after10hWindSpeed;
	}

	/**
	 * Sets the after10h wind speed.
	 *
	 * @param after10hWindSpeed the new after10h wind speed
	 */
	public void setAfter10hWindSpeed(double after10hWindSpeed) {
		this.after10hWindSpeed = after10hWindSpeed;
	}

	/**
	 * Gets the after10h precip intensity.
	 *
	 * @return the after10h precip intensity
	 */
	public double getAfter10hPrecipIntensity() {
		return after10hPrecipIntensity;
	}

	/**
	 * Sets the after10h precip intensity.
	 *
	 * @param after10hPrecipIntensity the new after10h precip intensity
	 */
	public void setAfter10hPrecipIntensity(double after10hPrecipIntensity) {
		this.after10hPrecipIntensity = after10hPrecipIntensity;
	}

	/**
	 * Gets the after10h precip probability.
	 *
	 * @return the after10h precip probability
	 */
	public double getAfter10hPrecipProbability() {
		return after10hPrecipProbability;
	}

	/**
	 * Sets the after10h precip probability.
	 *
	 * @param after10hPrecipProbability the new after10h precip probability
	 */
	public void setAfter10hPrecipProbability(double after10hPrecipProbability) {
		this.after10hPrecipProbability = after10hPrecipProbability;
	}

	/**
	 * Gets the after11h time.
	 *
	 * @return the after11h time
	 */
	public long getAfter11hTime() {
		return after11hTime;
	}

	/**
	 * Sets the after11h time.
	 *
	 * @param after11hTime the new after11h time
	 */
	public void setAfter11hTime(long after11hTime) {
		this.after11hTime = after11hTime;
	}

	/**
	 * Gets the after11h temperature.
	 *
	 * @return the after11h temperature
	 */
	public double getAfter11hTemperature() {
		return after11hTemperature;
	}

	/**
	 * Sets the after11h temperature.
	 *
	 * @param after11hTemperature the new after11h temperature
	 */
	public void setAfter11hTemperature(double after11hTemperature) {
		this.after11hTemperature = after11hTemperature;
	}

	/**
	 * Gets the after11h cloud cover.
	 *
	 * @return the after11h cloud cover
	 */
	public double getAfter11hCloudCover() {
		return after11hCloudCover;
	}

	/**
	 * Sets the after11h cloud cover.
	 *
	 * @param after11hCloudCover the new after11h cloud cover
	 */
	public void setAfter11hCloudCover(double after11hCloudCover) {
		this.after11hCloudCover = after11hCloudCover;
	}

	/**
	 * Gets the after11h wind speed.
	 *
	 * @return the after11h wind speed
	 */
	public double getAfter11hWindSpeed() {
		return after11hWindSpeed;
	}

	/**
	 * Sets the after11h wind speed.
	 *
	 * @param after11hWindSpeed the new after11h wind speed
	 */
	public void setAfter11hWindSpeed(double after11hWindSpeed) {
		this.after11hWindSpeed = after11hWindSpeed;
	}

	/**
	 * Gets the after11h precip intensity.
	 *
	 * @return the after11h precip intensity
	 */
	public double getAfter11hPrecipIntensity() {
		return after11hPrecipIntensity;
	}

	/**
	 * Sets the after11h precip intensity.
	 *
	 * @param after11hPrecipIntensity the new after11h precip intensity
	 */
	public void setAfter11hPrecipIntensity(double after11hPrecipIntensity) {
		this.after11hPrecipIntensity = after11hPrecipIntensity;
	}

	/**
	 * Gets the after11h precip probability.
	 *
	 * @return the after11h precip probability
	 */
	public double getAfter11hPrecipProbability() {
		return after11hPrecipProbability;
	}

	/**
	 * Sets the after11h precip probability.
	 *
	 * @param after11hPrecipProbability the new after11h precip probability
	 */
	public void setAfter11hPrecipProbability(double after11hPrecipProbability) {
		this.after11hPrecipProbability = after11hPrecipProbability;
	}

	/**
	 * Gets the after12h time.
	 *
	 * @return the after12h time
	 */
	public long getAfter12hTime() {
		return after12hTime;
	}

	/**
	 * Sets the after12h time.
	 *
	 * @param after12hTime the new after12h time
	 */
	public void setAfter12hTime(long after12hTime) {
		this.after12hTime = after12hTime;
	}

	/**
	 * Gets the after12h temperature.
	 *
	 * @return the after12h temperature
	 */
	public double getAfter12hTemperature() {
		return after12hTemperature;
	}

	/**
	 * Sets the after12h temperature.
	 *
	 * @param after12hTemperature the new after12h temperature
	 */
	public void setAfter12hTemperature(double after12hTemperature) {
		this.after12hTemperature = after12hTemperature;
	}

	/**
	 * Gets the after12h cloud cover.
	 *
	 * @return the after12h cloud cover
	 */
	public double getAfter12hCloudCover() {
		return after12hCloudCover;
	}

	/**
	 * Sets the after12h cloud cover.
	 *
	 * @param after12hCloudCover the new after12h cloud cover
	 */
	public void setAfter12hCloudCover(double after12hCloudCover) {
		this.after12hCloudCover = after12hCloudCover;
	}

	/**
	 * Gets the after12h wind speed.
	 *
	 * @return the after12h wind speed
	 */
	public double getAfter12hWindSpeed() {
		return after12hWindSpeed;
	}

	/**
	 * Sets the after12h wind speed.
	 *
	 * @param after12hWindSpeed the new after12h wind speed
	 */
	public void setAfter12hWindSpeed(double after12hWindSpeed) {
		this.after12hWindSpeed = after12hWindSpeed;
	}

	/**
	 * Gets the after12h precip intensity.
	 *
	 * @return the after12h precip intensity
	 */
	public double getAfter12hPrecipIntensity() {
		return after12hPrecipIntensity;
	}

	/**
	 * Sets the after12h precip intensity.
	 *
	 * @param after12hPrecipIntensity the new after12h precip intensity
	 */
	public void setAfter12hPrecipIntensity(double after12hPrecipIntensity) {
		this.after12hPrecipIntensity = after12hPrecipIntensity;
	}

	/**
	 * Gets the after12h precip probability.
	 *
	 * @return the after12h precip probability
	 */
	public double getAfter12hPrecipProbability() {
		return after12hPrecipProbability;
	}

	/**
	 * Sets the after12h precip probability.
	 *
	 * @param after12hPrecipProbability the new after12h precip probability
	 */
	public void setAfter12hPrecipProbability(double after12hPrecipProbability) {
		this.after12hPrecipProbability = after12hPrecipProbability;
	}

	/**
	 * Gets the after13h time.
	 *
	 * @return the after13h time
	 */
	public long getAfter13hTime() {
		return after13hTime;
	}

	/**
	 * Sets the after13h time.
	 *
	 * @param after13hTime the new after13h time
	 */
	public void setAfter13hTime(long after13hTime) {
		this.after13hTime = after13hTime;
	}

	/**
	 * Gets the after13h temperature.
	 *
	 * @return the after13h temperature
	 */
	public double getAfter13hTemperature() {
		return after13hTemperature;
	}

	/**
	 * Sets the after13h temperature.
	 *
	 * @param after13hTemperature the new after13h temperature
	 */
	public void setAfter13hTemperature(double after13hTemperature) {
		this.after13hTemperature = after13hTemperature;
	}

	/**
	 * Gets the after13h cloud cover.
	 *
	 * @return the after13h cloud cover
	 */
	public double getAfter13hCloudCover() {
		return after13hCloudCover;
	}

	/**
	 * Sets the after13h cloud cover.
	 *
	 * @param after13hCloudCover the new after13h cloud cover
	 */
	public void setAfter13hCloudCover(double after13hCloudCover) {
		this.after13hCloudCover = after13hCloudCover;
	}

	/**
	 * Gets the after13h wind speed.
	 *
	 * @return the after13h wind speed
	 */
	public double getAfter13hWindSpeed() {
		return after13hWindSpeed;
	}

	/**
	 * Sets the after13h wind speed.
	 *
	 * @param after13hWindSpeed the new after13h wind speed
	 */
	public void setAfter13hWindSpeed(double after13hWindSpeed) {
		this.after13hWindSpeed = after13hWindSpeed;
	}

	/**
	 * Gets the after13h precip intensity.
	 *
	 * @return the after13h precip intensity
	 */
	public double getAfter13hPrecipIntensity() {
		return after13hPrecipIntensity;
	}

	/**
	 * Sets the after13h precip intensity.
	 *
	 * @param after13hPrecipIntensity the new after13h precip intensity
	 */
	public void setAfter13hPrecipIntensity(double after13hPrecipIntensity) {
		this.after13hPrecipIntensity = after13hPrecipIntensity;
	}

	/**
	 * Gets the after13h precip probability.
	 *
	 * @return the after13h precip probability
	 */
	public double getAfter13hPrecipProbability() {
		return after13hPrecipProbability;
	}

	/**
	 * Sets the after13h precip probability.
	 *
	 * @param after13hPrecipProbability the new after13h precip probability
	 */
	public void setAfter13hPrecipProbability(double after13hPrecipProbability) {
		this.after13hPrecipProbability = after13hPrecipProbability;
	}

	/**
	 * Gets the after14h time.
	 *
	 * @return the after14h time
	 */
	public long getAfter14hTime() {
		return after14hTime;
	}

	/**
	 * Sets the after14h time.
	 *
	 * @param after14hTime the new after14h time
	 */
	public void setAfter14hTime(long after14hTime) {
		this.after14hTime = after14hTime;
	}

	/**
	 * Gets the after14h temperature.
	 *
	 * @return the after14h temperature
	 */
	public double getAfter14hTemperature() {
		return after14hTemperature;
	}

	/**
	 * Sets the after14h temperature.
	 *
	 * @param after14hTemperature the new after14h temperature
	 */
	public void setAfter14hTemperature(double after14hTemperature) {
		this.after14hTemperature = after14hTemperature;
	}

	/**
	 * Gets the after14h cloud cover.
	 *
	 * @return the after14h cloud cover
	 */
	public double getAfter14hCloudCover() {
		return after14hCloudCover;
	}

	/**
	 * Sets the after14h cloud cover.
	 *
	 * @param after14hCloudCover the new after14h cloud cover
	 */
	public void setAfter14hCloudCover(double after14hCloudCover) {
		this.after14hCloudCover = after14hCloudCover;
	}

	/**
	 * Gets the after14h wind speed.
	 *
	 * @return the after14h wind speed
	 */
	public double getAfter14hWindSpeed() {
		return after14hWindSpeed;
	}

	/**
	 * Sets the after14h wind speed.
	 *
	 * @param after14hWindSpeed the new after14h wind speed
	 */
	public void setAfter14hWindSpeed(double after14hWindSpeed) {
		this.after14hWindSpeed = after14hWindSpeed;
	}

	/**
	 * Gets the after14h precip intensity.
	 *
	 * @return the after14h precip intensity
	 */
	public double getAfter14hPrecipIntensity() {
		return after14hPrecipIntensity;
	}

	/**
	 * Sets the after14h precip intensity.
	 *
	 * @param after14hPrecipIntensity the new after14h precip intensity
	 */
	public void setAfter14hPrecipIntensity(double after14hPrecipIntensity) {
		this.after14hPrecipIntensity = after14hPrecipIntensity;
	}

	/**
	 * Gets the after14h precip probability.
	 *
	 * @return the after14h precip probability
	 */
	public double getAfter14hPrecipProbability() {
		return after14hPrecipProbability;
	}

	/**
	 * Sets the after14h precip probability.
	 *
	 * @param after14hPrecipProbability the new after14h precip probability
	 */
	public void setAfter14hPrecipProbability(double after14hPrecipProbability) {
		this.after14hPrecipProbability = after14hPrecipProbability;
	}

	/**
	 * Gets the after15h time.
	 *
	 * @return the after15h time
	 */
	public long getAfter15hTime() {
		return after15hTime;
	}

	/**
	 * Sets the after15h time.
	 *
	 * @param after15hTime the new after15h time
	 */
	public void setAfter15hTime(long after15hTime) {
		this.after15hTime = after15hTime;
	}

	/**
	 * Gets the after15h temperature.
	 *
	 * @return the after15h temperature
	 */
	public double getAfter15hTemperature() {
		return after15hTemperature;
	}

	/**
	 * Sets the after15h temperature.
	 *
	 * @param after15hTemperature the new after15h temperature
	 */
	public void setAfter15hTemperature(double after15hTemperature) {
		this.after15hTemperature = after15hTemperature;
	}

	/**
	 * Gets the after15h cloud cover.
	 *
	 * @return the after15h cloud cover
	 */
	public double getAfter15hCloudCover() {
		return after15hCloudCover;
	}

	/**
	 * Sets the after15h cloud cover.
	 *
	 * @param after15hCloudCover the new after15h cloud cover
	 */
	public void setAfter15hCloudCover(double after15hCloudCover) {
		this.after15hCloudCover = after15hCloudCover;
	}

	/**
	 * Gets the after15h wind speed.
	 *
	 * @return the after15h wind speed
	 */
	public double getAfter15hWindSpeed() {
		return after15hWindSpeed;
	}

	/**
	 * Sets the after15h wind speed.
	 *
	 * @param after15hWindSpeed the new after15h wind speed
	 */
	public void setAfter15hWindSpeed(double after15hWindSpeed) {
		this.after15hWindSpeed = after15hWindSpeed;
	}

	/**
	 * Gets the after15h precip intensity.
	 *
	 * @return the after15h precip intensity
	 */
	public double getAfter15hPrecipIntensity() {
		return after15hPrecipIntensity;
	}

	/**
	 * Sets the after15h precip intensity.
	 *
	 * @param after15hPrecipIntensity the new after15h precip intensity
	 */
	public void setAfter15hPrecipIntensity(double after15hPrecipIntensity) {
		this.after15hPrecipIntensity = after15hPrecipIntensity;
	}

	/**
	 * Gets the after15h precip probability.
	 *
	 * @return the after15h precip probability
	 */
	public double getAfter15hPrecipProbability() {
		return after15hPrecipProbability;
	}

	/**
	 * Sets the after15h precip probability.
	 *
	 * @param after15hPrecipProbability the new after15h precip probability
	 */
	public void setAfter15hPrecipProbability(double after15hPrecipProbability) {
		this.after15hPrecipProbability = after15hPrecipProbability;
	}

	/**
	 * Gets the after16h time.
	 *
	 * @return the after16h time
	 */
	public long getAfter16hTime() {
		return after16hTime;
	}

	/**
	 * Sets the after16h time.
	 *
	 * @param after16hTime the new after16h time
	 */
	public void setAfter16hTime(long after16hTime) {
		this.after16hTime = after16hTime;
	}

	/**
	 * Gets the after16h temperature.
	 *
	 * @return the after16h temperature
	 */
	public double getAfter16hTemperature() {
		return after16hTemperature;
	}

	/**
	 * Sets the after16h temperature.
	 *
	 * @param after16hTemperature the new after16h temperature
	 */
	public void setAfter16hTemperature(double after16hTemperature) {
		this.after16hTemperature = after16hTemperature;
	}

	/**
	 * Gets the after16h cloud cover.
	 *
	 * @return the after16h cloud cover
	 */
	public double getAfter16hCloudCover() {
		return after16hCloudCover;
	}

	/**
	 * Sets the after16h cloud cover.
	 *
	 * @param after16hCloudCover the new after16h cloud cover
	 */
	public void setAfter16hCloudCover(double after16hCloudCover) {
		this.after16hCloudCover = after16hCloudCover;
	}

	/**
	 * Gets the after16h wind speed.
	 *
	 * @return the after16h wind speed
	 */
	public double getAfter16hWindSpeed() {
		return after16hWindSpeed;
	}

	/**
	 * Sets the after16h wind speed.
	 *
	 * @param after16hWindSpeed the new after16h wind speed
	 */
	public void setAfter16hWindSpeed(double after16hWindSpeed) {
		this.after16hWindSpeed = after16hWindSpeed;
	}

	/**
	 * Gets the after16h precip intensity.
	 *
	 * @return the after16h precip intensity
	 */
	public double getAfter16hPrecipIntensity() {
		return after16hPrecipIntensity;
	}

	/**
	 * Sets the after16h precip intensity.
	 *
	 * @param after16hPrecipIntensity the new after16h precip intensity
	 */
	public void setAfter16hPrecipIntensity(double after16hPrecipIntensity) {
		this.after16hPrecipIntensity = after16hPrecipIntensity;
	}

	/**
	 * Gets the after16h precip probability.
	 *
	 * @return the after16h precip probability
	 */
	public double getAfter16hPrecipProbability() {
		return after16hPrecipProbability;
	}

	/**
	 * Sets the after16h precip probability.
	 *
	 * @param after16hPrecipProbability the new after16h precip probability
	 */
	public void setAfter16hPrecipProbability(double after16hPrecipProbability) {
		this.after16hPrecipProbability = after16hPrecipProbability;
	}

	/**
	 * Gets the after17h time.
	 *
	 * @return the after17h time
	 */
	public long getAfter17hTime() {
		return after17hTime;
	}

	/**
	 * Sets the after17h time.
	 *
	 * @param after17hTime the new after17h time
	 */
	public void setAfter17hTime(long after17hTime) {
		this.after17hTime = after17hTime;
	}

	/**
	 * Gets the after17h temperature.
	 *
	 * @return the after17h temperature
	 */
	public double getAfter17hTemperature() {
		return after17hTemperature;
	}

	/**
	 * Sets the after17h temperature.
	 *
	 * @param after17hTemperature the new after17h temperature
	 */
	public void setAfter17hTemperature(double after17hTemperature) {
		this.after17hTemperature = after17hTemperature;
	}

	/**
	 * Gets the after17h cloud cover.
	 *
	 * @return the after17h cloud cover
	 */
	public double getAfter17hCloudCover() {
		return after17hCloudCover;
	}

	/**
	 * Sets the after17h cloud cover.
	 *
	 * @param after17hCloudCover the new after17h cloud cover
	 */
	public void setAfter17hCloudCover(double after17hCloudCover) {
		this.after17hCloudCover = after17hCloudCover;
	}

	/**
	 * Gets the after17h wind speed.
	 *
	 * @return the after17h wind speed
	 */
	public double getAfter17hWindSpeed() {
		return after17hWindSpeed;
	}

	/**
	 * Sets the after17h wind speed.
	 *
	 * @param after17hWindSpeed the new after17h wind speed
	 */
	public void setAfter17hWindSpeed(double after17hWindSpeed) {
		this.after17hWindSpeed = after17hWindSpeed;
	}

	/**
	 * Gets the after17h precip intensity.
	 *
	 * @return the after17h precip intensity
	 */
	public double getAfter17hPrecipIntensity() {
		return after17hPrecipIntensity;
	}

	/**
	 * Sets the after17h precip intensity.
	 *
	 * @param after17hPrecipIntensity the new after17h precip intensity
	 */
	public void setAfter17hPrecipIntensity(double after17hPrecipIntensity) {
		this.after17hPrecipIntensity = after17hPrecipIntensity;
	}

	/**
	 * Gets the after17h precip probability.
	 *
	 * @return the after17h precip probability
	 */
	public double getAfter17hPrecipProbability() {
		return after17hPrecipProbability;
	}

	/**
	 * Sets the after17h precip probability.
	 *
	 * @param after17hPrecipProbability the new after17h precip probability
	 */
	public void setAfter17hPrecipProbability(double after17hPrecipProbability) {
		this.after17hPrecipProbability = after17hPrecipProbability;
	}

	/**
	 * Gets the after18h time.
	 *
	 * @return the after18h time
	 */
	public long getAfter18hTime() {
		return after18hTime;
	}

	/**
	 * Sets the after18h time.
	 *
	 * @param after18hTime the new after18h time
	 */
	public void setAfter18hTime(long after18hTime) {
		this.after18hTime = after18hTime;
	}

	/**
	 * Gets the after18h temperature.
	 *
	 * @return the after18h temperature
	 */
	public double getAfter18hTemperature() {
		return after18hTemperature;
	}

	/**
	 * Sets the after18h temperature.
	 *
	 * @param after18hTemperature the new after18h temperature
	 */
	public void setAfter18hTemperature(double after18hTemperature) {
		this.after18hTemperature = after18hTemperature;
	}

	/**
	 * Gets the after18h cloud cover.
	 *
	 * @return the after18h cloud cover
	 */
	public double getAfter18hCloudCover() {
		return after18hCloudCover;
	}

	/**
	 * Sets the after18h cloud cover.
	 *
	 * @param after18hCloudCover the new after18h cloud cover
	 */
	public void setAfter18hCloudCover(double after18hCloudCover) {
		this.after18hCloudCover = after18hCloudCover;
	}

	/**
	 * Gets the after18h wind speed.
	 *
	 * @return the after18h wind speed
	 */
	public double getAfter18hWindSpeed() {
		return after18hWindSpeed;
	}

	/**
	 * Sets the after18h wind speed.
	 *
	 * @param after18hWindSpeed the new after18h wind speed
	 */
	public void setAfter18hWindSpeed(double after18hWindSpeed) {
		this.after18hWindSpeed = after18hWindSpeed;
	}

	/**
	 * Gets the after18h precip intensity.
	 *
	 * @return the after18h precip intensity
	 */
	public double getAfter18hPrecipIntensity() {
		return after18hPrecipIntensity;
	}

	/**
	 * Sets the after18h precip intensity.
	 *
	 * @param after18hPrecipIntensity the new after18h precip intensity
	 */
	public void setAfter18hPrecipIntensity(double after18hPrecipIntensity) {
		this.after18hPrecipIntensity = after18hPrecipIntensity;
	}

	/**
	 * Gets the after18h precip probability.
	 *
	 * @return the after18h precip probability
	 */
	public double getAfter18hPrecipProbability() {
		return after18hPrecipProbability;
	}

	/**
	 * Sets the after18h precip probability.
	 *
	 * @param after18hPrecipProbability the new after18h precip probability
	 */
	public void setAfter18hPrecipProbability(double after18hPrecipProbability) {
		this.after18hPrecipProbability = after18hPrecipProbability;
	}

	/**
	 * Gets the after19h time.
	 *
	 * @return the after19h time
	 */
	public long getAfter19hTime() {
		return after19hTime;
	}

	/**
	 * Sets the after19h time.
	 *
	 * @param after19hTime the new after19h time
	 */
	public void setAfter19hTime(long after19hTime) {
		this.after19hTime = after19hTime;
	}

	/**
	 * Gets the after19h temperature.
	 *
	 * @return the after19h temperature
	 */
	public double getAfter19hTemperature() {
		return after19hTemperature;
	}

	/**
	 * Sets the after19h temperature.
	 *
	 * @param after19hTemperature the new after19h temperature
	 */
	public void setAfter19hTemperature(double after19hTemperature) {
		this.after19hTemperature = after19hTemperature;
	}

	/**
	 * Gets the after19h cloud cover.
	 *
	 * @return the after19h cloud cover
	 */
	public double getAfter19hCloudCover() {
		return after19hCloudCover;
	}

	/**
	 * Sets the after19h cloud cover.
	 *
	 * @param after19hCloudCover the new after19h cloud cover
	 */
	public void setAfter19hCloudCover(double after19hCloudCover) {
		this.after19hCloudCover = after19hCloudCover;
	}

	/**
	 * Gets the after19h wind speed.
	 *
	 * @return the after19h wind speed
	 */
	public double getAfter19hWindSpeed() {
		return after19hWindSpeed;
	}

	/**
	 * Sets the after19h wind speed.
	 *
	 * @param after19hWindSpeed the new after19h wind speed
	 */
	public void setAfter19hWindSpeed(double after19hWindSpeed) {
		this.after19hWindSpeed = after19hWindSpeed;
	}

	/**
	 * Gets the after19h precip intensity.
	 *
	 * @return the after19h precip intensity
	 */
	public double getAfter19hPrecipIntensity() {
		return after19hPrecipIntensity;
	}

	/**
	 * Sets the after19h precip intensity.
	 *
	 * @param after19hPrecipIntensity the new after19h precip intensity
	 */
	public void setAfter19hPrecipIntensity(double after19hPrecipIntensity) {
		this.after19hPrecipIntensity = after19hPrecipIntensity;
	}

	/**
	 * Gets the after19h precip probability.
	 *
	 * @return the after19h precip probability
	 */
	public double getAfter19hPrecipProbability() {
		return after19hPrecipProbability;
	}

	/**
	 * Sets the after19h precip probability.
	 *
	 * @param after19hPrecipProbability the new after19h precip probability
	 */
	public void setAfter19hPrecipProbability(double after19hPrecipProbability) {
		this.after19hPrecipProbability = after19hPrecipProbability;
	}

	/**
	 * Gets the after20h time.
	 *
	 * @return the after20h time
	 */
	public long getAfter20hTime() {
		return after20hTime;
	}

	/**
	 * Sets the after20h time.
	 *
	 * @param after20hTime the new after20h time
	 */
	public void setAfter20hTime(long after20hTime) {
		this.after20hTime = after20hTime;
	}

	/**
	 * Gets the after20h temperature.
	 *
	 * @return the after20h temperature
	 */
	public double getAfter20hTemperature() {
		return after20hTemperature;
	}

	/**
	 * Sets the after20h temperature.
	 *
	 * @param after20hTemperature the new after20h temperature
	 */
	public void setAfter20hTemperature(double after20hTemperature) {
		this.after20hTemperature = after20hTemperature;
	}

	/**
	 * Gets the after20h cloud cover.
	 *
	 * @return the after20h cloud cover
	 */
	public double getAfter20hCloudCover() {
		return after20hCloudCover;
	}

	/**
	 * Sets the after20h cloud cover.
	 *
	 * @param after20hCloudCover the new after20h cloud cover
	 */
	public void setAfter20hCloudCover(double after20hCloudCover) {
		this.after20hCloudCover = after20hCloudCover;
	}

	/**
	 * Gets the after20h wind speed.
	 *
	 * @return the after20h wind speed
	 */
	public double getAfter20hWindSpeed() {
		return after20hWindSpeed;
	}

	/**
	 * Sets the after20h wind speed.
	 *
	 * @param after20hWindSpeed the new after20h wind speed
	 */
	public void setAfter20hWindSpeed(double after20hWindSpeed) {
		this.after20hWindSpeed = after20hWindSpeed;
	}

	/**
	 * Gets the after20h precip intensity.
	 *
	 * @return the after20h precip intensity
	 */
	public double getAfter20hPrecipIntensity() {
		return after20hPrecipIntensity;
	}

	/**
	 * Sets the after20h precip intensity.
	 *
	 * @param after20hPrecipIntensity the new after20h precip intensity
	 */
	public void setAfter20hPrecipIntensity(double after20hPrecipIntensity) {
		this.after20hPrecipIntensity = after20hPrecipIntensity;
	}

	/**
	 * Gets the after20h precip probability.
	 *
	 * @return the after20h precip probability
	 */
	public double getAfter20hPrecipProbability() {
		return after20hPrecipProbability;
	}

	/**
	 * Sets the after20h precip probability.
	 *
	 * @param after20hPrecipProbability the new after20h precip probability
	 */
	public void setAfter20hPrecipProbability(double after20hPrecipProbability) {
		this.after20hPrecipProbability = after20hPrecipProbability;
	}

	/**
	 * Gets the after21h time.
	 *
	 * @return the after21h time
	 */
	public long getAfter21hTime() {
		return after21hTime;
	}

	/**
	 * Sets the after21h time.
	 *
	 * @param after21hTime the new after21h time
	 */
	public void setAfter21hTime(long after21hTime) {
		this.after21hTime = after21hTime;
	}

	/**
	 * Gets the after21h temperature.
	 *
	 * @return the after21h temperature
	 */
	public double getAfter21hTemperature() {
		return after21hTemperature;
	}

	/**
	 * Sets the after21h temperature.
	 *
	 * @param after21hTemperature the new after21h temperature
	 */
	public void setAfter21hTemperature(double after21hTemperature) {
		this.after21hTemperature = after21hTemperature;
	}

	/**
	 * Gets the after21h cloud cover.
	 *
	 * @return the after21h cloud cover
	 */
	public double getAfter21hCloudCover() {
		return after21hCloudCover;
	}

	/**
	 * Sets the after21h cloud cover.
	 *
	 * @param after21hCloudCover the new after21h cloud cover
	 */
	public void setAfter21hCloudCover(double after21hCloudCover) {
		this.after21hCloudCover = after21hCloudCover;
	}

	/**
	 * Gets the after21h wind speed.
	 *
	 * @return the after21h wind speed
	 */
	public double getAfter21hWindSpeed() {
		return after21hWindSpeed;
	}

	/**
	 * Sets the after21h wind speed.
	 *
	 * @param after21hWindSpeed the new after21h wind speed
	 */
	public void setAfter21hWindSpeed(double after21hWindSpeed) {
		this.after21hWindSpeed = after21hWindSpeed;
	}

	/**
	 * Gets the after21h precip intensity.
	 *
	 * @return the after21h precip intensity
	 */
	public double getAfter21hPrecipIntensity() {
		return after21hPrecipIntensity;
	}

	/**
	 * Sets the after21h precip intensity.
	 *
	 * @param after21hPrecipIntensity the new after21h precip intensity
	 */
	public void setAfter21hPrecipIntensity(double after21hPrecipIntensity) {
		this.after21hPrecipIntensity = after21hPrecipIntensity;
	}

	/**
	 * Gets the after21h precip probability.
	 *
	 * @return the after21h precip probability
	 */
	public double getAfter21hPrecipProbability() {
		return after21hPrecipProbability;
	}

	/**
	 * Sets the after21h precip probability.
	 *
	 * @param after21hPrecipProbability the new after21h precip probability
	 */
	public void setAfter21hPrecipProbability(double after21hPrecipProbability) {
		this.after21hPrecipProbability = after21hPrecipProbability;
	}

	/**
	 * Gets the after22h time.
	 *
	 * @return the after22h time
	 */
	public long getAfter22hTime() {
		return after22hTime;
	}

	/**
	 * Sets the after22h time.
	 *
	 * @param after22hTime the new after22h time
	 */
	public void setAfter22hTime(long after22hTime) {
		this.after22hTime = after22hTime;
	}

	/**
	 * Gets the after22h temperature.
	 *
	 * @return the after22h temperature
	 */
	public double getAfter22hTemperature() {
		return after22hTemperature;
	}

	/**
	 * Sets the after22h temperature.
	 *
	 * @param after22hTemperature the new after22h temperature
	 */
	public void setAfter22hTemperature(double after22hTemperature) {
		this.after22hTemperature = after22hTemperature;
	}

	/**
	 * Gets the after22h cloud cover.
	 *
	 * @return the after22h cloud cover
	 */
	public double getAfter22hCloudCover() {
		return after22hCloudCover;
	}

	/**
	 * Sets the after22h cloud cover.
	 *
	 * @param after22hCloudCover the new after22h cloud cover
	 */
	public void setAfter22hCloudCover(double after22hCloudCover) {
		this.after22hCloudCover = after22hCloudCover;
	}

	/**
	 * Gets the after22h wind speed.
	 *
	 * @return the after22h wind speed
	 */
	public double getAfter22hWindSpeed() {
		return after22hWindSpeed;
	}

	/**
	 * Sets the after22h wind speed.
	 *
	 * @param after22hWindSpeed the new after22h wind speed
	 */
	public void setAfter22hWindSpeed(double after22hWindSpeed) {
		this.after22hWindSpeed = after22hWindSpeed;
	}

	/**
	 * Gets the after22h precip intensity.
	 *
	 * @return the after22h precip intensity
	 */
	public double getAfter22hPrecipIntensity() {
		return after22hPrecipIntensity;
	}

	/**
	 * Sets the after22h precip intensity.
	 *
	 * @param after22hPrecipIntensity the new after22h precip intensity
	 */
	public void setAfter22hPrecipIntensity(double after22hPrecipIntensity) {
		this.after22hPrecipIntensity = after22hPrecipIntensity;
	}

	/**
	 * Gets the after22h precip probability.
	 *
	 * @return the after22h precip probability
	 */
	public double getAfter22hPrecipProbability() {
		return after22hPrecipProbability;
	}

	/**
	 * Sets the after22h precip probability.
	 *
	 * @param after22hPrecipProbability the new after22h precip probability
	 */
	public void setAfter22hPrecipProbability(double after22hPrecipProbability) {
		this.after22hPrecipProbability = after22hPrecipProbability;
	}

	/**
	 * Gets the after23h time.
	 *
	 * @return the after23h time
	 */
	public long getAfter23hTime() {
		return after23hTime;
	}

	/**
	 * Sets the after23h time.
	 *
	 * @param after23hTime the new after23h time
	 */
	public void setAfter23hTime(long after23hTime) {
		this.after23hTime = after23hTime;
	}

	/**
	 * Gets the after23h temperature.
	 *
	 * @return the after23h temperature
	 */
	public double getAfter23hTemperature() {
		return after23hTemperature;
	}

	/**
	 * Sets the after23h temperature.
	 *
	 * @param after23hTemperature the new after23h temperature
	 */
	public void setAfter23hTemperature(double after23hTemperature) {
		this.after23hTemperature = after23hTemperature;
	}

	/**
	 * Gets the after23h cloud cover.
	 *
	 * @return the after23h cloud cover
	 */
	public double getAfter23hCloudCover() {
		return after23hCloudCover;
	}

	/**
	 * Sets the after23h cloud cover.
	 *
	 * @param after23hCloudCover the new after23h cloud cover
	 */
	public void setAfter23hCloudCover(double after23hCloudCover) {
		this.after23hCloudCover = after23hCloudCover;
	}

	/**
	 * Gets the after23h wind speed.
	 *
	 * @return the after23h wind speed
	 */
	public double getAfter23hWindSpeed() {
		return after23hWindSpeed;
	}

	/**
	 * Sets the after23h wind speed.
	 *
	 * @param after23hWindSpeed the new after23h wind speed
	 */
	public void setAfter23hWindSpeed(double after23hWindSpeed) {
		this.after23hWindSpeed = after23hWindSpeed;
	}

	/**
	 * Gets the after23h precip intensity.
	 *
	 * @return the after23h precip intensity
	 */
	public double getAfter23hPrecipIntensity() {
		return after23hPrecipIntensity;
	}

	/**
	 * Sets the after23h precip intensity.
	 *
	 * @param after23hPrecipIntensity the new after23h precip intensity
	 */
	public void setAfter23hPrecipIntensity(double after23hPrecipIntensity) {
		this.after23hPrecipIntensity = after23hPrecipIntensity;
	}

	/**
	 * Gets the after23h precip probability.
	 *
	 * @return the after23h precip probability
	 */
	public double getAfter23hPrecipProbability() {
		return after23hPrecipProbability;
	}

	/**
	 * Sets the after23h precip probability.
	 *
	 * @param after23hPrecipProbability the new after23h precip probability
	 */
	public void setAfter23hPrecipProbability(double after23hPrecipProbability) {
		this.after23hPrecipProbability = after23hPrecipProbability;
	}

	/**
	 * Gets the after24h time.
	 *
	 * @return the after24h time
	 */
	public long getAfter24hTime() {
		return after24hTime;
	}

	/**
	 * Sets the after24h time.
	 *
	 * @param after24hTime the new after24h time
	 */
	public void setAfter24hTime(long after24hTime) {
		this.after24hTime = after24hTime;
	}

	/**
	 * Gets the after24h temperature.
	 *
	 * @return the after24h temperature
	 */
	public double getAfter24hTemperature() {
		return after24hTemperature;
	}

	/**
	 * Sets the after24h temperature.
	 *
	 * @param after24hTemperature the new after24h temperature
	 */
	public void setAfter24hTemperature(double after24hTemperature) {
		this.after24hTemperature = after24hTemperature;
	}

	/**
	 * Gets the after24h cloud cover.
	 *
	 * @return the after24h cloud cover
	 */
	public double getAfter24hCloudCover() {
		return after24hCloudCover;
	}

	/**
	 * Sets the after24h cloud cover.
	 *
	 * @param after24hCloudCover the new after24h cloud cover
	 */
	public void setAfter24hCloudCover(double after24hCloudCover) {
		this.after24hCloudCover = after24hCloudCover;
	}

	/**
	 * Gets the after24h wind speed.
	 *
	 * @return the after24h wind speed
	 */
	public double getAfter24hWindSpeed() {
		return after24hWindSpeed;
	}

	/**
	 * Sets the after24h wind speed.
	 *
	 * @param after24hWindSpeed the new after24h wind speed
	 */
	public void setAfter24hWindSpeed(double after24hWindSpeed) {
		this.after24hWindSpeed = after24hWindSpeed;
	}

	/**
	 * Gets the after24h precip intensity.
	 *
	 * @return the after24h precip intensity
	 */
	public double getAfter24hPrecipIntensity() {
		return after24hPrecipIntensity;
	}

	/**
	 * Sets the after24h precip intensity.
	 *
	 * @param after24hPrecipIntensity the new after24h precip intensity
	 */
	public void setAfter24hPrecipIntensity(double after24hPrecipIntensity) {
		this.after24hPrecipIntensity = after24hPrecipIntensity;
	}

	/**
	 * Gets the after24h precip probability.
	 *
	 * @return the after24h precip probability
	 */
	public double getAfter24hPrecipProbability() {
		return after24hPrecipProbability;
	}

	/**
	 * Sets the after24h precip probability.
	 *
	 * @param after24hPrecipProbability the new after24h precip probability
	 */
	public void setAfter24hPrecipProbability(double after24hPrecipProbability) {
		this.after24hPrecipProbability = after24hPrecipProbability;
	}
	

	
}
