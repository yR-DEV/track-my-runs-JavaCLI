package zc.trackmyruns.cli.run;

import java.util.ArrayList;
import java.util.List;

public class RunList {

	private static List<Run> runL = new ArrayList<Run>();
	
	public void displayRuns() {
		System.out.println("----RUNS----");
		for (Run r : runL) {
			System.out.println(r);
		}
		return;
	}
	
	public static void setRuns(List<Run> runL) {
		RunList.runL = runL;
	}
	
	
}
