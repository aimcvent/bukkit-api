package fr.aimcvent.bukkit.api.proxy;

import org.bukkit.entity.Player;

public interface PluginMessageListener {
    String channel();

    String type();

    void execute(Player player, String[] args);
}
