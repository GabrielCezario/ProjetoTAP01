package Controller;

import Model.Developer;
import Util.Enum.DeveloperTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesenvolvedorController {

	public DesenvolvedorController() {
		generateDevsList();
	}
	
	private List<Developer> listOfDevelopers = new ArrayList<Developer>();
	private List<String> listDevNames = new ArrayList<String>();
	private List<DeveloperTime> listDevExperience = new ArrayList<DeveloperTime>();

	private List<Developer> generateDevsList() {

		generateDevNames();
		generateDevExperience();
		
		for (int i = 0; i < SystemController.numberOfThreads; i++) {
			Collections.shuffle(listDevExperience);
			this.listOfDevelopers.add(new Developer(listDevNames.get(i), listDevExperience.get(0)));
		}

		return listOfDevelopers;
	}

	private void generateDevNames() {
		this.listDevNames.add("Alan Turing");
		this.listDevNames.add("Elliot Alderson");
		this.listDevNames.add("Ada Lovelace");
		this.listDevNames.add("Linus Torvalds");
		this.listDevNames.add("John McAfee");
		this.listDevNames.add("Satoshi Nakamoto");
		this.listDevNames.add("Dennis Ritchie");
		this.listDevNames.add("Bill Gates");
		this.listDevNames.add("Ronaldinho Gaucho");

	}

	private void generateDevExperience() {
		this.listDevExperience.add(DeveloperTime.JUNIOR);
		this.listDevExperience.add(DeveloperTime.MIDDLE);
		this.listDevExperience.add(DeveloperTime.SENIOR);
	}
	
	public List<Developer> getDeveloperList() {
		return this.listOfDevelopers;
	}

}
