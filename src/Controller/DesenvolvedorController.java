package Controller;

import Model.Developer;
import Util.Enum.DeveloperTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesenvolvedorController {

	private List<Developer> listOfDevelopers = new ArrayList<Developer>();
	private List<String> listDevNames = new ArrayList<String>();
	private List<DeveloperTime> listDevExperience = new ArrayList<DeveloperTime>();

	public List<Developer> generateListDevs() {

		generateDevNames();
		generateDevExperience();

		for (int i = 0; i < 8; i++) {
			Collections.shuffle(listDevNames);
			Collections.shuffle(listDevExperience);

			this.listOfDevelopers.add(new Developer(listDevNames.get(0), listDevExperience.get(0)));
		}

		return listOfDevelopers;

	}

	public void generateDevNames() {
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

	public void generateDevExperience() {
		this.listDevExperience.add(DeveloperTime.JUNIOR);
		this.listDevExperience.add(DeveloperTime.MIDDLE);
		this.listDevExperience.add(DeveloperTime.SENIOR);
	}

}
