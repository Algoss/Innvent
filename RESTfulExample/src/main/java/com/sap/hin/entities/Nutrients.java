package com.sap.hin.entities;

import javax.persistence.Column;

public class Nutrients {

	@Column(name = "\"NutrientID\"")
	String nutrientId;
	
	@Column(name = "\"PlantID\"")
	String plantId;
	
	@Column(name = "\"PlantName\"")
	String plantName;
	
	@Column(name = "\"PlantLevel\"")
	String plantLevel;
	
	@Column(name = "\"NutrientName\"")
	String nutrientName;
	
	@Column(name = "\"NutrientValue\"")
	String nutrientValue;

	/**
	 * @return the nutrientId
	 */
	public String getNutrientId() {
		return nutrientId;
	}

	/**
	 * @param nutrientId the nutrientId to set
	 */
	public void setNutrientId(String nutrientId) {
		this.nutrientId = nutrientId;
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
	 * @return the nutrientName
	 */
	public String getNutrientName() {
		return nutrientName;
	}

	/**
	 * @param nutrientName the nutrientName to set
	 */
	public void setNutrientName(String nutrientName) {
		this.nutrientName = nutrientName;
	}

	/**
	 * @return the nutrientValue
	 */
	public String getNutrientValue() {
		return nutrientValue;
	}

	/**
	 * @param nutrientValue the nutrientValue to set
	 */
	public void setNutrientValue(String nutrientValue) {
		this.nutrientValue = nutrientValue;
	}
	
	
}
