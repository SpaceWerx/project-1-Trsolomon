package DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import Utilities.Connectionfactory;

public class RoleDAO {
 public void updatesalary(String roleTile, int newSalary) throws SQLException {
	 try(Connection conn = Connectionfactory.getconnection()){
 }
	 
	 String sql = "update roles set role_salary = ? where role_title = ?";
	 PreparedStatement ps = conn.preparestatement(sql);
	 ps.setInt(1, newSalary);
	 ps.setString(2, roleTitle);
	 ps.executeUpdate();
	 System.out.println(roleTitle + "salary has been updated to:" + newSalary);
 }
 catch (SQLException e) {
	 System.out.println("An error has occured while updating the salary");
	 e.printStackTrace();
	 
	 
}}
