package me.anukkritshanker;

public class motherboard {
    int ramslots;
    int clockspeed;
    String power;

    public motherboard(int ramslots, int clockspeed, String power, String chipset) {
        this.ramslots = ramslots;
        this.clockspeed = clockspeed;
        this.power = power;
        this.chipset = chipset;
    }

    String chipset;

    public int getRamslots() {
        return ramslots;
    }

    public int getClockspeed() {
        return clockspeed;
    }

    public String getPower() {
        return power;
    }

    public String getChipset() {
        return chipset;
    }
}
