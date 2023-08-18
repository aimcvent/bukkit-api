package fr.aimcvent.bukkit.api.command;

public interface OptionBuilder {
    OptionBuilder name(String name);

    OptionBuilder aliases(String... aliases);

    Option build();
}
