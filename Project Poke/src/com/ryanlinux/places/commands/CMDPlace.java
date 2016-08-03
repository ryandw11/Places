package com.ryanlinux.places.Commands;

//Definging imports
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ryanlinux.places.core.Main;

public class Place implements CommandExecutor {
	private Main plugin;
	public static String Prefix;

	public Place(Main plugin) {

		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {

		Player player = (Player) sender; // Defining the player
		
		if (cmd.getName().equalsIgnoreCase("place")) {
			if (args.length == 0) {

				player.sendMessage(plugin.getPrefix() + "Arguments you can enter");

			}
			else if (args[0].equalsIgnoreCase("go")) {

			}

			else if (args[0].equalsIgnoreCase("restart")) {

			}
			else if (args[0].equalsIgnoreCase("sethome")) {

			}
			else if (args[0].equalsIgnoreCase("ban")) {

			}
			else if (args[0].equalsIgnoreCase("unban")){
				
				
			}
			else{
			
			p.sendMessage(plugin.getPrefix() + "That is not a right sub cmd msg");	
				
			}
			
		}

		return false;
	}

}
