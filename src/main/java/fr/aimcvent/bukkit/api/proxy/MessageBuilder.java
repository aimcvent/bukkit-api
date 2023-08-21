package fr.aimcvent.bukkit.api.proxy;

import org.bukkit.entity.Player;

public interface MessageBuilder {
    MessageBuilder channel(String channel);

    MessageBuilder player(Player player);

    MessageBuilder next(String data);

    Message build();
}
