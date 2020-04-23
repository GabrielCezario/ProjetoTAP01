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
	private List<String> listOfSoftwareActivityName = new ArrayList<String>();
	private List<ActivityTime> listOfSoftwareActivityLvl = new ArrayList<ActivityTime>();

	public List<SoftwareActivity> getSoftActivityList() {
		return this.listOfSoftwareActivity;
	}

	// Private Methods
	// ---------------------------------------------------------------------------------------------------------------------------------------------
	private void generateSoftwareActivity() {
		int numberSoftwareActivity = generateNumberRange(150, 300);
		generateSoftwareActivityLvl();
		generateSoftwareActivityName();

		for (int i = 0; i < numberSoftwareActivity; i++) {
			Collections.shuffle(listOfSoftwareActivityName);
			Collections.shuffle(listOfSoftwareActivityLvl);

			this.listOfSoftwareActivity
					.add(new SoftwareActivity(listOfSoftwareActivityName.get(0), listOfSoftwareActivityLvl.get(0)));
		}
	}

	private void generateSoftwareActivityLvl() {
		this.listOfSoftwareActivityLvl.add(ActivityTime.JUNIOR);
		this.listOfSoftwareActivityLvl.add(ActivityTime.MIDDLE);
		this.listOfSoftwareActivityLvl.add(ActivityTime.SENIOR);
	}

	private void generateSoftwareActivityName() {
		this.listOfSoftwareActivityName.add("Analyzing Requirements");
		this.listOfSoftwareActivityName.add("Developing");
		this.listOfSoftwareActivityName.add("Creating Tests");
		this.listOfSoftwareActivityName.add("Fixing Bugs");
		this.listOfSoftwareActivityName.add("Analyzing Backlog");
	}

	private int generateNumberRange(int min, int max) {
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

	public void test() { // Names and initial letters working perfectly
		for (SoftwareActivity ea : listOfSoftwareActivity) {
			System.out.println(ea.getName() + " " + ea.getInitialLetters());
		}
	}

}
