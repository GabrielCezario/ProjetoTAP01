package Model;

import Util.Enum.DeveloperTime;

public class Developer {
	
	private String name;
	private int activityExecutionTime;
	private DeveloperTime developmentExperience; 
	
	//5000 Is the time (in milliseconds) that developer make your software activity
	
	public Developer() {
		this.activityExecutionTime = 5000;
	}
	
	public Developer(String name, DeveloperTime developmentExperience) {		
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

	public DeveloperTime getDevelopmentExperience() {
		return developmentExperience;
	}

}
