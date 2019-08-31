package myemp;/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

import java.util.Arrays;

public class password {
    int x,y;
     password(int _x,int _y){

        x=_x;
        y=_y;
    }

    public static void main(String[] args) {

//        int arr[] = new int[10];
        char[] carr = new char[10];

        for (int i = 0; i <10 ; i++)
            carr[i]='A';
//        System.out.println(carr);
        String str = new String(carr);
        System.out.println(str);
//        password ob = new password();
            //        arr[i]=i;
//        System.out.println(Arrays.toString(arr));


//        Scanner sc = new Scanner(System.in);
//        String pass;
//        int count=0;
//        System.out.println("enter your password");
//        pass=sc.nextLine();
//        if (pass.length()<10){
//            System.out.println("pass invalid");
//            return;
//        }
//        for (int i = 0; i <pass.length() ; i++) {
//            char c= pass.charAt(i);
//            if ('0' <= c && c <= '9')
//                count++;
//        }
//        if (count<2){
//            System.out.println("pass invalid");
//            return;
//        }
//        System.out.println("password valid"+pass);
    }

}
