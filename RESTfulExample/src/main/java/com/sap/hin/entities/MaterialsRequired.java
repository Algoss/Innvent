package com.sap.hin.entities;

import javax.persistence.Column;

public class MaterialsRequired {
	
	@Column(name = "\"MRID\"")
	String MRId;
	
	@Column(name = "\"PlantID\"")
	String plantId;
	
	@Column(name = "\"PlantName\"")
	String plantName;
	
	@Column(name = "\"PlantLevel\"")
	String plantLevel;
	
	@Column(name = "\"Materials\"")
	String materials;

	/**
	 * @return the mRId
	 */
	public String getMRId() {
		return MRId;
	}

	/**
	 * @param mRId the mRId to set
	 */
	public void setMRId(String mRId) {
		MRId = mRId;
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
	 * @return the materials
	 */
	public String getMaterials() {
		return materials;
	}

	/**
	 * @param materials the materials to set
	 */
	public void setMaterials(String materials) {
		this.materials = materials;
	}
	
	

}
