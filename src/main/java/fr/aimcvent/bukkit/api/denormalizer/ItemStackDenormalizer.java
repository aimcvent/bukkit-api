package fr.aimcvent.bukkit.api.denormalizer;

import fr.aimcvent.bukkit.api.BukkitService;
import fr.aimcvent.bukkit.api.inventory.item.ItemBuilder;
import fr.aimcvent.kernel.api.configuration.Denormalizer;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import java.util.List;
import java.util.Map;

public class ItemStackDenormalizer implements Denormalizer<ItemStack, Object> {

    private final BukkitService bukkitService;

    private ItemStackDenormalizer(BukkitService bukkitService) {
        this.bukkitService = bukkitService;
    }

    @Override
    public ItemStack denormalize(Object value) {
        if (value instanceof String) {
            return new ItemStack(Material.valueOf(value.toString().toUpperCase()));
        }
        assert value instanceof Map : "The value of ItemStackDenormalizer must be a String or a Map.";
        final Map<String, Object> map = (Map<String, Object>) value;

        final ItemBuilder builder = this.bukkitService.items().of(
            Material.valueOf(map.get("type").toString().toUpperCase()),
            ((Number) map.getOrDefault("count", 1)).intValue()
        );

        if (map.containsKey("name")) {
            builder.name(map.get("name").toString());
        }

        builder.durability(((Number) map.getOrDefault("durability", 0)).intValue());

        if (map.containsKey("lore")) {
            builder.lore((List<String>) map.get("lore"));
        }

        if (map.containsKey("enchants")) {
            final List<Object> enchants = (List<Object>) map.get("enchants");
            for (final Object enchant : enchants) {
                if (enchant instanceof String) {
                    builder.enchant(Enchantment.getByName(enchant.toString().toUpperCase()), 1);
                    continue;
                }
                assert enchant instanceof Map : "The enchant value must be a String or a Map";
                final Map<String, Object> enchantMap = (Map<String, Object>) enchant;
                builder.enchant(
                    Enchantment.getByName(enchantMap.get("type").toString().toUpperCase()),
                    ((Number) enchantMap.getOrDefault("level", 1)).intValue()
                );
            }
        }

        if ((boolean) map.getOrDefault("clear_effects", false)) {
            builder.clearEffects();
        }

        if (map.containsKey("effects")) {
            final List<Object> effects = (List<Object>) map.get("effects");
            for (final Object effect : effects) {
                if (effect instanceof String) {
                    builder.effect(PotionEffectType.getByName(effect.toString().toUpperCase()), 1200);
                    continue;
                }
                assert effect instanceof Map : "The effect value must be a String or a Map.";
                final Map<String, Object> effectMap = (Map<String, Object>) effect;
                builder.effect(
                    PotionEffectType.getByName(effectMap.get("type").toString().toUpperCase()),
                    ((Number) effectMap.getOrDefault("duration", 60)).intValue() * 20,
                    ((Number) effectMap.getOrDefault("level", 1)).intValue(),
                    (boolean) effectMap.getOrDefault("ambient", true),
                    (boolean) effectMap.getOrDefault("particles", true)
                );
            }
        }

        if (map.containsKey("flags")) {
            builder.flags(
                ((List<String>) map.get("flags"))
                    .stream()
                    .map(flag -> ItemFlag.valueOf(flag.toUpperCase()))
                    .toArray(ItemFlag[]::new)
            );
        }

        if (map.containsKey("owner")) {
            builder.owner(map.get("owner").toString());
        }

        if (map.containsKey("texture")) {
            builder.textureHead(map.get("texture").toString());
        }

        if ((boolean) map.getOrDefault("unbreakable", false)) {
            builder.unbreakable();
        }

        return builder.build();
    }
}
