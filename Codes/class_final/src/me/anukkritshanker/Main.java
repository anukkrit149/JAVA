package me.anukkritshanker;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       /*int ar[] = new int[10];
        int size;
        System.out.println("Enter size of array:");
        size = sc.nextInt();
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++)
            ar[i] = sc.nextInt();
        //sorting array

        sort(ar);
        // Arrays.sort(ar);
        System.out.println("Sorted array:");
         for (int i=0;i<size;i++)
             System.out.print(ar[i]+"\t");

    }

    public static int[] sort(int array[])
    {   int temp;
        boolean flag=true;
        while(flag){
            flag=false;
        for (int i=0;i<array.length-1;i++)
        {
            if (array[i]<array[i+1]){
                temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
                flag=true;
            }
        }
        }
        return array;*/
       int n;String st;
       list games = new list();
        System.out.println("enter no. of games");
        n=sc.nextInt();
        System.out.println("enter game names:");
        st=sc.nextLine();
        for (int i=0;i<n;i++)
        {   st=sc.nextLine();
            games.additems(st);
        }
        games.showall();
        System.out.println("search");
        st=sc.nextLine();
        games.finditem(st);

    }
}
