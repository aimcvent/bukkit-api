package fr.aimcvent.bukkit.api.command.constraint;

import fr.aimcvent.bukkit.api.command.ArgumentConstraint;
import org.bukkit.command.CommandSender;

public class RegexConstraint implements ArgumentConstraint<String> {
    private final String regex;

    public RegexConstraint(String regex) {
        this.regex = regex;
    }

    @Override
    public boolean accept(CommandSender sender, String value) {
        return value.matches(this.regex);
    }
}
