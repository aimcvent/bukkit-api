package fr.aimcvent.bukkit.api.inventory;

public interface InventoryBuilder {

    InventoryBuilder title(String title);

    InventoryBuilder lines(int lines);

    InventoryBuilder reload(ReloadInventory<Inventory> reloadConsumer);

    InventoryBuilder updateTime(long second);

    Inventory build();
}
