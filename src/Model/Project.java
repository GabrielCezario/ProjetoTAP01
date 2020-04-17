package Model;

import java.util.LinkedList;

public class Project {
	
	private String name;
	private LinkedList<Sprint> listSprint;
	
	public Project() {
		
	}
	
	public Project(String name) {
		this.name = name;
		listSprint = new LinkedList<Sprint>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<Sprint> getListSprint() {
		return listSprint;
	}

	public void setListSprint(LinkedList<Sprint> listSprint) {
		this.listSprint = listSprint;
	}

}
