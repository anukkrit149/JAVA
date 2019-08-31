package myemp;/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

abstract class Plan {
 int rate;
 abstract double getrate();
 abstract double CalculateBill(int units);
}
