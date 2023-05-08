package fr.aimcvent.bukkit.api;

import fr.aimcvent.bukkit.api.message.MessageComponent;
import fr.aimcvent.kernel.api.service.Service;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.util.List;

public interface BukkitService extends Service {
    Plugin plugin();

    MessageComponent messageOf(Player player);

    MessageComponent messageOf(List<Player> players);
}
