package DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Models.Users;
import Utilities.Connectionfactory;

public class UsersDAO {
	
	public List<Users> getUsers() throws SQLException {
		try(Connection conn = Connectionfactory.getconnection()){
		
		ResultSet rs = null;
		return null;
		
		String sql = "select * from Users;";
		
		
		Statement s = conn.createStatement();
		
		rs = s.executeQuery(sql);
		
		List<Users> UsersList = new ArrayList<>();
		
		while(rs.next()) {
			Users u = new Users();
					rs.getInt(Users_id);
					rs.getString(f_name);
					rs.getString(l_name);
					rs.getInt(role_id);
					
			UsersList.add(u);
		}
		return UsersList;{
	
		catch(SQLException u) {
			System.out.println("Something went wrong while grabbing the employees");
			e.printstacktrace();
					
			
		
	}}}}

