package Model;

import Util.Enum.ActivityTime;

public class SoftwareActivity {

	private String name;
	private String initialLetters;
	private ActivityTime activityExperience;
	
	public SoftwareActivity() {

	}

	public SoftwareActivity(String name, ActivityTime activityExperience) {
		this.name = name;
		this.activityExperience = activityExperience;
		setInitialLetters();
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

	private void setInitialLetters() {
		switch (this.name) {
		case "Analyzing Requirements":
			this.initialLetters = "AR";
			break;
		case "Developing":
			this.initialLetters = "D";
			break;
		case "Creating Tests":
			this.initialLetters = "CT";
			break;
		case "Fixing Bugs":
			this.initialLetters = "FB";
			break;
		case "Analyzing Backlog":
			this.initialLetters = "AB";
			break;
	}	
	}
}
