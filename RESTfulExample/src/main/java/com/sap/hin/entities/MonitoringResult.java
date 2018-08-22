package com.sap.hin.entities;

import javax.persistence.Column;

public class MonitoringResult {

	@Column(name="\"ProfileId\"")
	String profileId;
	
	@Column(name="\"CropName\"")
	String cropName;
	
	@Column(name="\"TechniqueUsed\"")
	String techniqueUsed;
	
	@Column(name="\"NutrientsUsed\"")
	String nutrientsUsed;
	
	@Column(name="\"WaterUsed\"")
	String waterUsed;
	
	@Column(name="\"ThresholdValues\"")
	String thresholdValues;
	
	@Column(name="\"LightUsed\"")
	String lightUsed;
	
	@Column(name="\"ContainerUsed\"")
	String containerUsed;
	
	@Column(name="\"startDate\"")
	String startDate;
	
	@Column(name="\"endDate\"")
	String endDate;
	
	@Column(name="\"ProductionAsQuantity\"")
	String productionAsQuantity;
	
	@Column(name="\"AdditionalComment\"")
	String additionalComment;

	/**
	 * @return the profileId
	 */
	public String getProfileId() {
		return profileId;
	}

	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}

	/**
	 * @return the cropName
	 */
	public String getCropName() {
		return cropName;
	}

	/**
	 * @param cropName the cropName to set
	 */
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}

	/**
	 * @return the techniqueUsed
	 */
	public String getTechniqueUsed() {
		return techniqueUsed;
	}

	/**
	 * @param techniqueUsed the techniqueUsed to set
	 */
	public void setTechniqueUsed(String techniqueUsed) {
		this.techniqueUsed = techniqueUsed;
	}

	/**
	 * @return the nutrientsUsed
	 */
	public String getNutrientsUsed() {
		return nutrientsUsed;
	}

	/**
	 * @param nutrientsUsed the nutrientsUsed to set
	 */
	public void setNutrientsUsed(String nutrientsUsed) {
		this.nutrientsUsed = nutrientsUsed;
	}

	/**
	 * @return the waterUsed
	 */
	public String getWaterUsed() {
		return waterUsed;
	}

	/**
	 * @param waterUsed the waterUsed to set
	 */
	public void setWaterUsed(String waterUsed) {
		this.waterUsed = waterUsed;
	}

	/**
	 * @return the thresholdValues
	 */
	public String getThresholdValues() {
		return thresholdValues;
	}

	/**
	 * @param thresholdValues the thresholdValues to set
	 */
	public void setThresholdValues(String thresholdValues) {
		this.thresholdValues = thresholdValues;
	}

	/**
	 * @return the lightUsed
	 */
	public String getLightUsed() {
		return lightUsed;
	}

	/**
	 * @param lightUsed the lightUsed to set
	 */
	public void setLightUsed(String lightUsed) {
		this.lightUsed = lightUsed;
	}

	/**
	 * @return the containerUsed
	 */
	public String getContainerUsed() {
		return containerUsed;
	}

	/**
	 * @param containerUsed the containerUsed to set
	 */
	public void setContainerUsed(String containerUsed) {
		this.containerUsed = containerUsed;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the productionAsQuantity
	 */
	public String getProductionAsQuantity() {
		return productionAsQuantity;
	}

	/**
	 * @param productionAsQuantity the productionAsQuantity to set
	 */
	public void setProductionAsQuantity(String productionAsQuantity) {
		this.productionAsQuantity = productionAsQuantity;
	}

	/**
	 * @return the additionalComment
	 */
	public String getAdditionalComment() {
		return additionalComment;
	}

	/**
	 * @param additionalComment the additionalComment to set
	 */
	public void setAdditionalComment(String additionalComment) {
		this.additionalComment = additionalComment;
	}
	
	
}
