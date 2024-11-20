package fr.aimcvent.bukkit.api.entity;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface EntityBuilder {

    EntityBuilder owner(Player player);

    EntityBuilder name(String name);

    EntityBuilder location(Location location);

    EntityBuilder interaction(InteractionEntity interaction);

    Entity build();
}
