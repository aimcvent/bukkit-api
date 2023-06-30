package fr.aimcvent.bukkit.api.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;

public interface Inventory
{
    Player player();

    org.bukkit.inventory.Inventory bukkit();

    void add(int slot, Item item);

    void remove(int slot);

    void update();

    void reload();

    void click(ClickType clickType, int slot);

    void open();
}
