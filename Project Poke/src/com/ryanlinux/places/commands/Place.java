package com.ryanlinux.places.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import com.ryanlinux.places.core.Main;

public class Place {
	private Main plugin;

	public Place(Main pl) {

		plugin = pl;
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("place")) {
			if (args.length == 0) {

				return true;
			}

			return true;
		}

		return false;
	}

}
