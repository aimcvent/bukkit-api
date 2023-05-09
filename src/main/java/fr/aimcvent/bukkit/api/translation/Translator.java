package fr.aimcvent.bukkit.api.translation;

import fr.aimcvent.kernel.api.translation.Translation;
import org.bukkit.command.CommandSender;

import java.util.Map;

public interface Translator extends fr.aimcvent.kernel.api.translation.Translator {
    Translator add(String key, String value);

    Translator add(String key, fr.aimcvent.kernel.api.translation.Translator value);

    void send(CommandSender sender, Translation translation);

    void broadcast(Map<CommandSender, Translation> map);
}
