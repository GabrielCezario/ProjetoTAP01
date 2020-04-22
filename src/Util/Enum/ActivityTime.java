package Util.Enum;

public enum ActivityTime {
	
	JUNIOR(1000), MIDDLE(2000), SENIOR(3000);
	
	private int prop;
	
	ActivityTime(int prop){
		this.prop = prop;
	}
	
	public int getProp() {
		return this.prop;
	}

}
