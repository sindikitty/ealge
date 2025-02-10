package com.yourname.eaglercraftcompat;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class EaglercraftCompatPlugin extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getLogger().info("Eaglercraft Compatibility Plugin Enabled!");
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Eaglercraft Compatibility Plugin Disabled!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.getPlayer().sendMessage("Welcome to the server, " + event.getPlayer().getName() + "!");
    }
}
