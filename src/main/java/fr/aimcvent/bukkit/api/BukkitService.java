package fr.aimcvent.bukkit.api;

import fr.aimcvent.bukkit.api.inventory.Inventories;
import fr.aimcvent.bukkit.api.inventory.item.Items;
import fr.aimcvent.bukkit.api.inventory.item.Potions;
import fr.aimcvent.bukkit.api.message.Messages;
import fr.aimcvent.bukkit.api.translation.Translations;
import fr.aimcvent.kernel.api.service.Service;
import org.bukkit.plugin.Plugin;

public interface BukkitService extends Service {
    Plugin plugin();

    Translations translations();

    Messages messages();

    Inventories inventories();

    Items items();

    Potions potions();
}
