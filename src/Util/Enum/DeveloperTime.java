package Util.Enum;


public enum DeveloperTime {
	
	JUNIOR(3000), MIDDLE(2000), SENIOR(1000);
	
	private int prop;
	
	DeveloperTime(int prop){
		this.prop = prop;
	}
	
	public int getProp() {
		return this.prop;
	}

}
