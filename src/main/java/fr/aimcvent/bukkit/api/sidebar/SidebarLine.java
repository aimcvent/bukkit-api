package fr.aimcvent.bukkit.api.sidebar;

import java.util.Optional;
import java.util.UUID;

public interface SidebarLine {
    String key();

    Optional<String> apply(UUID playerId, int index);
}
