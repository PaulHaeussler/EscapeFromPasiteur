package de.pasiteur.EscapeFromPasiteur;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        //Fired when the server enables the plugin
        this.getCommand("hello").setExecutor(new CommandHello());
    }

    @Override
    public void onDisable(){
        //Fired when the server enables the plugin
    }


}
