package Model;

import Util.Enum.ActivityTime;

public class SoftwareActivity {
	
	private String name;
	private ActivityTime activityExperience; 
	
	public SoftwareActivity() {
		
	}
	
	public SoftwareActivity(String name, ActivityTime activityExperience) {
		this.name = name;
		this.activityExperience = activityExperience;
	}

	public String getName() {
		return name;
	}

	public ActivityTime getSoftwareActivityExperience() {
		return activityExperience;
	}

}
