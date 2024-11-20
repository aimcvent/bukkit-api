package fr.aimcvent.bukkit.api.hotbar;

import org.bukkit.entity.Player;

import java.util.Optional;

public interface Hotbars {
    Optional<Item> of(Player player, int slot);

    void register(int slot, Item item);

    void register(Player player, int slot, Item item);

    void unregister(int slot);

    void unregister(Player player, int slot);

    void update();

    void update(Player player);

    void clear();

    void clear(Player player);

    void clearAll();
}
