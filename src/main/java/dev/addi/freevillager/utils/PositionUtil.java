package dev.addi.freevillager.utils;

import dev.addi.freevillager.models.Position;
import org.bukkit.Location;

public class PositionUtil {

    public static Position fromLocation(Location location) {
        return new Position(location.getX(), location.getY(), location.getZ());
    }
}

