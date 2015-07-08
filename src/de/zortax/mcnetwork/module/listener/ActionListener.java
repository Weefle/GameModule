package de.zortax.mcnetwork.module.listener;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import de.zortax.mcnetwork.module.Module;
import de.zortax.mcnetwork.module.gamephase.Gamephase;

public class ActionListener implements Listener {

	Module module;
	
	public ActionListener(Module module){
		this.module = module;
	}
	
	
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent event){
		if(module.getGamephaseManager().getGamephase() == Gamephase.LOBBY){
			event.setCancelled(true);
		}else if(module.getGamephaseManager().getGamephase() == Gamephase.INGAME){
			if(module.getInternalSettingsManager().blockbreak_ingame == false){
				for(Material c : module.getInternalSettingsManager().breakable){
					if(event.getBlock().getType() == c){
						event.setCancelled(false);
						return;
					}
				}
				event.setCancelled(true);
			}
		}else if(module.getGamephaseManager().getGamephase() == Gamephase.COOLDOWN){
			if(module.getInternalSettingsManager().blockbreak_cooldown == false){
				for(Material c : module.getInternalSettingsManager().breakable){
					if(event.getBlock().getType() == c){
						event.setCancelled(false);
						return;
					}
				}
				event.setCancelled(true);
			}
		}else if(module.getGamephaseManager().getGamephase() == Gamephase.DEATHMATCH){
			if(module.getInternalSettingsManager().blockbreak_deathmatch == false){
				for(Material c : module.getInternalSettingsManager().breakable){
					if(event.getBlock().getType() == c){
						event.setCancelled(false);
						return;
					}
				}
				event.setCancelled(true);
			}
		}
	}
	
	
}
