package com.t2o0n321.serverRule;

import org.bukkit.plugin.java.JavaPlugin;
import com.t2o0n321.serverRule.Utils.Utils;
import com.t2o0n321.serverRule.serverEvents.serverEvents;
import com.t2o0n321.serverRule.serverCommands.servercommands;

import java.util.ArrayList;
import java.util.List;

public class main extends JavaPlugin {

    @Override
    public void onEnable(){
        Utils tools = new Utils();
        servercommands command = new servercommands();

        // Basic when server launch
        // Send Msg when plugin load
        getServer().getConsoleSender().sendMessage(tools.onloadMsg());

        // Register events
        getServer().getPluginManager().registerEvents(new serverEvents(),this);

        // Commands
        List<String> commandList = new ArrayList<String>();
        commandList.add("tpt");
        for(int i = 0 ; i < commandList.size() ; i++) {
            getCommand(commandList.get(i)).setExecutor(command);
        }
    }

    @Override
    public void onDisable(){
        Utils tools = new Utils();
        // Send Msg when plugin disable
        getServer().getConsoleSender().sendMessage(tools.disableMsg());

    }
}
