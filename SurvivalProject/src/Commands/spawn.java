package Commands;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Config.Config;
import Main.Main;

public class spawn implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender cs, Command cmd, String arg, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("spawn"))
		{
			Player p = (Player)cs;
			
			Config.teleportSpawn(p);
			p.sendMessage(Main.getInstance().prefix + "§aYou were teleported to the spawn§7!");
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 1f, 1f);
			
		
		}
		
		return false;
	}

}
