package com.sap.hin.entities;

import javax.persistence.Column;

public class WaterRequired {
	
	@Column(name = "\"WRID\"")
	String WRId;
	
	@Column(name = "\"PlantID\"")
	String plantId;
	
	@Column(name = "\"PlantName\"")
	String plantName;
	
	@Column(name = "\"PlantLevel\"")
	String plantLevel;
	
	@Column(name = "\"WaterLevel\"")
	String waterLevel;

	/**
	 * @return the wRId
	 */
	public String getWRId() {
		return WRId;
	}

	/**
	 * @param wRId the wRId to set
	 */
	public void setWRId(String wRId) {
		WRId = wRId;
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
	 * @return the waterLevel
	 */
	public String getWaterLevel() {
		return waterLevel;
	}

	/**
	 * @param waterLevel the waterLevel to set
	 */
	public void setWaterLevel(String waterLevel) {
		this.waterLevel = waterLevel;
	}
	
	

}
