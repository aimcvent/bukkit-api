package fr.aimcvent.bukkit.api.entity;

import org.bukkit.Location;
import org.bukkit.entity.Player;

import java.util.Optional;
import java.util.UUID;

public interface Entity {
    UUID id();

    UUID ownerId();

    Optional<Player> owner();

    String name();

    Location location();

    InteractionEntity interaction();

    boolean spawned();

    int entityId();

    void spawn(Player player);

    void destroy(Player player);
}
