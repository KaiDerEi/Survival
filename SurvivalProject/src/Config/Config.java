package Config;

import java.io.File;
import java.io.IOException;

import org.bukkit.configuration.file.YamlConfiguration;

import Main.Main;
import net.md_5.bungee.api.ChatColor;

public class Config {
	
	private static File file = new File("plugins/Survival/config.yml");
	
	private static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	
	
	
	public static void saveConfig()
	{
		try {
			cfg.save(file);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	public static void createConfig()
	{
		if(file.exists())
		{
			file.mkdir();
		}
		
		if(!file.exists())
		{
			try {
				file.createNewFile();
				
				cfg.set("prefix", "&aSurvival ");
				
				
				saveConfig();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	public void translateConfig()
	{
		Main.getInstance().prefix = ChatColor.translateAlternateColorCodes('&', cfg.getString("prefix"));
	}

}
