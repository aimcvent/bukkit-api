package fr.aimcvent.bukkit.api.event;

import fr.aimcvent.bukkit.api.BukkitService;

public class BukkitOnLoadEvent extends BukkitEvent {
    public BukkitOnLoadEvent(BukkitService service) {
        super(service);
    }
}
