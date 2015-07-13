package de.zortax.mcnetwork.module.gui;

import org.bukkit.inventory.ItemStack;

public class GuiItem {

	private ItemStack item;
	private String title;
	private String text;
	
	public GuiItem(ItemStack is, String title, String text){
		this.item = is;
		this.title = title;
		this.text = text;
	}
	
	
	
	
	
	
	public GuiItem createInstance() throws InstantiationException, IllegalAccessException{
		
		Object obj = this;
		GuiItem gi = (GuiItem) obj.getClass().newInstance();
		return gi;
		
		
	}
	
}
