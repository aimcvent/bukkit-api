package fr.aimcvent.bukkit.api.sidebar;

import java.util.Optional;
import java.util.UUID;

public interface SidebarLine {
    String key();

    default long updateTick() {
        return 0L;
    }

    Optional<String> apply(UUID playerId, int index);
}
