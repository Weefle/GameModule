package de.zortax.mcnetwork.module.user;

import java.util.ArrayList;

import org.bukkit.ChatColor;

public class Group {

	private ChatColor groupcolor;
	private String prefix;
	private ArrayList<String> permissions;
	
	public Group(ChatColor groupcolor, String prefix){
		this.groupcolor = groupcolor;
		this.prefix = prefix;
		permissions = new ArrayList<>();
	}
	
	public String getPrefix(){
		return prefix;
		
	}
	
	public ChatColor getColor(){
		return groupcolor;
	}
	
	public boolean hasPermission(String perm){
		for(String c : permissions){
			if(c.equalsIgnoreCase(perm)){
				return true;
			}
		}
		
		return false;
	}
	
	
	public void addPermission(String perm){
		permissions.add(perm);
	}
	
	
}
