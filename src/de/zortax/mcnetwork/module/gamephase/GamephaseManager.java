package de.zortax.mcnetwork.module.gamephase;

public class GamephaseManager {

	
	Gamephase actual;
	
	public GamephaseManager(){
		actual = Gamephase.LOBBY;
	}
	
	
	public Gamephase getGamephase(){
		return actual;
	}
	
	public void setGamephase(Gamephase gp){
		this.actual = gp;
	}
	
	
}
