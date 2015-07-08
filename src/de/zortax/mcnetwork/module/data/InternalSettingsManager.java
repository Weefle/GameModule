package de.zortax.mcnetwork.module.data;

import java.util.ArrayList;

import org.bukkit.Material;

public class InternalSettingsManager {
	
	
	//booleans
	public boolean autojoin;
	public boolean mapreset;
	public boolean blockbreak_ingame;
	public boolean blockbreak_cooldown;
	public boolean blockbreak_deathmatch;
	
	
	public ArrayList<Material> breakable;
	

	public InternalSettingsManager(){
		autojoin = true;
		mapreset = true;
		blockbreak_ingame = false;
		blockbreak_cooldown = false;
		blockbreak_deathmatch = false;
		breakable = new ArrayList<>();
	}
	
	
	
	public void addBlockbreakException(Material mat){
		breakable.add(mat);
	}
	
}
