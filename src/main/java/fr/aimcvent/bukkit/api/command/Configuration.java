package fr.aimcvent.bukkit.api.command;

import java.util.List;

public interface Configuration {
    String name();

    String description();

    String usage();

    String permission();

    String permissionMessage();

    String[] aliases();

    List<Argument> arguments();

    List<Option> options();
}
