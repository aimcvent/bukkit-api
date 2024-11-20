package fr.aimcvent.bukkit.api.title;

import fr.aimcvent.bukkit.api.translation.Translator;
import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.entity.Player;

import java.util.Collection;
import java.util.Map;

public interface TitleSender {
    TitleSender title(String title);

    TitleSender title(Translator title);

    TitleSender subtitle(String subtitle);

    TitleSender subtitle(Translator subtitle);

    TitleSender fadeIn(int fadeIn);

    TitleSender fadeOut(int fadeOut);

    TitleSender appear(int appear);

    void send(Player player);

    void send(Player player, Translation translation);

    void broadcast();

    void broadcast(Collection<Player> players);

    void broadcast(Map<Player, Translation> translationMap);
}
