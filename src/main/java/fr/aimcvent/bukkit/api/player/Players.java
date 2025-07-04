package fr.aimcvent.bukkit.api.player;

import fr.aimcvent.player.api.Player;

import java.util.List;

public interface Players {
    List<Player> all();

    Player of(org.bukkit.entity.Player player);
}
