package fr.aimcvent.bukkit.api.command;

public interface Option {
    String name();

    boolean match(String name);
}
