package fr.aimcvent.bukkit.api.inventory;

import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.entity.Player;

public interface PaginateItemContext {
    PaginationInventory inventory();

    Player player();

    boolean next();

    Translation translation();
}
