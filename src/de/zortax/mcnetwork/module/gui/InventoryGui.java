package de.zortax.mcnetwork.module.gui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class InventoryGui {
	
	
	private Inventory inv;
	private String title;
	private int lines;
	
	public InventoryGui(String title, int lines){
		
		inv = Bukkit.createInventory(null, lines * 9, title);
		
	}
	
	
	public void setOption(int field, GuiItem item){
		
	}
	
	public void setInventory(Inventory inv){
		this.inv = inv;
	}
	
	
	
	
	
	
	
	
	
	public InventoryGui clone(){
		InventoryGui gui = new InventoryGui(title, lines);
		gui.setInventory(this.inv);
		return gui;
	}
	
	
	

}
