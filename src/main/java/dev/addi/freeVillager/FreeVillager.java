package dev.addi.freeVillager;

import org.bukkit.plugin.java.JavaPlugin;

public final class FreeVillager extends JavaPlugin {

    private static FreeVillager plugin;

    public static FreeVillager getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
