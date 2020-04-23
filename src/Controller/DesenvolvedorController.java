package Controller;

import Model.Developer;
import Util.Enum.DeveloperTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesenvolvedorController implements Runnable{
	
	private List<Developer> listOfDevelopers = new ArrayList<Developer>();
	private List<String> listDevNames = new ArrayList<String>();
	private List<DeveloperTime> listDevExperience = new ArrayList<DeveloperTime>();
	
	private int getIndexInit = 0;

	//Constructor initializing developer list
	public DesenvolvedorController() {
		generateDevsList();
	}
	
	//Public methods
	//------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void run() {
		
	}
	
	public String getInitDevelopersName() {
		verifyIndex();
		return this.listOfDevelopers.get(getIndexInit++).getName();
		
	}
	
	public String getInitDevelopersExp() {
		verifyIndex();
		return this.listOfDevelopers.get(getIndexInit++).getDevCategory();
		
	}
	
	//Private Methods
	//------------------------------------------------------------------------------------------------------------------------------------------------

	private void generateDevNames() {
		this.listDevNames.add("Alan Turing");
		this.listDevNames.add("Elliot Alderson");
		this.listDevNames.add("Ada Lovelace");
		this.listDevNames.add("Linus Torvalds");
		this.listDevNames.add("John McAfee");
		this.listDevNames.add("Satoshi Nakamoto");
		this.listDevNames.add("Dennis Ritchie");
		this.listDevNames.add("Bill Gates");
	}

	private void generateDevExperience() {
		this.listDevExperience.add(DeveloperTime.JUNIOR);
		this.listDevExperience.add(DeveloperTime.MIDDLE);
		this.listDevExperience.add(DeveloperTime.SENIOR);
	}
	
	private void generateDevsList() {

		generateDevNames();
		generateDevExperience();

		for (int i = 0; i < 8; i++) {
			Collections.shuffle(listDevExperience);
			this.listOfDevelopers.add(new Developer(listDevNames.get(i), listDevExperience.get(0)));
		}
	}

	private void verifyIndex() {
		if (getIndexInit == listOfDevelopers.size()) {
			this.getIndexInit = 0;
		}
	}

}
