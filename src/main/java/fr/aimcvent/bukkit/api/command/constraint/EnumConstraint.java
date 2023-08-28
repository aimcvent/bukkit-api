package fr.aimcvent.bukkit.api.command.constraint;

import fr.aimcvent.bukkit.api.command.ArgumentConstraint;
import org.bukkit.command.CommandSender;

public class EnumConstraint implements ArgumentConstraint<String> {
    private final Class<? extends Enum<?>> enumClazz;

    public EnumConstraint(Class<? extends Enum<?>> enumClazz) {
        this.enumClazz = enumClazz;
    }

    @Override
    public boolean accept(CommandSender sender, String type) {
        for (Enum<?> value : this.enumClazz.getEnumConstants()) {
            if (value.name().equalsIgnoreCase(type)) {
                return true;
            }
        }
        return false;
    }
}
