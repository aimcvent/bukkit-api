package fr.aimcvent.bukkit.api.command;

import org.bukkit.command.CommandSender;

public interface ArgumentConstraint<T> {
    boolean accept(CommandSender sender, T type);
}
