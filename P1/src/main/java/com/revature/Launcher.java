package com.revature;

import java.awt.Menu;
import java.sql.Connection;
import java.sql.SQLException;

import org.eclipse.jetty.server.ConnectionFactory;

import Utilities.Connectionfactory;

public class Launcher {
public static void main(String[] args) throws SQLException {
	
 try(Connection conn = Connectionfactory.getConnection()) {
 	System.out.println("connection successful");
 
}	catch(SQLException e) {
	System.out.println("connection failed");
	e.printStackTrace();
}
Menu m = new Menu();
m.displaymenu();
}}
