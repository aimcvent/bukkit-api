package fr.aimcvent.bukkit.api.command;

import java.util.List;

public interface Argument {
    String name();

    String converter();

    List<ArgumentConstraint<?>> contraints();

    List<Argument> children();
}
