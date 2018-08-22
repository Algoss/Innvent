package com.sap.hin.entities;

import javax.persistence.Column;

public class Technique {

	@Column(name = "\"TechniqueID\"")
	String techniqueId;
	
	@Column(name = "\"PlantID\"")
	String plantId;
	
	@Column(name = "\"PlantName\"")
	String plantName;
	
	@Column(name = "\"PrimaryTechnique\"")
	String primaryTechnique;
	
	@Column(name = "\"OtherTechniques\"")
	String otherTechniques;

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
	 * @return the primaryTechnique
	 */
	public String getPrimaryTechnique() {
		return primaryTechnique;
	}

	/**
	 * @param primaryTechnique the primaryTechnique to set
	 */
	public void setPrimaryTechnique(String primaryTechnique) {
		this.primaryTechnique = primaryTechnique;
	}

	/**
	 * @return the otherTechniques
	 */
	public String getOtherTechniques() {
		return otherTechniques;
	}

	/**
	 * @param otherTechniques the otherTechniques to set
	 */
	public void setOtherTechniques(String otherTechniques) {
		this.otherTechniques = otherTechniques;
	}
	
	
}
