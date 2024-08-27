package fr.aimcvent.bukkit.api.denormalizer;

import fr.aimcvent.kernel.api.configuration.Denormalizer;
import org.bukkit.Material;

public class MaterialDenormalizer implements Denormalizer<Material, String> {
    @Override
    public Material denormalize(String value) {
        return Material.valueOf(value.toUpperCase());
    }
}
