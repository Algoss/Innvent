package com.sap.hin.entities;

import javax.persistence.Column;

public class ThresholdValues {

	@Column(name = "\"ThresholdID\"")
	String thresholdId;
	
	@Column(name = "\"PlantID\"")
	String plantId;
	
	@Column(name = "\"PlantName\"")
	String plantName;
	
	@Column(name = "\"PlantLevel\"")
	String plantLevel;
	
	@Column(name = "\"ThresholdType\"")
	String thresholdType;
	
	@Column(name = "\"ThresholdMin\"")
	String thresholdMin;
	
	@Column(name = "\"ThresholdMax\"")
	String thresholdMax;
	
	@Column(name = "\"ThresholdUnit\"")
	String thresholdUnit;

	/**
	 * @return the thresholdId
	 */
	public String getThresholdId() {
		return thresholdId;
	}

	/**
	 * @param thresholdId the thresholdId to set
	 */
	public void setThresholdId(String thresholdId) {
		this.thresholdId = thresholdId;
	}

	/**
	 * @return the plantId
	 */
	public String getPlantId() {
		return plantId;
	}

	/**
	 * @param plantId the plantId to set
	 */
	public void setPlantId(String plantId) {
		this.plantId = plantId;
	}

	/**
	 * @return the plantName
	 */
	public String getPlantName() {
		return plantName;
	}

	/**
	 * @param plantName the plantName to set
	 */
	public void setPlantName(String plantName) {
		this.plantName = plantName;
	}

	/**
	 * @return the plantLevel
	 */
	public String getPlantLevel() {
		return plantLevel;
	}

	/**
	 * @param plantLevel the plantLevel to set
	 */
	public void setPlantLevel(String plantLevel) {
		this.plantLevel = plantLevel;
	}

	/**
	 * @return the thresholdType
	 */
	public String getThresholdType() {
		return thresholdType;
	}

	/**
	 * @param thresholdType the thresholdType to set
	 */
	public void setThresholdType(String thresholdType) {
		this.thresholdType = thresholdType;
	}

	/**
	 * @return the thresholdMin
	 */
	public String getThresholdMin() {
		return thresholdMin;
	}

	/**
	 * @param thresholdMin the thresholdMin to set
	 */
	public void setThresholdMin(String thresholdMin) {
		this.thresholdMin = thresholdMin;
	}

	/**
	 * @return the thresholdMax
	 */
	public String getThresholdMax() {
		return thresholdMax;
	}

	/**
	 * @param thresholdMax the thresholdMax to set
	 */
	public void setThresholdMax(String thresholdMax) {
		this.thresholdMax = thresholdMax;
	}

	/**
	 * @return the thresholdUnit
	 */
	public String getThresholdUnit() {
		return thresholdUnit;
	}

	/**
	 * @param thresholdUnit the thresholdUnit to set
	 */
	public void setThresholdUnit(String thresholdUnit) {
		this.thresholdUnit = thresholdUnit;
	}
	
	
}
