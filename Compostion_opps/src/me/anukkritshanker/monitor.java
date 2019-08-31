package me.anukkritshanker;

public class monitor {
    int height;
    int wid;
    String power;
    String dis;

    public monitor(int height, int wid, String power, String dis) {
        this.height = height;
        this.wid = wid;
        this.power = power;
        this.dis = dis;
    }

    public int getHeight() {
        return height;
    }

    public int getWid() {
        return wid;
    }

    public String getPower() {
        return power;
    }

    public String getDis() {
        return dis;
    }
}
