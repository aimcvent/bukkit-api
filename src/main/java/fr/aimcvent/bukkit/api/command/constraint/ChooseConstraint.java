package fr.aimcvent.bukkit.api.command.constraint;

import fr.aimcvent.bukkit.api.command.ArgumentConstraint;
import org.bukkit.command.CommandSender;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ChooseConstraint implements ArgumentConstraint<String> {
    private final Set<String> values = new HashSet<>();

    public ChooseConstraint(String... values) {
        this.values.addAll(Arrays.asList(values));
    }

    @Override
    public boolean accept(CommandSender sender, String type) {
        return this.values.contains(type);
    }
}
