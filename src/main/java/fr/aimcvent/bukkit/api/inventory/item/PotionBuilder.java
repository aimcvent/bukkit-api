package fr.aimcvent.bukkit.api.inventory.item;

public interface PotionBuilder extends ItemBuilder
{
    PotionBuilder level(int level);

    PotionBuilder splash();
}
