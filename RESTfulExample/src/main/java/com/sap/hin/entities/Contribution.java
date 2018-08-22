package com.sap.hin.entities;

import javax.persistence.Column;

public class Contribution {
	
	@Column(name = "\"PostID\"")
	String postId;
	
	@Column(name = "\"ProfileID\"")
	String profileId;
	
	@Column(name = "\"PlantLevel\"")
	String plantLevel;
	
	@Column(name = "\"CropName\"")
	String cropName;
	
	@Column(name = "\"Technique\"")
	String technique;
	
	@Column(name = "\"Nutrients\"")
	String nutrients;
	
	@Column(name = "\"ThresholdValues\"")
	String thresholdValues;
	
	@Column(name = "\"SpaceRequiredBetweenPlants\"")
	String spaceRequiredBetweenPlants;
	
	@Column(name = "\"WaterRequired\"")
	String waterRequired;
	
	@Column(name = "\"MaterialRequired\"")
	String materialRequired;
	
	@Column(name = "\"AdditionalComment\"")
	String additionalComment;
}
