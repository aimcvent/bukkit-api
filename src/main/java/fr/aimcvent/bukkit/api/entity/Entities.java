package fr.aimcvent.bukkit.api.entity;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface Entities {

    List<Entity> all();

    List<Entity> allBy(Player player);

    Optional<Entity> of(UUID id);

    <T extends EntityBuilder> T builderOf(Class<T> clazz);

    void register(Entity entity);

    void unregister(Entity entity);
}
