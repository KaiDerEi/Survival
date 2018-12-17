package Main;

import org.bukkit.plugin.java.JavaPlugin;

import Config.Config;

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
		System.out.println("");
		instance = this;
		Config.createConfig();
		
	}
	

}
