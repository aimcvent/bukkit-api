package fr.aimcvent.bukkit.api.sidebar;

import org.bukkit.entity.Player;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface Sidebars {
    List<Sidebar> all();

    Optional<Sidebar> of(Player player);

    List<String> currentKeys();

    Optional<SidebarLine> of(String key);

    Set<Integer> indexOf(String key);

    Sidebars register(SidebarLine line);

    void apply(Map<Integer, String> lineMap);

    void update(String key);

    void reload();

    void clear();

    Sidebar create(Player player, String title);

    void destroy(Player player);
}
