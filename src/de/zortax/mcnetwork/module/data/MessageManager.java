package de.zortax.mcnetwork.module.data;

import java.util.HashMap;

public class MessageManager {
	
	HashMap<Language, HashMap<String, String>> maps;
	
	
	public MessageManager(){
		maps = new HashMap<>();
	}
	
	public void loadMessages(){
		
		HashMap<String, String> demsg = new HashMap<>();
		
		
		//TODO: LOAD MESSAGES FROM DATABASE
	
		
		maps.put(Language.DE, demsg);
		
		//...
		
		
	}
	
	
	
	
	
	public String getMessage(String key, Language lang){	
		return maps.get(lang).get(key);
	}
	
	
	public void setMessage(String key, Language lang, String msg){
	}
	
	
	public String getPrefix(){
		return maps.get(Language.DE).get("perefix");
	}

}
