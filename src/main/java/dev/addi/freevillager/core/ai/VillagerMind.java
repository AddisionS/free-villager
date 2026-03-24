package dev.addi.freevillager.core.ai;

import dev.addi.freevillager.core.identity.UVID;

import java.util.UUID;

public class VillagerMind {
    private final UVID uvid;
    private final UUID uuid;

    public VillagerMind(UUID uuid){
        this.uvid = UVID.generate();
        this.uuid = uuid;
    }

    public UUID getUuid(){
        return uuid;
    }

    public UVID getUvid(){
        return uvid;
    }


}
