package fr.aimcvent.bukkit.api.event;

import fr.aimcvent.bukkit.api.BukkitService;

public class BukkitOnDisableEvent extends BukkitEvent {
    public BukkitOnDisableEvent(BukkitService service) {
        super(service);
    }
}
