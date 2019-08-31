package me.anukkritshanker;

public class details {
    String model;
    String serial;
    String name;

    public String getModel() {
        return model;
    }

    public String getSerial() {
        return serial;
    }

    public String getName() {
        return name;
    }

    public details(String model, String serial, String name) {

        this.model = model;
        this.serial = serial;
        this.name = name;
    }
}
