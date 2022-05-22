package com.revature;

import java.awt.Menu;
import java.sql.Connection;
import java.sql.SQLException;

import org.eclipse.jetty.server.ConnectionFactory;

public class Launcher {
public static void main(String[] args) throws SQLException {
	
 try(Connection conn = ConnectionFactory.getConnection()) {
 }	System.out.println("connection successful");
 
}	catch(SQLException e) {
	System.out.println("connection failed");
	e.printStackTrace();
}
Menu menu = new Menu();
menu.displaymenu();
}
