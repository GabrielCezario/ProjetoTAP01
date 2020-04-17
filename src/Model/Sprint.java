package Model;

import java.util.LinkedList;

public class Sprint {
	
	private String name;
	private LinkedList<SoftwareActivity> listSoftwareActivity;
	
	public Sprint() {
		listSoftwareActivity = new LinkedList<SoftwareActivity>();
	}
	
	public Sprint(String name) {
		this.name = name;
		listSoftwareActivity = new LinkedList<SoftwareActivity>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LinkedList<SoftwareActivity> getListSoftwareActivity() {
		return listSoftwareActivity;
	}

	public void setListSoftwareActivity(LinkedList<SoftwareActivity> listSoftwareActivity) {
		this.listSoftwareActivity = listSoftwareActivity;
	}

}
