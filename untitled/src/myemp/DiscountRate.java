package myemp;/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

public class DiscountRate {
    static double serviceDiscountgold,serviceDiscountPlatinum,serviceDiscountSilver,productDiscountGold,productDiscountPlatinum,productDiscountSilver;

    static {
        serviceDiscountgold=0.2;
        serviceDiscountPlatinum=0.15;
        serviceDiscountSilver=0.1;
        productDiscountGold=0.1;
        productDiscountPlatinum=productDiscountSilver=0.1;
    }
    static double getServiceDiscount(String type){
        if (type.equals("gold"))
            return serviceDiscountgold;
        if (type.equals("silver"))
            return serviceDiscountSilver;
        if (type.equals("platinum"))
            return serviceDiscountPlatinum;
        return 0;
    }
    static double getProductDiscount(String type){
        return 0.1;
    }
}
