package me.anukkritshanker;

public class graphicscard {
    String com;
    String model;
    int mem;
    float clockspeed;

    public String getCom() {
        return com;
    }

    public String getModel() {
        return model;
    }

    public int getMem() {
        return mem;
    }

    public float getClockspeed() {
        return clockspeed;
    }

    public graphicscard(String com, String model, int mem, float clockspeed) {

        this.com = com;
        this.model = model;
        this.mem = mem;
        this.clockspeed = clockspeed;
    }
}
