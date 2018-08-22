package com.sap.hin.entities;

import javax.persistence.Column;

public class OnboardedSystem {
	
	@Column(name = "\"SystemID\"")
	String systemId;
	
	@Column(name = "\"PlantID\"")
	String plantId;
	
	@Column(name = "\"PlantName\"")
	String plantName;
	
	@Column(name = "\"NumOfSensors\"")
	String NumOfSensors;
	
	@Column(name = "\"TechniqueId\"")
	String techniqueId;
	
	@Column(name = "\"TechniqueName\"")
	String techniqueName;
	
	@Column(name = "\"LightType\"")
	String lightType;
	
	@Column(name = "\"IsOpenArea\"")
	String isOpenArea;

	/**
	 * @return the systemId
	 */
	public String getSystemId() {
		return systemId;
	}

	/**
	 * @param systemId the systemId to set
	 */
	public void setSystemId(String systemId) {
		this.systemId = systemId;
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
	 * @return the numOfSensors
	 */
	public String getNumOfSensors() {
		return NumOfSensors;
	}

	/**
	 * @param numOfSensors the numOfSensors to set
	 */
	public void setNumOfSensors(String numOfSensors) {
		NumOfSensors = numOfSensors;
	}

	/**
	 * @return the techniqueId
	 */
	public String getTechniqueId() {
		return techniqueId;
	}

	/**
	 * @param techniqueId the techniqueId to set
	 */
	public void setTechniqueId(String techniqueId) {
		this.techniqueId = techniqueId;
	}

	/**
	 * @return the techniqueName
	 */
	public String getTechniqueName() {
		return techniqueName;
	}

	/**
	 * @param techniqueName the techniqueName to set
	 */
	public void setTechniqueName(String techniqueName) {
		this.techniqueName = techniqueName;
	}

	/**
	 * @return the lightType
	 */
	public String getLightType() {
		return lightType;
	}

	/**
	 * @param lightType the lightType to set
	 */
	public void setLightType(String lightType) {
		this.lightType = lightType;
	}

	/**
	 * @return the isOpenArea
	 */
	public String getIsOpenArea() {
		return isOpenArea;
	}

	/**
	 * @param isOpenArea the isOpenArea to set
	 */
	public void setIsOpenArea(String isOpenArea) {
		this.isOpenArea = isOpenArea;
	}
	
	
}
