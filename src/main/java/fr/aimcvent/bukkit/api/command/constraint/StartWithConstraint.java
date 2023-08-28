package fr.aimcvent.bukkit.api.command.constraint;

import fr.aimcvent.bukkit.api.command.ArgumentConstraint;
import org.bukkit.command.CommandSender;

public class StartWithConstraint implements ArgumentConstraint<String> {
    private final String startsWith;

    public StartWithConstraint(String startsWith) {
        this.startsWith = startsWith;
    }

    @Override
    public boolean accept(CommandSender sender, String type) {
        return type.startsWith(this.startsWith);
    }
}
