package fr.aimcvent.bukkit.api.denormalizer;

import fr.aimcvent.kernel.api.configuration.Denormalizer;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import java.util.Map;

public class LocationDenormalizer implements Denormalizer<Location, Map<String, Object>> {
    @Override
    public Location denormalize(Map<String, Object> value) {
        return new Location(
            value.containsKey("world")
                ? Bukkit.getWorld(value.get("world").toString())
                : Bukkit.getWorlds().get(0),
            ((Number) value.getOrDefault("x", 0)).doubleValue(),
            ((Number) value.getOrDefault("y", 0)).doubleValue(),
            ((Number) value.getOrDefault("z", 0)).doubleValue(),
            ((Number) value.getOrDefault("yaw", 0)).floatValue(),
            ((Number) value.getOrDefault("pitch", 0)).floatValue()
        );
    }
}
