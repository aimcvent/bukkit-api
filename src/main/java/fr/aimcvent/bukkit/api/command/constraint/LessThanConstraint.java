package fr.aimcvent.bukkit.api.command.constraint;

import fr.aimcvent.bukkit.api.command.ArgumentConstraint;
import org.bukkit.command.CommandSender;

public class LessThanConstraint implements ArgumentConstraint<Number> {

    private final Class<? extends Number> type;
    private final Number value;

    public LessThanConstraint(Class<? extends Number> type, Number value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public boolean accept(CommandSender sender, Number number) {
        if (Byte.class.equals(this.type)) {
            return number.byteValue() < this.value.byteValue();
        }
        if (Short.class.equals(this.type)) {
            return number.shortValue() < this.value.shortValue();
        }
        if (Integer.class.equals(this.type)) {
            return number.intValue() < this.value.intValue();
        }
        if (Long.class.equals(this.type)) {
            return number.longValue() < this.value.longValue();
        }
        if (Float.class.equals(this.type)) {
            return number.floatValue() < this.value.floatValue();
        }
        return number.doubleValue() < this.value.doubleValue();
    }
}
