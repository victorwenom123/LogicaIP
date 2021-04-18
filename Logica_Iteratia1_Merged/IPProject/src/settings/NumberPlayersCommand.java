package settings;

public class NumberPlayersCommand implements Command{
    private int numberPlayers;

    public NumberPlayersCommand(int nrPlayers) {
        this.numberPlayers = nrPlayers;
    }

    public int getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(int numberPlayers) {
        this.numberPlayers = numberPlayers;
    }
}
