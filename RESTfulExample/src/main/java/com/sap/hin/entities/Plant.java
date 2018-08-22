package com.sap.hin.entities;


import javax.persistence.Column;

public class Plant {
	
	@Column(name = "\"PlantId\"")
	String plantId;
	
	@Column(name = "\"PlantName\"")
	String plantName;
	
	@Column(name = "\"Type\"")
	String type;
	
	@Column(name = "\"SpaceBetweenPlants\"")
	String spaceBetweenPlants;

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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the spaceBetweenPlants
	 */
	public String getSpaceBetweenPlants() {
		return spaceBetweenPlants;
	}

	/**
	 * @param spaceBetweenPlants the spaceBetweenPlants to set
	 */
	public void setSpaceBetweenPlants(String spaceBetweenPlants) {
		this.spaceBetweenPlants = spaceBetweenPlants;
	}
	
	

}
