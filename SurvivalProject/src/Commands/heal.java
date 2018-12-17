package Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import Main.Main;

public class heal implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender cmds, Command cmd, String label, String[] args) {
		
		if(cmds instanceof Player) {
			Player p = (Player) cmds;
			if(args.length == 0) {
				p.setHealth(20);
				p.setFoodLevel(20);
				p.sendMessage("§cYou were healed§7!");
				
		
			}else if(args.length == 1) {
				Player target = Bukkit.getPlayer(args[0]);
				if(target != null) {
					target.setHealth(20);
					target.setFoodLevel(20);
					target.sendMessage(Main.getInstance().prefix + "§cYou were healed§7!");
					if(target == p) {
						
						
					}else {
						target.sendMessage(Main.getInstance().prefix + "§cYou were healed§7!");
						p.sendMessage(Main.getInstance().prefix + "§cYou healed " + target.getName() + " §7!");
					}
				}else {
					p.sendMessage(Main.getInstance().prefix + "§cThe player is not online§7!");
				}
			}

		}

		return false;
	}

	
	
}
