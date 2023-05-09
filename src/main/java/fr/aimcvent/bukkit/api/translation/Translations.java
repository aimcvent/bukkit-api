package fr.aimcvent.bukkit.api.translation;


import fr.aimcvent.kernel.api.service.Service;

public interface Translations {
    Translations addParameter(String key, String value);

    Translations addParameter(String key, fr.aimcvent.kernel.api.translation.Translator translator);

    Translator of(Service service, String key);
}
