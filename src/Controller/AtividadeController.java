package Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import Model.Developer;
import Model.SoftwareActivity;
import Util.Enum.DevelopmentExperience;

public class AtividadeController {
	
	public AtividadeController() {
		generateSoftwareActivity();
	}
 	
	private List<SoftwareActivity> listOfSoftwareActivity = new ArrayList<SoftwareActivity>();
	private List<String> listNameOfSoftwareActivity = new ArrayList<String>();
	private List<DevelopmentExperience> listLvlOfSoftwareActivity = new ArrayList<DevelopmentExperience>();
	
	private List<SoftwareActivity> generateSoftwareActivity() {	
		
		int numberSoftwareActivity = generateNumberRange(150, 300);
		
		generateSoftwareActivityName();
		generateSoftwareActivityLvl();
		
		
		for (int i = 0; i < numberSoftwareActivity; i++) {
			Collections.shuffle(listNameOfSoftwareActivity);
			Collections.shuffle(listLvlOfSoftwareActivity);
			this.listOfSoftwareActivity.add(new SoftwareActivity(listNameOfSoftwareActivity.get(0), listLvlOfSoftwareActivity.get(0)));
		}
		
		return this.listOfSoftwareActivity;
	}
	
	//Private Methods
	//---------------------------------------------------------------------------------------------------------------------------------------------
	
	private void generateSoftwareActivityName() {
		this.listNameOfSoftwareActivity.add("Analisando requisitos");
		this.listNameOfSoftwareActivity.add("Desenvolvendo");
		this.listNameOfSoftwareActivity.add("Criando testes");
		this.listNameOfSoftwareActivity.add("Commitando codigo");
		this.listNameOfSoftwareActivity.add("Corrigindo bugs");
		this.listNameOfSoftwareActivity.add("Analisando backlog");
	}
	
	private void generateSoftwareActivityLvl() {
		this.listLvlOfSoftwareActivity.add(DevelopmentExperience.JUNIOR);
		this.listLvlOfSoftwareActivity.add(DevelopmentExperience.MIDDLE);
		this.listLvlOfSoftwareActivity.add(DevelopmentExperience.SENIOR);
	}
	
	private static int generateNumberRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
	public List<SoftwareActivity> getSoftActivityList() {
		return this.listOfSoftwareActivity;
	}

}
