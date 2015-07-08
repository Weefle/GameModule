package de.zortax.mcnetwork.module.user;

import java.util.ArrayList;

public class UserManager {
	
	private ArrayList<User> users;
	
	public UserManager(){
		users = new ArrayList<>();
	}
	
	public void addUser(User u){
		users.add(u);
	}
	
	public void removeUser(User u){
		users.remove(u);
	}
	
	public void broadcastRawMessage(String msg){
		for(User c : users){
			c.sendRawMessage(msg);
		}
	}
	
	

}
