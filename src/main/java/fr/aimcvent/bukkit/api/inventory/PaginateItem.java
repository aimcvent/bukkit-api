package fr.aimcvent.bukkit.api.inventory;

import org.bukkit.inventory.Inventory;

public interface PaginateItem extends Item {
    int slot(Inventory inventory);
}
