package de.zortax.mcnetwork.module;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import de.zortax.mcnetwork.module.data.InternalSettingsManager;
import de.zortax.mcnetwork.module.data.MessageManager;
import de.zortax.mcnetwork.module.gamephase.GamephaseManager;
import de.zortax.mcnetwork.module.listener.ActionListener;
import de.zortax.mcnetwork.module.listener.PlayerListener;
import de.zortax.mcnetwork.module.user.GroupManager;

public class Module extends JavaPlugin {

	GroupManager gm;
	InternalSettingsManager ism;
	MessageManager mm;
	GamephaseManager gpm;
	
	public final GroupManager getGroupManager(){
		return gm;
	}
	
	public final InternalSettingsManager getInternalSettingsManager(){
		return ism;
	}
	
	public final MessageManager getMessageManager(){
		return mm;
	}
	
	public final GamephaseManager getGamephaseManager(){
		return gpm;
	}
	
	
	@Override
	public final void onEnable(){
		Bukkit.getPluginManager().registerEvents(new PlayerListener(this), this);
		Bukkit.getPluginManager().registerEvents(new ActionListener(this), this);
		
		
		setup();
	}
	
	
	
	@Override
	public final void onDisable(){
		
	}
	
	
	
	public void setup(){
		
	}
	
	
	
	
	
	
	
	
}
