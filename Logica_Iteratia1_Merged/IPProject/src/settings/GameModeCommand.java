package settings;

public class GameModeCommand implements Command{
    private String gameMode = "default";

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public String getGameMode() {
        return gameMode;
    }
}
