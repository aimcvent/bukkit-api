package fr.aimcvent.bukkit.api.command;

public interface ArgumentBuilder {
    ArgumentBuilder name(String name);

    ArgumentBuilder converter(String converter);

    ArgumentBuilder append(ArgumentBuilder... arguments);

    Argument build();
}
