package Controller;

import java.util.LinkedList;

import javax.swing.JProgressBar;

import Model.Developer;
import Model.SoftwareActivity;
import View.Main;

public class DeveloperThread extends Thread {

	private Developer programador;
	private JProgressBar progress;

	public DeveloperThread(Developer programador, JProgressBar progress) {
		this.programador = programador;
		this.progress = progress;
	}

	public void run () {
		while (AtividadeController.getSoftActivityList().size() > 0 && SystemController.count <= 120) {
	
			SoftwareActivity softwareActivity = AtividadeController.atenderProximo();
			Main.updateLabelsToDo();
			
			if(softwareActivity != null) {
				int time = programador.getDevelopmentExperience().getProp() + softwareActivity.getSoftwareActivityExperience().getProp();
	            progress.setMinimum(0);
	            progress.setMaximum(time);
	            progress.setString(softwareActivity.getName());
	            
	            LinkedList<SoftwareActivity> listOfSoftwareActivityDoing = AtividadeController.getSoftActivityListDoing();
	            
	            if(listOfSoftwareActivityDoing == null) {
					listOfSoftwareActivityDoing = new LinkedList<SoftwareActivity>();
					listOfSoftwareActivityDoing.add(softwareActivity);
				} else {
					listOfSoftwareActivityDoing.add(softwareActivity);
				}
	            
	            AtividadeController.setListOfSoftwareActivityDoing(listOfSoftwareActivityDoing);
	            
	            try {
	            	
					Main.updateLabelsDoing();
	            	
		            for(int i = 1; i <= time; i++){
		                synchronized(this){
		                    while(SystemController.pause){
		                        wait();
		                    }
		                } 
		
		                progress.setValue(i);
		                Thread.sleep(1);
		            }           
	            
	            } catch(Exception e) {
	            	e.printStackTrace();
	            }
	            
	            listOfSoftwareActivityDoing.remove(softwareActivity);
	            LinkedList<SoftwareActivity>listOfSoftwareActivityDone = AtividadeController.getSoftActivityListDone();
				
				if(listOfSoftwareActivityDone == null) {
					listOfSoftwareActivityDone = new LinkedList<SoftwareActivity>();
					listOfSoftwareActivityDone.add(softwareActivity);
				} else {
					listOfSoftwareActivityDone.add(softwareActivity);
				}
				
				SystemController.accounting(softwareActivity.getInitialLetters());
				
				AtividadeController.setListOfSoftwareActivityDone(listOfSoftwareActivityDone);
				
				Main.updateCounters();
				Main.updateLabelsDone();
			}
			
		}
		
		Main.timer.stop();
		
	}
}
