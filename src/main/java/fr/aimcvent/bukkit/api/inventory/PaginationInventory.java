package fr.aimcvent.bukkit.api.inventory;

import fr.aimcvent.bukkit.api.exception.PageNotFoundException;

public interface PaginationInventory extends Inventory {
    void next();

    void previous();

    Inventory addPage(String title, int lines);

    void open(int page) throws PageNotFoundException;

    void changePage(int page) throws PageNotFoundException;

    Page page();
}
