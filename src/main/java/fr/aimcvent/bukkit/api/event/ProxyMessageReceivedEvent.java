package fr.aimcvent.bukkit.api.event;

import fr.aimcvent.kernel.api.event.Event;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class ProxyMessageReceivedEvent implements Event {
    private final String channel;
    private final Player player;

    private final String[] input;

    public ProxyMessageReceivedEvent(String channel, Player player, String[] input) {
        this.channel = channel;
        this.player = player;
        this.input = input;
    }

    public String channel() {
        return this.channel;
    }

    public Player player() {
        return this.player;
    }

    public String[] input() {
        return Arrays.copyOfRange(this.input, 0, this.input.length);
    }
}
