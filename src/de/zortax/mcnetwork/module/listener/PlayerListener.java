package de.zortax.mcnetwork.module.listener;

import org.bukkit.event.Listener;

import de.zortax.mcnetwork.module.Module;

public class PlayerListener implements Listener {
	
	Module module;
	
	public PlayerListener(Module module){
		this.module = module;
	}
	
}
