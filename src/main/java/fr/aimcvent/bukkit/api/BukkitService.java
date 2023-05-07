package fr.aimcvent.bukkit.api;

import fr.aimcvent.kernel.api.service.Service;
import org.bukkit.plugin.Plugin;

public interface BukkitService extends Service {
    Plugin plugin();
}
