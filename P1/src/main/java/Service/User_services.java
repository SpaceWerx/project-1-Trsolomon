package Service;
import java.sql.SQLException;
import java.util.List;

import DAO.UsersDAO;
import Models.Users;
public class User_services {

	UsersDAO uDAO = new UsersDAO();
	public List<Users> getUsers() throws SQLException {
		List<Users> users = uDAO.getUsers();
		return users;
		
		

	}
	public void Users(Users newUsers) {
		uDAO.insertUsers(newUsers);
		
		
	}
	public List<Users> getusersbyID(int idInput) {
		// TODO Auto-generated method stub
		return null;
	}}

