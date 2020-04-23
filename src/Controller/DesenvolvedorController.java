package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import Model.Developer;
import Model.SoftwareActivity;
import Util.Enum.DeveloperTime;

public class DesenvolvedorController implements Runnable{
	
	private List<Developer> listOfDevelopers = new ArrayList<Developer>();
	private List<String> listDevNames = new ArrayList<String>();
	private List<DeveloperTime> listDevExperience = new ArrayList<DeveloperTime>();
	
	private static AtividadeController atividadeController;
	
	private int getIndexInit = 0;

	//Constructor initializing developer list
	public DesenvolvedorController() {
		generateDevsList();
	}
	
	//Public methods
	//------------------------------------------------------------------------------------------------------------------------------------------------
	
	public void run() {
		while(true) {
			//startProgramming();			
		}
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
	
	private synchronized void startProgramming() {
		LinkedList<SoftwareActivity> listOfSoftwareActivity = atividadeController.getSoftActivityList();
		LinkedList<SoftwareActivity> listOfSoftwareActivityDoing = null;
		LinkedList<SoftwareActivity> listOfSoftwareActivityDone = null;
		
		SoftwareActivity softwareActivity = null;
				
		if(atividadeController.getSoftActivityList().size() != 0) {
			
			softwareActivity = listOfSoftwareActivity.pop();
			int timeActivity = softwareActivity.getSoftwareActivityExperience().getProp();
			
			AtividadeController.setListOfSoftwareActivity(listOfSoftwareActivity);
			
			try {
				listOfSoftwareActivityDoing = atividadeController.getSoftActivityListDoing();
				
				if(listOfSoftwareActivityDoing == null) {
					listOfSoftwareActivityDoing = new LinkedList<SoftwareActivity>();
					listOfSoftwareActivityDoing.add(softwareActivity);
				} else {
					listOfSoftwareActivityDoing.add(softwareActivity);
				}
				
				AtividadeController.setListOfSoftwareActivityDoing(listOfSoftwareActivityDoing);
				Thread.sleep(timeActivity);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			listOfSoftwareActivityDoing.remove(softwareActivity);
			listOfSoftwareActivityDone = atividadeController.getSoftActivityListDone();
			
			if(listOfSoftwareActivityDone == null) {
				listOfSoftwareActivityDone = new LinkedList<SoftwareActivity>();
				listOfSoftwareActivityDone.add(softwareActivity);
			} else {
				listOfSoftwareActivityDone.add(softwareActivity);
			}
			
			AtividadeController.setListOfSoftwareActivityDone(listOfSoftwareActivityDone);
		}
		
		
	}

}
