package fr.aimcvent.bukkit.api.inventory;

import fr.aimcvent.kernel.api.translation.Translation;

import java.util.function.Consumer;

public interface PaginationInventoryBuilder {

    PaginationInventoryBuilder paginateItem(Class<? extends PaginateItem> paginateItemClazz);

    PaginationInventoryBuilder reload(Consumer<PaginationInventory> reloadConsumer);

    PaginationInventoryBuilder translation(Translation translation);

    PaginationInventory build();
}
