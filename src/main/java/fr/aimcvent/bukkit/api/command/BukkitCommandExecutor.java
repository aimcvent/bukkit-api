package fr.aimcvent.bukkit.api.command;

import org.bukkit.command.CommandExecutor;

public interface BukkitCommandExecutor extends CommandExecutor {
    String name();

    default String description() {
        return null;
    }

    default String usage() {
        return null;
    }

    default String permission() {
        return null;
    }

    default String permissionMessage() {
        return null;
    }

    default String[] aliases() {
        return new String[0];
    }
}
