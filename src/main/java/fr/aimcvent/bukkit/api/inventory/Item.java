package fr.aimcvent.bukkit.api.inventory;

import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public interface Item
{
    ItemStack icon();

    void click(Inventory inventory, ClickType clickType);
}
