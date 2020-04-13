package de.pasiteur.EscapeFromPasiteur;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandHello implements CommandExecutor {
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
