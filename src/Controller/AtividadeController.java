package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import Model.SoftwareActivity;
import Util.Enum.ActivityTime;

public class AtividadeController {
	
	private static LinkedList<SoftwareActivity> listOfSoftwareActivity = new LinkedList<SoftwareActivity>();
	private static LinkedList<SoftwareActivity> listOfSoftwareActivityDoing = new LinkedList<SoftwareActivity>();
	private static LinkedList<SoftwareActivity> listOfSoftwareActivityDone = new LinkedList<SoftwareActivity>();
	
	private List<String> listOfSoftwareActivityName = new ArrayList<String>();
	private List<ActivityTime> listOfSoftwareActivityLvl = new ArrayList<ActivityTime>();

	//Constructor initializing list of activity
	public AtividadeController() {
		generateSoftwareActivity();
	}
	
	// Public Methods
	// ---------------------------------------------------------------------------------------------------------------------------------------------

	public LinkedList<SoftwareActivity> getSoftActivityList() {
		return this.listOfSoftwareActivity;
	}
	
	public LinkedList<SoftwareActivity> getSoftActivityListDoing() {
		return this.listOfSoftwareActivityDoing;
	}
	
	public LinkedList<SoftwareActivity> getSoftActivityListDone() {
		return this.listOfSoftwareActivityDone;
	}
	
	public static void setListOfSoftwareActivity(LinkedList<SoftwareActivity> listOfSoftwareActivity) {
		listOfSoftwareActivity = listOfSoftwareActivity;
	}

	public static void setListOfSoftwareActivityDoing(LinkedList<SoftwareActivity> listOfSoftwareActivityDoing) {
		listOfSoftwareActivityDoing = listOfSoftwareActivityDoing;
	}

	public static void setListOfSoftwareActivityDone(LinkedList<SoftwareActivity> listOfSoftwareActivityDone) {
		listOfSoftwareActivityDone = listOfSoftwareActivityDone;
	}

	public void test() { // Names and initial letters working perfectly
		for (SoftwareActivity ea : listOfSoftwareActivity) {
			System.out.println(ea.getName() + " " + ea.getInitialLetters());
		}
	}


	// Private Methods
	// ---------------------------------------------------------------------------------------------------------------------------------------------
	
	private void generateSoftwareActivityName() {
		this.listOfSoftwareActivityName.add("Analyzing Requirements");
		this.listOfSoftwareActivityName.add("Developing");
		this.listOfSoftwareActivityName.add("Creating Tests");
		this.listOfSoftwareActivityName.add("Fixing Bugs");
		this.listOfSoftwareActivityName.add("Analyzing Backlog");
	}
	
	private void generateSoftwareActivityLvl() {
		this.listOfSoftwareActivityLvl.add(ActivityTime.JUNIOR);
		this.listOfSoftwareActivityLvl.add(ActivityTime.MIDDLE);
		this.listOfSoftwareActivityLvl.add(ActivityTime.SENIOR);
	}
	
	private void generateSoftwareActivity() {
		int numberSoftwareActivity = generateNumberRange(150, 300);
		generateSoftwareActivityLvl();
		generateSoftwareActivityName();

		for (int i = 0; i < numberSoftwareActivity; i++) {
			Collections.shuffle(listOfSoftwareActivityName);
			Collections.shuffle(listOfSoftwareActivityLvl);

			this.listOfSoftwareActivity.add(new SoftwareActivity(listOfSoftwareActivityName.get(0), listOfSoftwareActivityLvl.get(0)));
		}
	}

	private int generateNumberRange(int min, int max) {
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

}
