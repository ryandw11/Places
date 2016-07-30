package com.ryanlinux.places.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ryanlinux.places.core.Main;

public class PlaceAdmin implements CommandExecutor{
	
	private Main plugin;
	public PlaceAdmin(Main plugin) {
		this.plugin = plugin;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	Player player  = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("placeadmin")) {
			if (args.length == 0) {
				
			}


		}
		return false;
	}
}
