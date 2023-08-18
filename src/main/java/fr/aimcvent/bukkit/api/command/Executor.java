package fr.aimcvent.bukkit.api.command;

import org.bukkit.command.CommandSender;

public interface Executor {
    void configuration(ConfigurationBuilder configuration);

    boolean execute(CommandSender sender, Input input);
}
