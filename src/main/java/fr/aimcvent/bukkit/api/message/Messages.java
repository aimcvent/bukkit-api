package fr.aimcvent.bukkit.api.message;

import org.bukkit.entity.Player;

import java.util.List;

public interface Messages {
    MessageComponent of(Player player);

    MessageComponent of(List<Player> players);
}
