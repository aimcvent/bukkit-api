package fr.aimcvent.bukkit.api.command;

public interface InputConverter<T> {
    String name();

    T convert(String input);
}
