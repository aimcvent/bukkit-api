package fr.aimcvent.bukkit.api.inventory;

import java.util.function.Consumer;

public interface InventoryBuilder {

    InventoryBuilder title(String title);

    InventoryBuilder lines(int lines);

    InventoryBuilder reload(Consumer<Inventory> reloadConsumer);

    Inventory build();
}
