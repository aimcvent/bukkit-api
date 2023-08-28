package fr.aimcvent.bukkit.api.command.constraint;

import fr.aimcvent.bukkit.api.command.ArgumentConstraint;
import org.bukkit.command.CommandSender;

public class RangeConstraint implements ArgumentConstraint<Number> {
    private final Class<? extends Number> type;
    private final Number min;
    private final Number max;


    public RangeConstraint(Class<? extends Number> type, Number min, Number max) {
        this.type = type;
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean accept(CommandSender sender, Number number) {
        if (Byte.class.equals(this.type)) {
            return this.min.byteValue() >= number.byteValue() && this.max.byteValue() <= number.byteValue();
        }
        if (Short.class.equals(this.type)) {
            return this.min.shortValue() >= number.shortValue() && this.max.shortValue() <= number.shortValue();
        }
        if (Integer.class.equals(this.type)) {
            return this.min.intValue() >= number.intValue() && this.max.intValue() <= number.intValue();
        }
        if (Long.class.equals(this.type)) {
            return this.min.longValue() >= number.longValue() && this.max.longValue() <= number.longValue();
        }
        if (Float.class.equals(this.type)) {
            return this.min.floatValue() >= number.floatValue() && this.max.floatValue() <= number.floatValue();
        }
        return this.min.doubleValue() >= number.doubleValue() && this.max.doubleValue() <= number.doubleValue();
    }
}
