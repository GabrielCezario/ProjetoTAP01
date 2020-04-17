package Util.Enum;


public enum DevelopmentExperience {
	
	JUNIOR(1), MIDDLE(2), SENIOR(3);
	
	private int experience;
	
	DevelopmentExperience(int experience){
		this.experience = experience;
	}
	
	public int getExperience() {
		return experience;
	}

}
