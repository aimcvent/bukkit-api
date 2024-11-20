package fr.aimcvent.bukkit.api.hotbar;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface Item {
    ItemStack icon();

    default long updateTime() {
        return 0L;
    }

    void interact(Player player);
}
