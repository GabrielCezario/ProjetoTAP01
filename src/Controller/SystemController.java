package Controller;

public class SystemController {
	
	//2 Minutes
	public static final int SERVICE_TIME = 120000;
	public static boolean pause = false;
	public static int numberOfThreads;
	
	public static int seconds;
	public static int minutes;
	public static int hours;
	
	public static int totalAnalyzingRequirements = 0;
	public static int totalDeveloping = 0;
	public static int totalCreatingTests = 0;
	public static int totalFixingBugs = 0;
	public static int totalAnalyzingBackLogs = 0;
	
	public static int totalActivityDone = 0;
	public static int numberOfActivityToDo = 0;
	
	public static void getNumberOfThreadsFromComputer() {
		//SystemController.numberOfThreads = Runtime.getRuntime().availableProcessors();
	}
	
	public static void accounting(String initialLetters) {
		
		if (initialLetters.equalsIgnoreCase("AR")) {
			++totalAnalyzingRequirements;
		}
		
		if (initialLetters.equalsIgnoreCase("D")) {
			++totalDeveloping;
		}
		
		if (initialLetters.equalsIgnoreCase("CT")) {
			++totalCreatingTests;
		}
		
		if (initialLetters.equalsIgnoreCase("FB")) {
			++totalFixingBugs;
		}
		
		if (initialLetters.equalsIgnoreCase("AB")) {
			++totalAnalyzingBackLogs;
		}
		
		++totalActivityDone;
		
	}

}
