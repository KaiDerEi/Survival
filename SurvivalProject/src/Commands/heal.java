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
			if(p.hasPermission("survival.heal") || p.hasPermission("survival.*")) {
				if(args.length == 0) {
					p.setHealth(20);
					p.setFoodLevel(20);
					p.sendMessage(Main.getInstance().prefix + "§cYou were healed§7!");
					
			
				}else if(args.length == 1) {
					Player target = Bukkit.getPlayer(args[0]);
					if(target != null) {
						target.setHealth(20);
						target.setFoodLevel(20);
						target.sendMessage(Main.getInstance().prefix + "§aYou were healed§7!");
						if(target == p) {
							
							
						}else {
							target.sendMessage(Main.getInstance().prefix + "§aYou were healed§7!");
							p.sendMessage(Main.getInstance().prefix + "§aYou healed " + target.getName() + " §7!");
						}
					}else {
						p.sendMessage(Main.getInstance().prefix + "§aThe player is not online§7!");
					}
				}else if(args.length > 1) {
					p.sendMessage(Main.getInstance().prefix + "§aPlease type §7/§cheal§7!");
				}	
			}else {
				p.sendMessage(Main.getInstance().prefix + "§aYou have no Permission to do this§7!");
			}

		}

		return false;
	}

	
	
}
