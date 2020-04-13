package de.pasiteur.EscapeFromPasiteur;

import de.pasiteur.EscapeFromPasiteur.commands.CommandProvider;
import de.pasiteur.EscapeFromPasiteur.commands.RegistrationCommand;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Main class for the application
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
        for (RegistrationCommand command: CommandProvider.getRegistrationCommands()) {
            this.getCommand(command.getCommandName()).setExecutor(command.getCommandExecutor());
        }
    }

    @Override
    public void onDisable(){
        //Fired when the server enables the plugin
    }


}
