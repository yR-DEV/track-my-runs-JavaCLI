package zc.trackmyruns.cli;

import java.util.Scanner;

import zc.trackmyruns.cli.run.RunDAOClass;
import zc.trackmyruns.cli.run.RunList;

public class Cli {
	
	private static RunList rList = new RunList();

	public static void main(String[] args) {
		
		RunDAOClass runDOA = new RunDAOClass();
		RunList.setRuns(runDOA.getAllRuns());
		System.out.println("Runs loaded.");
		
		mainMenu();
		
	}
	
	public static void mainMenu() {
		
		System.out.println("-------------------------------------");
		System.out.println("----    TRACK YOUR RUNS HERE     ----");
		
		
		Scanner scanUserInput = new Scanner(System.in);
		String userInput;
		boolean quit = false;
		
		while(!quit) {
			System.out.println("-------------------------------------");
			System.out.println("-- Please enter your command:      --");
			System.out.println("--   RUNS: to view your runs       --");
			System.out.println("--   ADD: to add a new run         --");
			System.out.println("--   EDIT: to update an old run    --");
			System.out.println("--   LONGEST: to see longest run   --");
			System.out.println("--   DELETE: remove created run    --");
			System.out.println("--   SAVE: to save changes         --");
			System.out.println("--   QUIT: to exit the program!    --");
			System.out.println("-------------------------------------");
			
			userInput = scanUserInput.nextLine().trim().toLowerCase();
			
			switch(userInput) {
			case "runs":
				
				break;
			case "add":
				
				break;
			case "edit":
				
				break;
			case "longest":
				
				break;
			case "delete":
				
				break;
			case "quit":
				
				break;
			case "save":
				
				break;
			case "exit":
				
				break;
			default:
				System.out.println("Your input was incorrect, please try again.");
			}
		}
		
	}	
	
}
