package fr.aimcvent.bukkit.api.inventory;

import org.bukkit.entity.Player;

import java.util.Optional;

public interface Inventories
{
    Optional<Inventory> of(org.bukkit.inventory.Inventory inventory);

    InventoryBuilder builderOf(Player player);

    PaginationInventoryBuilder paginationBuilderOf(Player player);

    void open(Player player, Inventory inventory);

    void close(org.bukkit.inventory.Inventory inventory);
}
