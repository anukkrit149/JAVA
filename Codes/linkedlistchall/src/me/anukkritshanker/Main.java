package me.anukkritshanker;

import java.util.*;

public class Main {
    private static List<album> albumArrayList =new ArrayList<album>();
    public static void main(String[] args) {
	album al;
        al = new album("sorry","jb");
        al.addsong("wdym",4.27);
	 al.addsong("bay",3.46);
	 al.addsong("wtf",5.40);
	 albumArrayList.add(al);
	 al =new album("in name","martin");
	 al.addsong("In them",3.29);
	 al.addsong("game",4.38);
	 al.addsong("animal",3.23);
	 albumArrayList.add(al);
        List<song> playlist =new Vector<song>();
        albumArrayList.get(0).addtoplaylist("wdym",playlist);
        albumArrayList.get(0).addtoplaylist("bay",playlist);
        albumArrayList.get(1).addtoplaylist("game",playlist);
        albumArrayList.get(1).addtoplaylist("animal",playlist);
        albumArrayList.get(0).addtoplaylist("wtf",playlist);
        play(playlist);
    }
    private static void play(List<song> playlist)
    {
        Scanner sc=new Scanner(System.in);
        ListIterator<song> ir =playlist.listIterator();
        boolean check =false;
        boolean next =true;
        if (playlist.isEmpty()){
            System.out.println("No songs in playlist");
            return;
        }
        else {
        System.out.println("Now playing "+ir.next().toString());
        menu();
        }
        while (!check){
            int ch= sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Quit");
                    check = true;
                    break;
                case 2:
                    if (!next) {
                        if (ir.hasNext())
                            ir.next();
                        next = true;
                    }
                    if (ir.hasNext())
                        System.out.println("Now playing " + ir.next().toString());
                    else{
                        System.out.println("End of playlist");
                        next=false;
                    }break;
                case 3:if (next){
                    if (ir.hasPrevious())
                        ir.previous();
                    next=false;
                }
                    if (ir.hasPrevious())
                        System.out.println("Previous "+ir.previous().toString());
                    else {
                        System.out.println("In the starting of playlist");
                        next=true;
                    }break;
                case 4:menu();break;
                case 5:printlist(playlist);break;
                case 6:if (playlist.size()>0) {
                    ir.remove();
                    if (ir.hasNext())
                        System.out.println("Now playing:"+ir.next().toString());
                    else if (ir.hasPrevious())
                        System.out.println("Now playing:"+ir.previous().toString());
                    printlist(playlist);
                }
            }
        }
    }
    private static void menu(){
        System.out.println("Menu\n1.Quit\n2.Next song\n3.Previous Song\n4.Print menu\n5.Print playlist\n6.Remove song");
    }
    private static void printlist(List<song> ppl)
    {
        System.out.println("Playlist:");
        for (int i=0;i<ppl.size();i++)
            System.out.println(ppl.get(i).toString());
    }
}
