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
		Users Jim_Smith = new Users(1, "Jim Smith", "Jimbo1!", Roles.employee);
		Users Tom_Jones = new Users (2, "Tom Jones", "Tommy2!", Roles.employee);
		User Lovie_Robinson = new Users (3, "Lovie Robinson", "Lovierich3!", Roles.employee);
		User David_Thompson = new Users (4,"David Thompson", "Davidt4!", Roles.employee);
		User Tilted_Kilt = new Users (5, "Tilted Kilt", "Tkilt5!", Roles.employee);
		Users Hot_Sauce = new Users (6, "Hot Sauce" ,"Toomuchsauce6!" , Roles.employee);
	
		users.add(Hot_Sauce);
		users.add(Tilted_Kilt);
		users.add(Jim_Smith);
		users.add(Tom_Jones);
		users.add(David_Thompson);
		users.add(Lovie_Robinson);
	
	
	}
	
	public List<User> getUsers() { return (List<User>) users; }

}
