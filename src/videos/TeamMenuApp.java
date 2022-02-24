package videos;

import java.util.Scanner;

public class TeamMenuApp {
	static Scanner s = new Scanner(System.in);
	static int addingIndex = 0;

	public static void main(String[] args) {
		
		/*
		 * add team member 
		 * view team member 
		 * view all team members 
		 * delete team member by position 
		 * delete all team members
		 */
		
		String[] team = new String[5];
		
		int decision = 0;
		
		while(decision != -1) {
			showMenu();			
			decision = s.nextInt();
			
			if (decision < -1 || decision > 5 ){
				System.out.println("Please pick a valid option.");				
			} else if (decision == 1) {
				showTeam(team);
			} else if (decision == 2) {
				showTeamMember(team);
			} else if (decision == 3) {
				addTeamMember(team);
			} else if (decision == 4) {
				deleteTeamMember(team);
			} else {
				deleteAllTeamMebers(team);
			}
				
		}
	}
	
	private static void deleteAllTeamMebers(String[] team) {
		for (int i = 0; i < team.length; i++) {
			team[i] = "null";
		}
		
	}

	private static void deleteTeamMember(String[] team) {
		System.out.println("Which team member would you like to delete?");
		int memberToDelete = s.nextInt();
		if (isValid(memberToDelete)) {
			team[memberToDelete] = "null";
		}
	}

	private static void addTeamMember(String[] team) {
		System.out.print("Enter new member name: ");
		String newMember = s.next();
		if (isValid(addingIndex)) {
		team[addingIndex++] = newMember;
		} 
	}

	private static void showTeamMember(String[] team) {
		
		System.out.println("Which team Member would you like to see?");
		int teamNumber = s.nextInt();
		if (isValid(teamNumber)) {
		System.out.println(teamNumber + ": " + team[teamNumber]);
		} 
	}

	private static void showTeam(String[] team) {
		System.out.println("Team: ");
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + ": " + team[i]);
		}
	}

	public static void showMenu() {
		System.out.println("Please pick an option or enter -1 to exit.");
		System.out.println("1) Show team");
		System.out.println("2) Show team member");
		System.out.println("3) Add team member");
		System.out.println("4) delete team member");
		System.out.println("5) delete all member");
	}
	
	public static boolean isValid(int input) {
		if (input >= 0 && input < 5) {
			return true;
		} else {
			System.out.println("Invalid Entry");
			return false;
		}
	}

}
