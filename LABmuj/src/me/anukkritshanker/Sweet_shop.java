package me.anukkritshanker;

/***************************************************************************************
 Developed by:
 Anukkrit Shanker
 Copyrights Reserved
 Topic-Static varibles and methods

 ***************************************************************************************/

public class Sweet_shop {
    int ctr_milk_cake,ctr_barfi,ctr_rasmalai;
    static int total_sweets;

    public Sweet_shop(int ctr_milk_cake, int ctr_barfi, int ctr_rasmalai) {
        this.ctr_milk_cake = ctr_milk_cake;
        this.ctr_barfi = ctr_barfi;
        this.ctr_rasmalai = ctr_rasmalai;

    }
     int total(){
        return (ctr_barfi +ctr_milk_cake+ctr_rasmalai);
    }

    void show_total_sweets(Sweet_shop ob){
        total_sweets=ob.total();
        System.out.println("Total no of sweets in shops are:"+total_sweets);
    }

}
