package fr.aimcvent.bukkit.api.inventory;

public interface ReloadInventory<T extends Inventory> {
    void reload(T inventory);
}
