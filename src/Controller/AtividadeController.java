package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import Model.Developer;
import Model.SoftwareActivity;
import Util.Enum.ActivityTime;

public class AtividadeController {
	
	public AtividadeController() {
		generateSoftwareActivity();
	}
 	
	private List<SoftwareActivity> listOfSoftwareActivity = new ArrayList<SoftwareActivity>();
	private List<String> listNameOfSoftwareActivity = new ArrayList<String>();
	private List<ActivityTime> listLvlOfSoftwareActivity = new ArrayList<ActivityTime>();
	
	public List<SoftwareActivity> getSoftActivityList() {
		return this.listOfSoftwareActivity;
	}
	
	//Private Methods
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	private void generateSoftwareActivityName() {
		this.listNameOfSoftwareActivity.add("AR - Analyzing Requirements");
		this.listNameOfSoftwareActivity.add("D - DDeveloping");
		this.listNameOfSoftwareActivity.add("CT - Creating Tests");
		this.listNameOfSoftwareActivity.add("FB - Fixing Bugs");
		this.listNameOfSoftwareActivity.add("AB - Analyzing Backlog");
	}
	
	private void generateSoftwareActivityLvl() {
		this.listLvlOfSoftwareActivity.add(ActivityTime.JUNIOR);
		this.listLvlOfSoftwareActivity.add(ActivityTime.MIDDLE);
		this.listLvlOfSoftwareActivity.add(ActivityTime.SENIOR);
	}
	
	private int generateNumberRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
	
	private void generateSoftwareActivity() {	
		int numberSoftwareActivity = generateNumberRange(150, 300);
		
		generateSoftwareActivityName();
		generateSoftwareActivityLvl();
		
		
		for (int i = 0; i < numberSoftwareActivity; i++) {
			Collections.shuffle(listNameOfSoftwareActivity);
			Collections.shuffle(listLvlOfSoftwareActivity);
			
			String name = listNameOfSoftwareActivity.get(0);
			String softwareActivityName = name.substring(5, name.length());
			String softwareActivityInitialLetters = name.substring(0, 2);
			
			this.listOfSoftwareActivity.add(new SoftwareActivity(softwareActivityName, listLvlOfSoftwareActivity.get(0), softwareActivityInitialLetters));
		}
	}

}
