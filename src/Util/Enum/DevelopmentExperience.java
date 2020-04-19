package Util.Enum;


public enum DevelopmentExperience {
	
	JUNIOR(1), MIDDLE(2), SENIOR(3);
	
	private int prop;
	
	DevelopmentExperience(int prop){
		this.prop = prop;
	}
	
	public int getProp() {
		return this.prop;
	}

}
