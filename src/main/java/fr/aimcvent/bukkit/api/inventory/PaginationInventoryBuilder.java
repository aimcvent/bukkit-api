package fr.aimcvent.bukkit.api.inventory;

import fr.aimcvent.kernel.api.translation.Translation;

public interface PaginationInventoryBuilder {

    PaginationInventoryBuilder paginateItem(Class<? extends PaginateItem> paginateItemClazz);

    PaginationInventoryBuilder reload(ReloadInventory<PaginationInventory> reloadConsumer);

    PaginationInventoryBuilder translation(Translation translation);

    PaginationInventory build();
}
