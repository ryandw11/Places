package com.ryanlinux.places.core;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.WorldCreator;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import com.ryanlinux.places.Commands.Place;
import com.ryanlinux.places.events.OnExitEvent;
import com.ryanlinux.places.events.OnJoinEvent;
import com.ryanlinux.places.world.WorldGen;

public class Main extends JavaPlugin {
	public static String Prefix = "Test for now. Add option in config later";

	public final Logger logger = Logger.getLogger("Minecraft");

	public World place;
	public String placeName = "PlaceWorld";

	public File datafile = new File(getDataFolder() + "/data/data.yml");
	public FileConfiguration data = YamlConfiguration.loadConfiguration(datafile);

	public File placesfile = new File(getDataFolder() + "/data/places.yml");
	public FileConfiguration places = YamlConfiguration.loadConfiguration(placesfile);

	@Override
	public void onEnable() {
		logger.info(String.format("[%s] The plugin has been enabled! Version: %s", 
				getDescription().getName(),
				getDescription().getVersion()));
		loadManager();
		registerConfig();
		loadFile();
		loadPlaces();
		getPlaceWorld();
		StartEvents(); //replace this later
	}

	public void StartEvents() {// replace this later
		new OnJoinEvent();
		new OnExitEvent();
	}

	@Override
	public void onDisable() {
		logger.info(String.format("[%s] The plugin has been disabled!, getDescription().getName());
	}

	public void loadManager() {
		getCommand("place").setExecutor(new CMDPlace(this));
	}

	private void registerConfig() {

		getConfig().options().copyDefaults(true);
		saveConfig();
	}

	public void saveFile() {
		try {
			data.save(datafile);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public void savePlaces() {
		try {
			places.save(placesfile);
		} catch (IOException e) {
			e.printStackTrace();

		}
	}

	public void loadFile() {
		if (datafile.exists()) {
			try {
				data.load(datafile);

			} catch (IOException | InvalidConfigurationException e) {

				e.printStackTrace();
			}
		} else {
			try {
				data.save(datafile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void loadPlaces() {
		if (placesfile.exists()) {
			try {
				places.load(placesfile);

			} catch (IOException | InvalidConfigurationException e) {

				e.printStackTrace();
			}
		} else {
			try {
				places.save(placesfile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void getPlaceWorld() {
		Difficulty diff = Difficulty.NORMAL;

		if (Bukkit.getWorld(placeName) == null) {
			logger.info("[Places] World PlaceWorld does not exsit! Creating PlaceWorld!");
			WorldCreator wc = new WorldCreator(placeName);
			wc.generateStructures(false);
			wc.generator(new WorldGen());
			Bukkit.getServer().createWorld(wc);
		}
	}
	
	//gets the prefix of the plugin for easy referance
	public static String getPrefix() {
		return Prefix;
	}

}
