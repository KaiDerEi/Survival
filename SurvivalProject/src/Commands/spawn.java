package Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Config.Config;

public class spawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String arg, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("spawn"))
		{
			Player p = (Player)cs;
			
			Config.teleportSpawn(p);
			
		
		}
		
		return false;
	}

}
