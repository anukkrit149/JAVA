package me.anukkritshanker;

import java.util.List;

public class developer implements Isave {
    private String name;
    private int points;
    private int time;
    private String computer;

    public developer(String name, int points, int time) {
        this.name = name;
        this.points = points;
        this.time = time;
        this.computer="Apple Macbook";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "developer{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", time=" + time +
                ", computer='" + computer + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        return null;
    }

    @Override
    public void read(List<String> list) {

    }
}
