package Service;
import java.util.List;

import Models.Users;
public class User_services {

	UsersDAO uDAO = new UsersDAO();
	public List<Users> getUsers() {
		List<Users> users = uDAO.getUsers();
		return.users;
		
		public void Users (Users newUsers) {
			uDAO.insertUsers(newUsers);
			
			
		}

	}}

