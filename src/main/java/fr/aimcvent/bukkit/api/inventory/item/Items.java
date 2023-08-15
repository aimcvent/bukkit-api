package fr.aimcvent.bukkit.api.inventory.item;

import org.bukkit.Material;
import org.bukkit.configuration.ConfigurationSection;

public interface Items
{
    ItemBuilder of(Material material);

    ItemBuilder of(Material material, int amount);

    ItemBuilder of(Material material, int amount, int damage);

    ItemBuilder of(ConfigurationSection section);
}
