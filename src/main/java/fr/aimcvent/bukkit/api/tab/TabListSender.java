package fr.aimcvent.bukkit.api.tab;

import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.Map;

public interface TabListSender {
    TabListSender header(String header);

    TabListSender footer(String footer);

    void send(Player player);

    void send(Player player, Translation translation);

    void send(Collection<Player> players);

    void send(Map<Player, Translation> playerMap);
}
