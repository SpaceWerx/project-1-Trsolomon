package Models;

import java.util.List;
import java.util.Scanner;

import Service.Role_Services;
import Service.User_services;

public class Menu {
	User_services us = new User_services();
	Role_Services rs = new Role_Services();
	
	public void displaymenu() {
		boolean displaymenu = true;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to the WE LOVE MONEY Employee Management System");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		while(displaymenu) {
			System.out.println("Hello There -> get greeted");
			System.out.println("Users -> Show all Users");
			System.out.println("UsersById -> get Users with a certin ID ");
			System.out.println("UsersByTitle -> get Users with a certain Title");
			System.out.println("Add -> add a new User");
			System.out.println("Exit -> exit the application");
			
			String input = scan.nextLine();
			
			switch (input) {
			
			case "hi": {
				System.out.println("Hello There");
				System.out.println();
				System.out.println();
				System.out.println();
				
				break; 
				
				case "employees": {
				
			}
			
			}
		}
		
		
	}
}
	
