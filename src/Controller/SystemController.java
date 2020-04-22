package Controller;

public class SystemController {
	
	//2 Minutes
	public static final int SERVICE_TIME = 120000;
	public static boolean pause = false;
	public static int numberOfThreads;
	
	public static int seconds;
	public static int minutes;
	public static int hours;
	
	public static int totalAnalyzingRequirements;
	public static int totalDeveloping;
	public static int totalCreatingTests;
	public static int totalFixingBugs;
	public static int totalAnalyzingBackLogs;
	
	public static void getNumberOfThreadsFromComputer() {
		SystemController.numberOfThreads = Runtime.getRuntime().availableProcessors();
	}

}
