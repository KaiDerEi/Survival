package Main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import Commands.heal;
import Commands.setspawn;
import Commands.spawn;
import Config.Config;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin {
	
	public String prefix;
	
	private static Main instance;
	
	public Main()
	{
		instance = this;
	}
	
	public static Main getInstance()
	{
		return instance;
	}
	
	
	public void onEnable()
	{
		//Instance [Ganz Oben]
		instance = this;
		//Instance [Ganz Oben]
		
		//Config [Danach]
		Config.createConfig();
		Config.createLocations();
		this.prefix = ChatColor.translateAlternateColorCodes('&', Config.cfg.getString("prefix"));
		//Config [Danach]
		
		//Commands [Nach Config]
		getCommand("heal").setExecutor(new heal());
		getCommand("setspawn").setExecutor(new setspawn());
		getCommand("spawn").setExecutor(new spawn());
		//Commands [Nach Config]
		
		
		Bukkit.broadcastMessage("" + prefix);
		
		
	}
	
	
	

}
