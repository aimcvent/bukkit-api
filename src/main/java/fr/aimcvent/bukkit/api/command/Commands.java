package fr.aimcvent.bukkit.api.command;

public interface Commands {
    InputConverter<?> of(String name);
    Commands register(Class<? extends InputConverter<?>> converter);
}
