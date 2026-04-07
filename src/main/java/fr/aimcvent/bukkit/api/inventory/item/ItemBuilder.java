package fr.aimcvent.bukkit.api.inventory.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffectType;

import java.util.List;
import java.util.function.Consumer;

public interface ItemBuilder
{
    ItemBuilder name(String name);

    ItemBuilder amount(int amount);

    ItemBuilder durability(int durability);

    ItemBuilder lore(String... lore);

    ItemBuilder lore(List<String> lore);

    ItemBuilder enchant(Enchantment enchantment, int level);

    ItemBuilder clearEffects();

    ItemBuilder effect(PotionEffectType type, int duration);

    ItemBuilder effect(PotionEffectType type, int duration, int level);

    ItemBuilder effect(PotionEffectType type, int duration, int level, boolean ambient, boolean particles);

    ItemBuilder flags(ItemFlag... itemFlags);

    ItemBuilder owner(String name);

    ItemBuilder textureHead(String texture);

    ItemBuilder unbreakable();

    <T extends ItemMeta> ItemBuilder apply(Consumer<T> consumer);

    ItemBuilder canPlaceOn(String material);

    ItemBuilder canPlaceOn(Material material);

    ItemBuilder canDestroy(String material);

    ItemBuilder canDestroy(Material material);

    ItemStack build();

    ItemBuilder clone();
}
