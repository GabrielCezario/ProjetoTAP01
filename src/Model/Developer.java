package Model;

import Util.Enum.DevelopmentExperience;

public class Developer {
	
	private String name;
	private int activityExecutionTime;
	private DevelopmentExperience developmentExperience; 
	
	//5000 Is the time (in milliseconds) that developer make your software activity
	
	public Developer() {
		this.activityExecutionTime = 5000;
	}
	
	public Developer(String name, DevelopmentExperience developmentExperience) {		
		this.name = name;
		this.activityExecutionTime = 5000;
		this.developmentExperience = developmentExperience;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getActivityExecutionTime() {
		return activityExecutionTime;
	}

	public DevelopmentExperience getDevelopmentExperience() {
		return developmentExperience;
	}

}
