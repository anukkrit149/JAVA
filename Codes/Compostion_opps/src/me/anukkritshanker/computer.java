package me.anukkritshanker;

public class computer {
    details ds;
    motherboard mb;
    graphicscard gc;
    monitor mr;

    public computer(details ds, motherboard mb, graphicscard gc, monitor mr) {
        this.ds = ds;
        this.mb = mb;
        this.gc = gc;
        this.mr = mr;
    }

    public details getDs() {
        return ds;
    }

    public motherboard getMb() {
        return mb;
    }

    public graphicscard getGc() {
        return gc;
    }

    public monitor getMr() {
        return mr;
    }
}
