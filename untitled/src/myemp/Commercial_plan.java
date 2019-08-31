package myemp;/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

public class Commercial_plan extends Plan{
    double rate=5;
    @Override
    double getrate() {
        return rate;
    }
    @Override
    double CalculateBill(int units) {
        return getrate()*units;
    }
}
