package dev.addi.freevillager.models;

import java.util.Objects;
import java.util.UUID;

public final class UVID {

    private static final String PREFIX = "FV-VIL-";

    private final UUID base;

    private UVID(UUID base) {
        this.base = Objects.requireNonNull(base, "UUID cannot be null");
    }

    public static UVID generate() {
        return new UVID(UUID.randomUUID());
    }

    public static UVID fromString(String raw) {
        if (raw == null || !raw.startsWith(PREFIX)) {
            throw new IllegalArgumentException("Invalid UVID format");
        }

        String uuidPart = raw.substring(PREFIX.length());
        UUID parsed = UUID.fromString(uuidPart);
        return new UVID(parsed);
    }

    public UUID getBase() {
        return base;
    }

    @Override
    public String toString() {
        return PREFIX + base.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UVID)) return false;
        UVID uvid = (UVID) o;
        return base.equals(uvid.base);
    }

    @Override
    public int hashCode() {
        return  base.hashCode();
    }
}
