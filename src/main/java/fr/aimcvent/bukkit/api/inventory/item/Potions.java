package fr.aimcvent.bukkit.api.inventory.item;

import org.bukkit.potion.PotionType;

public interface Potions
{
    PotionBuilder of(PotionType type);

    PotionBuilder of(PotionType type, int amount);
}
