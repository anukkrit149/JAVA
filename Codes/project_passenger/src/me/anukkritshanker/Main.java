package me.anukkritshanker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("WELCOME TO TRAIN BERTH MANAGER");
        passenger pa = new passenger();
        passenger.details.entry();
        passenger.seat.berth();
        Scanner sc=new Scanner(System.in);
        int ch=0;
        while(ch!=1)
        {
            System.out.println("Proceeding to payment.Press 0 to revert back and 1 to continue");
            ch=sc.nextInt();
            if(ch==0)
            {
                System.out.println("Do you wish to opt out or re-enter details? 1 to opt out and 0 to re-enter details.");
                ch=sc.nextInt();
                if(ch==1)
                {
                    System.out.println("THANKS");
                    break;
                }
                else
                {
                    passenger.details.entry();
                    passenger.seat.berth();
                }
            }
            else if(ch==1)
            {
                if(pa.res==1)
                    passenger.payprice.reserve();
                if(pa.res==2)
                    passenger.payprice.tatkal();
                passenger.payprice.print();
                break;
            }
        }
    }
}
