package fr.aimcvent.bukkit.api.proxy;

import org.bukkit.entity.Player;

public interface Message {
    String channel();

    Player player();

    String[] output();
}
