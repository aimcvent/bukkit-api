package fr.aimcvent.bukkit.api.event;

import fr.aimcvent.bukkit.api.BukkitService;
import fr.aimcvent.kernel.api.event.Event;

public class BukkitEvent implements Event {
    private final BukkitService service;

    protected BukkitEvent(BukkitService service) {
        this.service = service;
    }

    public BukkitService service() {
        return this.service;
    }
}
