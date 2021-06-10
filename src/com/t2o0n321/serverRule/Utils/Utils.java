package com.t2o0n321.serverRule.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class Utils {

    private String plugin_onload_msg = "&a[serverRule]: Plugin enabled ...";
    private String plugin_ondisable_msg = "&c[serverRule]: Plugin disabled ...";

    public String chat(String str){
        return ChatColor.translateAlternateColorCodes('&',str);
    }

    public boolean isOnline(String player){
        if(Bukkit.getPlayer(player) == null) return false;
        return true;
    }

    public String onloadMsg(){
        return chat(this.plugin_onload_msg);
    }

    public String disableMsg(){ return chat(this.plugin_ondisable_msg); }
}
