package me.anukkritshanker;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> todo =new LinkedList<String>();
        todo.add("Wake up");
        todo.add("fresh");
        todo.add("Walk");
        todo.add("Bath");
        todo.add("Breakfast");
        todo.add("work1");
        todo.add("Lunch");
        todo.add("work2");
        todo.add("hitea");
        todo.add("work 3");
        todo.add("Dinner");
        todo.add("Sleep");
        printList(todo);
        todo.remove(1);
        printList(todo);
        inorder(todo,"work");
        printList(todo);
        workdone(todo);

    }
    private static void printList(LinkedList<String> ll){
        Iterator<String> ir=ll.iterator();
        while (ir.hasNext()){
            System.out.println("Todo:"+ir.next());
        }
        System.out.println("*****************************");
    }
    private static boolean inorder(LinkedList<String> ll,String work){
        ListIterator<String> ir=ll.listIterator();
        while (ir.hasNext()){
            int com=ir.next().compareTo(work);
            if (com==0){
                System.out.println("Work already exists");
                return false;
            }else if(com > 0){
                ir.previous();
                ir.add(work);
                return true;
            }
        }
        ir.add(work);
        return true;
    }
    private static void workdone(LinkedList<String> ll){
        Scanner sc =new Scanner(System.in);
        ListIterator<String> ir =ll.listIterator();
        boolean check =false;
        boolean next =true;
        if (ll.isEmpty())
            System.out.println("No work to do");
        else {
            System.out.println("Now doing Work :"+ir.next());
            menu();
        }
        while (!check){
            int ch= sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Today's work done");
                    check = true;
                    break;
                case 2:
                    if (!next) {
                        if (ir.hasNext())
                            ir.next();
                        next = true;
                    }
                    if (ir.hasNext())
                        System.out.println("Doing work:" + ir.next());
                    else{
                        System.out.println("All work done");
                         next=false;
                    }break;
                case 3:if (next){
                    if (ir.hasPrevious())
                        ir.previous();
                    next=false;
                }
                    if (ir.hasPrevious())
                    System.out.println("Previous work:"+ir.previous());
                       else {
                        System.out.println("In the starting of list");
                        next=true;
                       }break;
                case 4:menu();
            }
        }
    }
    public static void menu(){
        System.out.println("Options:");
        System.out.println("1.Complete Today's work\n2.Do next work\n3.Goto previous work\n4.Print Menu");
    }
}
