package Model;

import Util.Enum.DeveloperTime;

public class Developer {
	
	private String name;
	private String devCategory;
	private DeveloperTime developmentExperience;
	
	//5000 Is the time (in milliseconds) that developer make your software activity
	
	public Developer() {
		
	}
	
	public Developer(String name, DeveloperTime developmentExperience) {		
		this.name = name;
		this.developmentExperience = developmentExperience;
		setDevCategory();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeveloperTime getDevelopmentExperience() {
		return this.developmentExperience;
	}
	
	private void setDevCategory() {
		if (getDevelopmentExperience().getProp() == 3000) {
			this.devCategory = "Programador Júnior";
		}
		if (getDevelopmentExperience().getProp() == 2000) {
			this.devCategory = "Programador Pleno";
		}
		if (getDevelopmentExperience().getProp() == 1000) {
			this.devCategory = "Programador Sênior";
		}
	}
	
	public String getDevCategory() {
		return this.devCategory;
	}
	
}
