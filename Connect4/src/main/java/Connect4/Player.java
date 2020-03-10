
package Connect4;


public class Player {
    
    private String user;
    private int winsPvP;
    private int winsAI;
    private int gamesPlayed;
    private int tiesPvP;
    private int tiesAI;
    private boolean isPlayerOne;
    private boolean isPlayerTwo;
    
    public Player(){
        user = "";
        winsPvP = 0;
        winsAI = 0;
        gamesPlayed = 0;
        tiesPvP = 0;
        tiesAI = 0;
        isPlayerOne = false;
        isPlayerTwo = false;
    }
    
    public Player(String u, int pvp, int ai, int gp, int tp, int ta){
        user = u;
        winsPvP = pvp;
        winsAI = ai;
        gamesPlayed = gp;
        tiesPvP = tp;
        tiesAI = ta;
        isPlayerOne = false;
        isPlayerTwo = false;
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

    public int getTiesPvP() {
        return tiesPvP;
    }

    public void setTiesPvP(int tiesPvP) {
        this.tiesPvP = tiesPvP;
    }

    public int getTiesAI() {
        return tiesAI;
    }

    public void setTiesAI(int tiesAI) {
        this.tiesAI = tiesAI;
    }

    public boolean getIsPlayerOne() {
        return isPlayerOne;
    }

    public void setIsPlayerOne(boolean isPlayerOne) {
        this.isPlayerOne = isPlayerOne;
    }

    public boolean getIsPlayerTwo() {
        return isPlayerTwo;
    }

    public void setIsPlayerTwo(boolean isPlayerTwo) {
        this.isPlayerTwo = isPlayerTwo;
    }

    
    
    
}
