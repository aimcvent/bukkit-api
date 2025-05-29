package fr.aimcvent.bukkit.api.event.player;

import fr.aimcvent.kernel.api.event.CancellableEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;

import java.util.Optional;

public class PlayerInteractEvent implements CancellableEvent {
    private final Player player;
    private final Entity entity;
    private final Action action;

    private boolean cancelled;

    public PlayerInteractEvent(Player player, Entity entity, Action action) {
        this.player = player;
        this.entity = entity;
        this.action = action;
    }

    @Override
    public boolean cancelled() {
        return this.cancelled;
    }

    @Override
    public void cancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Player player() {
        return this.player;
    }

    public Optional<Entity> entity() {
        return Optional.ofNullable(this.entity);
    }

    public Action action() {
        return this.action;
    }

    public enum Action {
        LEFT_CLICK(true),
        SHIFT_LEFT_CLICK(true),
        RIGHT_CLICK(false),
        SHIFT_RIGHT_CLICK(false);

        private final boolean leftClick;

        Action(boolean leftClick) {
            this.leftClick = leftClick;
        }

        public boolean leftClick() {
            return this.leftClick;
        }
    }
}
