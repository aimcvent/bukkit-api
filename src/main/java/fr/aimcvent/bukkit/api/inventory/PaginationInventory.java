package fr.aimcvent.bukkit.api.inventory;

public interface PaginationInventory extends Inventory {
    void next();

    void previous();

    Inventory addPage(String title, int lines);
}
