
package Connect4;


public class Player {
    
    private String user;
    private int winsPvP;
    private int winsAI;
    private int gamesPlayed;
    
    public Player(){
        user = "";
        winsPvP = 0;
        winsAI = 0;
        gamesPlayed = 0;
    }
    
    public Player(String u, int pvp, int ai, int gp){
        user = u;
        winsPvP = pvp;
        winsAI = ai;
        gamesPlayed = gp;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getWinsPvP() {
        return winsPvP;
    }

    public void setWinsPvP(int winsPvP) {
        this.winsPvP = winsPvP;
    }

    public int getWinsAI() {
        return winsAI;
    }

    public void setWinsAI(int winsAI) {
        this.winsAI = winsAI;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    
    
    
}
