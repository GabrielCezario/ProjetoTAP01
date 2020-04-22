package Model;

import Util.Enum.ActivityTime;

public class SoftwareActivity {
	
	private String name;
	private ActivityTime activityExperience; 
	private String initialLetters;
	private int priority;
	
	public SoftwareActivity() {
		
	}
	
	public SoftwareActivity(String name, ActivityTime activityExperience, String initialLetters) {
		this.name = name;
		this.activityExperience = activityExperience;
		this.initialLetters = initialLetters;
	}

	public String getName() {
		return name;
	}

	public ActivityTime getSoftwareActivityExperience() {
		return activityExperience;
	}

	public String getInitialLetters() {
		return initialLetters;
	}

	public void setInitialLetters(String initialLetters) {
		this.initialLetters = initialLetters;
	}
	

}
