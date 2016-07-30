package com.ryanlinux.places.place;

import com.ryanlinux.places.core.Main;

public class PlaceManager {
	public PlaceManager manager;
	
	private Main plugin;
	public PlaceManager(Main plugin) {
		this.plugin = plugin;
		manager = this;
	}
	
}
