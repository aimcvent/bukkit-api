package fr.aimcvent.bukkit.api.event;

import fr.aimcvent.bukkit.api.BukkitService;

public class BukkitOnEnableEvent extends BukkitEvent {
    public BukkitOnEnableEvent(BukkitService service) {
        super(service);
    }
}
