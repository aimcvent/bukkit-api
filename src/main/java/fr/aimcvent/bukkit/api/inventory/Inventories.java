package fr.aimcvent.bukkit.api.inventory;

import fr.aimcvent.bukkit.api.exception.PageNotFoundException;
import org.bukkit.entity.Player;

import java.util.Optional;

public interface Inventories
{
    Optional<Inventory> of(org.bukkit.inventory.Inventory inventory);

    InventoryBuilder builderOf(Player player);

    PaginationInventoryBuilder paginationBuilderOf(Player player);

    void open(Player player, Inventory inventory);

    void open(Player player, PaginationInventory inventory, int page) throws PageNotFoundException;

    void close(org.bukkit.inventory.Inventory inventory);
}
