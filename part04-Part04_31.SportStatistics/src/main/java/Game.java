/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toddd
 */
public class Game {
    
    private String homeTeam;
    private String awayTeam;
    private int homeGoals;
    private int awayGoals;
    
    public Game(String homeTeam, String awayTeam, int homeGoals, int awayGoals) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }
    
    public String getHomeOrAway(String team) {
       if (team.equals(this.homeTeam)) {
           return "home"; 
       } else if (team.equals(this.awayTeam)) {
           return "away";
       } else {
           return "did not play";
       }
    }
    
    public boolean getResult(String homeOrAway) {
       if (homeOrAway.equals("home") && this.homeGoals > this.awayGoals) {
           return true;
       } else if (homeOrAway.equals("away") && this.awayGoals > this.homeGoals) {
           return true;
       }
       return false;
    }
    
    
}
