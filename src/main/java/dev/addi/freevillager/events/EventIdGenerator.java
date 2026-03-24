package dev.addi.freevillager.events;

public class EventIdGenerator {

    private long lastTimestamp = -1;
    private int counter = 0;

    public synchronized String nextId() {
        long now = System.currentTimeMillis();

        if (now == lastTimestamp) {
            counter++;
        } else {
            lastTimestamp = now;
            counter = 0;
        }

        return "EVT-" + now + "-" + counter;
    }
}
