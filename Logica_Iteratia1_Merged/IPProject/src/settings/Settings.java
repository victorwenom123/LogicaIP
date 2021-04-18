package settings;

import java.util.ArrayList;
import java.util.List;

public class Settings {
    private Command backCommand = new BackCommand();
    private Command exitCommand = new ExitCommand();
    private Command gameModeCommand = new GameModeCommand();
    private Command numberPlayersCommand = new NumberPlayersCommand(3);

    public Settings() {

    }

    public void display() {

        String command = "back";

        if(command.equals("back")) {
            ((BackCommand) backCommand).back();
        }
    }

}
