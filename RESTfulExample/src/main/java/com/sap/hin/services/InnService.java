package com.sap.hin.services;
 
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sap.hin.entities.MaterialsRequired;
import com.sap.hin.entities.Nutrients;
import com.sap.hin.entities.OnboardedSensor;
import com.sap.hin.entities.OnboardedSystem;
import com.sap.hin.entities.Plant;
import com.sap.hin.entities.Technique;
import com.sap.hin.entities.ThresholdValues;
import com.sap.hin.entities.WaterRequired;
import com.sap.hin.microservices.InnMicroservices;


@Path("/hin")
public class InnService {
 
	@GET
	@Path("/plants")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Plant> getPlantList() {
		
		List<Plant> plants = InnMicroservices.getPlantList();
		return plants;
	}
	
	@GET
	@Path("/techniques")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Technique> getTechniques() {
		
		List<Technique> techniques = InnMicroservices.getTechniques();
		return techniques;
	}
	
	@GET
	@Path("/nutrients")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Nutrients> getNutrients() {
		
		List<Nutrients> nutrients = InnMicroservices.getNutrients();
		return nutrients;
	}
	
	@GET
	@Path("/thresholdValues")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ThresholdValues> getThresholdValues() {
		
		List<ThresholdValues> thresholdValues = InnMicroservices.getThresholdValues();
		return thresholdValues;
	}
	
	@GET
	@Path("/waterRequirements")
	@Produces(MediaType.APPLICATION_JSON)
	public List<WaterRequired> getWaterRequired() {
		
		List<WaterRequired> waterRequirements = InnMicroservices.getWaterRequirements();
		return waterRequirements;
	}
	
	@GET
	@Path("/materialRequirements")
	@Produces(MediaType.APPLICATION_JSON)
	public List<MaterialsRequired> getMaterialsRequired() {
		
		List<MaterialsRequired> materialRequirements = InnMicroservices.getMaterialList();
		return materialRequirements;
	}
	
	@GET
	@Path("/onboardedSystems")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OnboardedSystem> getOnboardedSystems() {
		
		List<OnboardedSystem> onboardedSystems = InnMicroservices.getOnboardedSystems();
		return onboardedSystems;
	}
	
	@GET
	@Path("/onboardedSensors")
	@Produces(MediaType.APPLICATION_JSON)
	public List<OnboardedSensor> getOnboardedSensors() {
		
		List<OnboardedSensor> onboardedSensors = InnMicroservices.getOnboardedSensors();
		return onboardedSensors;
	}
}