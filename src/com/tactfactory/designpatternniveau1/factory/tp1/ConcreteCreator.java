package com.tactfactory.designpatternniveau1.factory.tp1;

public class ConcreteCreator implements Creator {

	@Override
	public Building createBuilding(String criteria) {
		Building result = null;
		switch (criteria) {
		case "CityHall":
			result = new CityHall();
			break;
		
		case "FireDepartement":
			result = new FireDepartment();
			break;
			
		case "House":
			result = new House();
			break;
			
		case "Market":
			result = new Market();
			break;
			
		case "PowerPlant":
			result = new PowerPlant();
			break;
			
		case "School":
			result = new School();
			break;
			
		case "WaterTower":
			result = new WaterTower();
			break;
		default:
			result = null;
			break;
		}
		
		return result;
	}

}
