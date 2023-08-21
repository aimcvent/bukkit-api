package fr.aimcvent.bukkit.api.proxy;

import org.bukkit.entity.Player;

public interface Proxy {
    boolean isEnable();

    MessageBuilder builder();

    void send(Message message);

    void send(Player player, String server);

    void sendToLobby(Player player);
}
