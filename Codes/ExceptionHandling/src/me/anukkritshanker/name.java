package me.anukkritshanker;
/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;


public class name {
    static String namest;
    int genvalue(){
        int fre[]= new int[26];
        int sum=0;
        for (int i = 0; i <namest.charAt(i) ; i++)
            fre[toString().charAt(i)-'a']++;
        for (int i = 0; i <fre.length ; i++)
            sum+=(fre[i]*fre[i]);
        return sum;
    }
    // must include abstract method in sub class with proper definition
    @Override
    int retval() {
        return 0;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc =new Scanner(System.in);
        try {
            System.out.println("Enter No of name");
            int n=sc.nextInt();
            name ob[] = new name[n];
            System.out.println("Enter first name");
            for (int i = 0; i <n ; i++) {
                ob[i].namest= inp.readLine();
//                ob[i].namest= sc.nextLine();
//                ob[i].namest= sc.next();
                System.out.println("Enter next name pls");
            }
            for (int i = 0; i <n ; i++)
                System.out.println("Name:"+ob[i].namest+"\t FREQUENCY:"+ob[i].genvalue());
        }
        catch (NullPointerException ogh){
            System.out.println("Null pointer ex"+ogh);
        }
        catch (InputMismatchException in_ex){
            System.out.println("Wrong Value entered:"+in_ex);
        }


    }

}
