package de.zortax.mcnetwork.module.user;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Player;

import de.zortax.mcnetwork.module.Module;
import de.zortax.mcnetwork.module.data.Language;

public class User{

	private Player player;
	private Language lang;
	private Group group;
	private String name;
	private String coloredname;
	private String prefixname;
	private Module module;
	
	
	public User(Player player, Module module){
		this.module = module;
		this.player = player;
		group = new Group(ChatColor.GREEN, null);
		name = player.getName();
		originalName();
		updateName();
	}
	
	public void originalName(){
		if(getGroup().getPrefix() != null)
			prefixname = ChatColor.translateAlternateColorCodes('&', getGroup().getPrefix() + " &7| &r") + getGroup().getColor() + name;
		else{
			prefixname = getGroup().getColor() + name;
		}
		coloredname = getGroup().getColor() + name;
	}
	
	public void updateName(){
		
		if(!name.equalsIgnoreCase(player.getName())){
			prefixname = ChatColor.GREEN + name;
			coloredname = ChatColor.GREEN + name;
		}
		
		player.setDisplayName(prefixname);
		player.setPlayerListName(prefixname);		
		
		
		
	}
	
	
	public String getPrefixName(){
		return prefixname;
	}
	
	public String getName(){
		return name;
	}
	
	public String getColoredName(){
		return coloredname;
	}
	
	public void setName(String name){
		this.name = name;
		updateName();
	}
	
	
	
	
	
	
	
	public void setLocation(Location loc){
		player.teleport(loc);
		
	}
	
	public Location getLocation(){
		return player.getLocation();
	}
	
	
	public Player getPlayer(){
		return player;
	}
	
	public void sendRawMessage(String msg){
		player.sendMessage(msg);
	}
	
	public void sendMessage(String key){
		player.sendMessage(module.getMessageManager().getMessage(key, this.getLanguage()));
	}
	
	public void sendPrefixedRawMessage(String msg){
		player.sendMessage(module.getMessageManager().getPrefix() + msg);
	}
	
	public void sendPrefixedMessage(String key){
		player.sendMessage(module.getMessageManager().getPrefix() + module.getMessageManager().getMessage(key, this.getLanguage()));
	}
	
	public void setLanguage(Language lang){
		this.lang = lang;
	}
	
	public Language getLanguage(){
		return lang;
	}
	
	public Group getGroup(){
		return group;
	}
	
	
	
}
