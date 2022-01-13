
package com;

public class CompanyLockersProject {

	public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		Optionlist.printWelcomeScreen("Company lockers private limited", "BHAGYA");
		
		DriveOptions.handleWelcomeScreenInput();
	}

	
}