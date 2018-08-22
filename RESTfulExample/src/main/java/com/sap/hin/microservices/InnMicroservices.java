package com.sap.hin.microservices;

import java.util.ArrayList;
import java.util.List;

import com.sap.hin.entities.MaterialsRequired;
import com.sap.hin.entities.Nutrients;
import com.sap.hin.entities.OnboardedSensor;
import com.sap.hin.entities.OnboardedSystem;
import com.sap.hin.entities.Plant;
import com.sap.hin.entities.Technique;
import com.sap.hin.entities.ThresholdValues;
import com.sap.hin.entities.WaterRequired;

public class InnMicroservices {
	
	public static List<Plant> getPlantList()
	{
		List<Plant> plantList = new ArrayList<Plant>();
		
		Plant p1 = new Plant();
		p1.setPlantName("Tomato");
		p1.setSpaceBetweenPlants("10 cm");
		p1.setType("Vegetable");
		//p1.generatePlantId();
		
		plantList.add(p1);
		
		Plant p2 = new Plant();
		p2.setPlantName("Potato");
		p2.setType("Vegetable");
		p2.setSpaceBetweenPlants("5 cm");
		//p2.generatePlantId();
		
		//Plants plants = new Plants();
		//plants.setPlantList(plantList);
		//return plants;
		
		return plantList;
	}
	
	public static List<Technique> getTechniques()
	{
		List<Technique> techniqueList = new ArrayList<Technique>();
		
		return techniqueList;
	}
	
	public static List<Nutrients> getNutrients()
	{
		List<Nutrients> nutrientList = new ArrayList<Nutrients>();
		
		return nutrientList;
	}
	
    public static List<MaterialsRequired> getMaterialList()
    {
    	List<MaterialsRequired> materialList = new ArrayList<MaterialsRequired>();
		
		return materialList;
    }
    
    public static List<OnboardedSystem> getOnboardedSystems()
    {
    	List<OnboardedSystem> systemList = new ArrayList<OnboardedSystem>();
		
		return systemList;
    }
    
    public static List<OnboardedSensor> getOnboardedSensors()
    {
    	List<OnboardedSensor> sensorList =  new ArrayList<OnboardedSensor>();
    	return sensorList;
    }
    
    public static List<WaterRequired> getWaterRequirements()
    {
    	List<WaterRequired> waterRequirements =  new ArrayList<WaterRequired>();
    	return waterRequirements;
    }
    
    public static List<ThresholdValues> getThresholdValues()
    {
    	List<ThresholdValues> thresholdValues =  new ArrayList<ThresholdValues>();
    	return thresholdValues;
    }
}
