package com.ryanlinux.places.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.ryanlinux.places.core.Main;

public class Place implements CommandExecutor{
	
	private Main plugin;
	public Place(Main plugin) {

		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("place")) {
			if (args.length == 0) {
			
			}
			

		}

		return false;
	}

}
