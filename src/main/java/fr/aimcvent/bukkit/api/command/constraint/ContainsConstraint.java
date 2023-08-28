package fr.aimcvent.bukkit.api.command.constraint;

import fr.aimcvent.bukkit.api.command.ArgumentConstraint;
import org.bukkit.command.CommandSender;

public class ContainsConstraint implements ArgumentConstraint<String> {
    private final String contains;

    public ContainsConstraint(String contains) {
        this.contains = contains;
    }

    @Override
    public boolean accept(CommandSender sender, String type) {
        return type.contains(this.contains);
    }
}
