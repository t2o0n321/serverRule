package com.t2o0n321.serverRule.serverEvents;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import com.t2o0n321.serverRule.Utils.Utils;

public class serverEvents implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent evnt){
        Player player = evnt.getPlayer();
        Utils tools = new Utils();

        if(player.hasPlayedBefore()){
            String str_to_send = tools.chat("&1"+player.getName()+"&6 joins the server !");
            Bukkit.broadcastMessage(str_to_send);
        }
        else{
            String str_to_send = tools.chat("&dWelcome &1"+player.getName()+"&d to the server !");
            Bukkit.broadcastMessage(str_to_send);
        }
    }
}
