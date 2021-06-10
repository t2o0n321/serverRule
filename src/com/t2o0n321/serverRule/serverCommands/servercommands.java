package com.t2o0n321.serverRule.serverCommands;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import com.t2o0n321.serverRule.Utils.Utils;

import java.util.logging.Logger;

public class servercommands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String args[]){
        Utils tools = new Utils();
        Player player = (Player)sender;

        if(!(sender instanceof Player)){
            Logger logger = Bukkit.getLogger();
            logger.info(tools.chat("[serverRule]: &cOnly players can use commands !"));
            return true;
        }
        // tpt
        if(cmd.getName().equalsIgnoreCase("tpt")){
            if(args.length != 1){
                player.sendMessage(tools.chat("/tpt <player>"));
                return true;
            }
            else{
                String p2Name = args[0];
                // tp to target if target online
                if(tools.isOnline(p2Name)){
                    Player p2 = Bukkit.getPlayer(p2Name);
                    Location p2Loc = p2.getLocation();
                    player.teleport(p2Loc);
                }
                else{
                    player.sendMessage(tools.chat("&c"+args[0]+" is offline !"));
                }
            }
        }
        return true;
    }
}
