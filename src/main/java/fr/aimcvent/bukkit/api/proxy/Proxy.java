package fr.aimcvent.bukkit.api.proxy;

import org.bukkit.entity.Player;

import java.util.List;

public interface Proxy {
    boolean isEnable();

    MessageBuilder builder();

    List<PluginMessageListener> of(String channel, String type);

    void register(PluginMessageListener pluginMessageListener);

    void send(Message message);

    void send(Player player, String server);

    void sendToLobby(Player player);

    void sendAllToLobby();
}
