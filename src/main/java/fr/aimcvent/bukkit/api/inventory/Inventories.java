package fr.aimcvent.bukkit.api.inventory;

import fr.aimcvent.bukkit.api.exception.PageNotFoundException;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface Inventories
{
    Optional<Inventory> of(org.bukkit.inventory.Inventory inventory);

    InventoryBuilder builderOf(Player player);

    PaginationInventoryBuilder paginationBuilderOf(Player player);

    void open(Player player, Inventory inventory);

    void open(Player player, PaginationInventory inventory, int page) throws PageNotFoundException;

    void close(org.bukkit.inventory.Inventory inventory);

    Item itemOf(ItemStack itemStack);

    Item itemOf(ItemStack itemStack, BiConsumer<Inventory, ClickType> clickConsumer);

    Item itemOf(Player player, ItemStack itemStack, BiFunction<Inventory, ClickType, Inventory> inventoryFunction);
}
