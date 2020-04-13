package de.pasiteur.EscapeFromPasiteur;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
    }

    @Override
    public void onDisable(){
        //Fired when the server enables the plugin
    }

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("hello")) {
            if(sender instanceof Player) {
                // player
                Player player = (Player) sender;
                player.chat("Hello World");
            } else {
                // console
            }
        }
        return false;
    }
}
