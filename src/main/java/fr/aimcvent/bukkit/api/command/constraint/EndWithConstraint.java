package fr.aimcvent.bukkit.api.command.constraint;

import fr.aimcvent.bukkit.api.command.ArgumentConstraint;
import org.bukkit.command.CommandSender;

public class EndWithConstraint implements ArgumentConstraint<String> {
    private final String endsWith;

    public EndWithConstraint(String endsWith) {
        this.endsWith = endsWith;
    }

    @Override
    public boolean accept(CommandSender sender, String type) {
        return type.endsWith(this.endsWith);
    }
}
