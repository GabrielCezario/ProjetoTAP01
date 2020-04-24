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
	
	public static void getNumberOfThreadsFromComputer() {
		SystemController.numberOfThreads = Runtime.getRuntime().availableProcessors();
	}
	
	public static void accounting(String initialLetters) {
		
		switch (initialLetters) {
		case "AR":
			totalAnalyzingRequirements += 1;
			totalActivityDone += 1;
			break;
			
		case "D":
			totalDeveloping += 1;
			totalActivityDone += 1;
			break;
			
		case "CT":
			totalCreatingTests += 1;
			totalActivityDone += 1;
			break;
	
		case "FB":
			totalFixingBugs += 1;
			totalActivityDone += 1;
			break;
	
		case "AB":
			totalAnalyzingBackLogs += 1;
			totalActivityDone += 1;
			break;
		}
		
	}

}
