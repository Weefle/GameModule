package de.zortax.mcnetwork.module.scoreboard;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class SideBoard {


	
	private Scoreboard board;
	private Objective obj;
	private ArrayList<String> lines;
	private ArrayList<Score> scores;
	
	
	
	public SideBoard(String title){
		board = Bukkit.getScoreboardManager().getNewScoreboard();
		
		lines = new ArrayList<>();
		scores = new ArrayList<>();
		obj = board.registerNewObjective("obj", "dummy");
		obj.setDisplaySlot(DisplaySlot.SIDEBAR);
		obj.setDisplayName(title);
	}
	
	public void addLine(String line){
		lines.add(line);
	}
	
	
	
	public void createBoard(){
		int j = 0;
		for(int i = lines.size(); i >= 0; i --){
			Score tmp = obj.getScore(lines.get(j));
			tmp.setScore(i);
			scores.add(tmp);
			j++;
		}
	}
	
	public void setVisible(boolean vis){
			
		for(Player p : Bukkit.getOnlinePlayers()){
			if(vis){
				p.setScoreboard(board);
			}else{
				p.setScoreboard(null);
			}
				
		}		
	}
	
	public void setVisibleFor(Player p){
		p.setScoreboard(board);
	}
	
	
	
}
