package Config;

import java.io.File;
import java.io.IOException;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;


public class Config {
	
	private static File folder = new File("plugins/Survival");
	
	private static File file = new File("plugins/Survival/config.yml");
	
	private static File file2 = new File("plugins/Survival/locations.yml");
	
	public static YamlConfiguration cfg = YamlConfiguration.loadConfiguration(file);
	public static YamlConfiguration locs = YamlConfiguration.loadConfiguration(file2);
	

	
	
	
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
	
	public static void saveLocs()
	{
		try {
			locs.save(file2);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void teleportSpawn(Player p)
	{
		 Location loc = new Location((World) locs.get("Spawn.world"), (double) locs.get("Spawn.x"), (double)  locs.get("Spawn.y"), (double)  locs.get("Spawn.z"), (float)  locs.get("Spawn.yaw"), (float) locs.get("Spawn.pitch"));
		p.teleport(loc);
	}
	
	
	public static void createLocations() 
	{
		if(!file2.exists())
		{
			try
			{
				file2.createNewFile();
				
				saveLocs();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		saveLocs();

	}
	
	public static void setSpawn(double x, double y, double z, float pitch, float yaw, World world)
	{

				locs.set("Spawn.x", x);
				locs.set("Spawn.y", y);
				locs.set("Spawn.z", z);
				locs.set("Spawn.pitch", pitch);
				locs.set("Spawn.yaw", yaw);
				locs.set("Spawn.world", world);
				
				
				
				saveLocs();
				
	}
	
	public static void createConfig()
	{
		
		if(!folder.exists())
		{
			folder.mkdir();
		}
		
		if(!file.exists())
		{
			try {
				file.createNewFile();
				
				cfg.set("prefix", "&aSurvival &8»&r");
				
				saveConfig();

			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		saveConfig();
	}
	


}
