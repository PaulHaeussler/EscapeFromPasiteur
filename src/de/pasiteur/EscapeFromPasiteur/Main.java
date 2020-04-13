package de.pasiteur.EscapeFromPasiteur;

import org.bukkit.ChatColor;
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
        if(command.getName().equalsIgnoreCase("hello")) {
            if(sender instanceof Player) {
                // player
                Player player = (Player) sender;
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&1H&2a&3v&6e &7F&2u&1n"));
                return true;
            } else {
                // console
                sender.sendMessage("Hey console");
            }
        }
        return false;
    }
}
