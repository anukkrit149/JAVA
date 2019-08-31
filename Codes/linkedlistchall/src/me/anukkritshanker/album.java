package me.anukkritshanker;

import java.util.ArrayList;
import java.util.List;

public class album {
    private String name;
    private String artist;
    private ArrayList<song> sg;

    public album(String name,String artist) {
        this.artist =artist;
        this.name = name;
        this.sg = new ArrayList<song>();
    }
    public boolean addsong(String tit,double duration){
        if (findsong(tit)==null){
            this.sg.add(new song(tit,duration));
            return true;
        }
        return false;
    }

    private song findsong(String tit){
        for (song findsong : this.sg) {
            if (findsong.getTitle().equals(tit))
                return findsong;
        }
        return null;
    }
    public boolean addtoplaylist(String title, List<song> playlist){
        song findsong = findsong(title);
        if (findsong != null){
            playlist.add(findsong);
            return true;
        }
        System.out.println("Song doesn't exist");
        return false;
    }

}
