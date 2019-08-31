package myemp;/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

public class Domestic_plan extends Plan {

    double rate=2.60;
    @Override
    double getrate() {
        return rate;
    }
    @Override
    double CalculateBill(int units) {
        return getrate()*units;
    }
}
