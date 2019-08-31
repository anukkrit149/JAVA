package me.anukkritshanker;

import java.util.ArrayList;

public class list {
    ArrayList<String> items = new ArrayList<String>();
    public void additems(String item)
    {
        items.add(item);
    }
    public void showall(){
        System.out.println("total="+items.size());
        for (int i=0;i<items.size();i++){
            System.out.println((i+1)+"."+items.get(i));
        }
    }
    public int finditem(String search){
       // boolean check =items.contains(search);
        int check=items.indexOf(search);
        if (check>=0){
            System.out.println("found"+items.get(check));
            return check;
        }
        else{
            System.out.println("Not Found");
            return -1;
        }

    }
    public void modify(String item){
        int pos =finditem(item);
        if (pos>=0)
            items.remove(pos);
        else
            System.out.println("not found");
    }
    public void remove(String item){
        int pos =finditem(item);
        if (pos>=0)
            items.set(pos,item);
        else
            System.out.println("not found");
    }
}
