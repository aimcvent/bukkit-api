package fr.aimcvent.bukkit.api.sidebar;

public interface Sidebar {
    void update(String key);

    void reload();

    void clear();
}
