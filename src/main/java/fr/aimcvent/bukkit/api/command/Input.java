package fr.aimcvent.bukkit.api.command;

public interface Input {
    boolean hasArgument(String name);

    <T> T argumentOf(String name);

    boolean hasOption(String name);
}
