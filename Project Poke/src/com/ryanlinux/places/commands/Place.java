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

	public Place(Main pl) {

		plugin = pl;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		Player player = (Player) sender; // Defining the player
		if (cmd.getName().equalsIgnoreCase("place")) {
			if (args.length == 0) {

				player.sendMessage(Main.GetPrefix() + "Arguments you can enter");

			}
			else if (args[0].equalsIgnoreCase("go")) {

			}

			else if (args[0].equalsIgnoreCase("restart")) {

			}
			else if (args[0].equalsIgnoreCase("lock")) {

			}
			else if (args[0].equalsIgnoreCase("unlock")) {

			}
			else if (args[0].equalsIgnoreCase("sethome")) {

			}
			else if (args[0].equalsIgnoreCase("ban")) {

			}
			else if (args[0].equalsIgnoreCase("unban")){
				
				
			}
			else{
				
				
			}
			
		}

		return false;
	}

}
