package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Config.Config;

public class setspawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String arg, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("setspawn"))
		{
			Player p = (Player)cs;
			
			if(p.hasPermission("survival.setspawn") || p.hasPermission("survival.*"))
			{
				Config.setSpawn(p.getLocation().getX(), p.getLocation().getY(), p.getLocation().getZ(), p.getLocation().getPitch(), p.getLocation().getYaw(), p.getWorld());
			}
			
			
		
		}
		
		return false;
	}

}
