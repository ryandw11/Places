package com.ryanlinux.places.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ryanlinux.places.core.Main;

public class PlaceAdmin {
	private Main plugin;

	public PlaceAdmin(Main pl) {

		plugin = pl;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	Player player  = (Player) sender;
		
		if (cmd.getName().equalsIgnoreCase("placeadmin")) {
			if (args.length == 0) {

				return true;
			}

			return true;
		}
		return false;
	}
}
