package fr.aimcvent.bukkit.api.command;

import java.util.List;

public interface InputConverter<T> {
    String name();

    T convert(String input);

    default List<String> onComplete(String input) {
        return null;
    };
}
