package Main;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import Commands.heal;
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
		
		instance = this;
		Config.createConfig();
		
		this.prefix = ChatColor.translateAlternateColorCodes('&', Config.cfg.getString("prefix"));
		
		getCommand("heal").setExecutor(new heal());
		
		Bukkit.broadcastMessage("" + prefix);
		
		
	}
	
	
	

}
