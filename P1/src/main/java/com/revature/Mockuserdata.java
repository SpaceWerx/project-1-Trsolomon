package com.revature;

import java.util.ArrayList;
import java.util.List;

import javax.management.relation.Role;

import org.eclipse.jetty.server.Authentication.User;

import Models.Roles;

public class Mockuserdata<Users> {
	private final List<Users> users = new ArrayList<>();
	public void Mockuserdata() {
		int ID;
		String Username;
		String Password;
		User Jim_Smith = new User (ID:1, Username: "Jim Smith", Password: "Jimbo1!", Roles.employee);
		User Tom_Jones = new User (ID:2, Username: "Tom Jones", Password: "Tommy2!", Roles.employee);
		User Lovie_Robinson = new User (ID:3 Username: "Lovie Robinson", Password: "Lovierich3!", Roles.employee);
		User David_Thompson = new User (ID:4 Username: "David Thompson", Password: "Davidt4!", Roles.employee);
		User Tilted_Kilt = new User (ID: 5 Username: "Tilted Kilt", Password: "Tkilt5!", Roles.employee);
		User Hot_Sauce = new User (ID: 6, Username: "Hot Sauce" , Password: "Toomuchsauce6!" , Roles.employee);
	
		users.add(Hot_Sauce);
		users.add(Tilted_Kilt);
		users.add(Jim_Smith);
		users.add(Tom_Jones);
		users.add(David_Thompson);
		users.add(Lovie_Robinson);
	
	
	}
	
	public List<User> getUsers() { return (List<User>) users; }

}
