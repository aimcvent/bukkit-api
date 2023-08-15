package fr.aimcvent.bukkit.api.inventory.item;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;

import java.util.List;

public interface ItemBuilder
{
    ItemBuilder name(String name);

    ItemBuilder amount(int amount);

    ItemBuilder durability(int durability);

    ItemBuilder lore(String... lore);

    ItemBuilder lore(List<String> lore);

    ItemBuilder enchant(Enchantment enchantment, int level);

    ItemBuilder unbreakable();

    ItemStack build();

    ItemBuilder clone();
}
