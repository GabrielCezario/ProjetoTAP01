package Model;

import Util.Enum.DevelopmentExperience;

public class SoftwareActivity {
	
	private String name;
	private DevelopmentExperience softwareActivityExperience; 
	
	public SoftwareActivity() {
		
	}
	
	public SoftwareActivity(String name, DevelopmentExperience softwareActivityExperience) {
		this.name = name;
		this.softwareActivityExperience = softwareActivityExperience;
	}

	public String getName() {
		return name;
	}

	public DevelopmentExperience getSoftwareActivityExperience() {
		return softwareActivityExperience;
	}

}
