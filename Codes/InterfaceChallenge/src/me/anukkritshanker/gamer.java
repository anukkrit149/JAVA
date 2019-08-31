package me.anukkritshanker;

import java.util.ArrayList;
import java.util.List;

public class gamer implements Isave {
    private String name;
    private Integer points;
    private Integer time;
    private String computer;

    public gamer(String name, int points, int time) {
        this.name = name;
        this.points = points;
        this.time = time;
        this.computer ="HP Probook";
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
        return "gamer{" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", time=" + time +
                ", computer='" + computer + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> val = new ArrayList<String>();
        val.add(0,this.name);
        val.add(1,""+this.points);
        val.add(2,""+this.time);
        val.add(3,this.computer);

        return val;
    }

    @Override
    public void read(List<String> list) {
        if (list != null && list.size()>0){
            this.name=list.get(0);
            this.points=Integer.parseInt(list.get(1));
            this.time=Integer.parseInt(list.get(2));
            this.computer=list.get(3);

        }

    }
}
