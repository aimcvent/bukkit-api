package fr.aimcvent.bukkit.api.command.constraint;

import fr.aimcvent.bukkit.api.command.ArgumentConstraint;
import org.bukkit.command.CommandSender;

public class EqualsConstraint implements ArgumentConstraint<Object> {
    private final Object value;

    public EqualsConstraint(Object value) {
        this.value = value;
    }

    @Override
    public boolean accept(CommandSender sender, Object object) {
        return this.value.equals(object);
    }
}
