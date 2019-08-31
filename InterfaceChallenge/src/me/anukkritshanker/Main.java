package me.anukkritshanker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Isave anu =new gamer("Anukkrit",503993,2);
        gamer anukkrit = new gamer("Anukkrit",100000,2);
        System.out.println("Gamer"+anukkrit.toString());
        saveobj(anukkrit);
        anukkrit.setPoints(503993);
        anukkrit.setComputer("HP Omen");
        saveobj(anukkrit);
        //anu.setComputer("HP Omen");
        System.out.println("Gamer:"+anukkrit.toString());
        //System.out.println(anu.toString());
        loadobj(anukkrit);
        //System.out.println(anukkrit.toString());
       // anu.clone(anukkrit);
        if (anu.equals(anukkrit))
            System.out.println(anukkrit.toString());
    }
    public static ArrayList<String> readvalues(){
        ArrayList<String> values =new ArrayList<String>();
        Scanner sc= new Scanner(System.in);
        boolean quit = false;
        int index =0;
        System.out.println("Enter Choice\n1.Enter String\n2.quit");
        while (!quit){
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter string");
                    sc.nextLine();
                    String st=sc.nextLine();
                    values.add(index,st);
                    index++;
                    break;
                case 2:quit=true;
                break;
            }
        }
        return values;
    }
    public static void saveobj(Isave obj){
        for (int i=0;i<obj.write().size();i++){
            System.out.println("Saving"+obj.write().get(i));
        }
    }
    public static void loadobj(Isave obj){
        List<String> val = readvalues();
        obj.read(val);
    }
}
