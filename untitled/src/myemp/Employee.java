package myemp;
/* Project by:
    Anukkrit Shanker
    Copyrights Reserved */

abstract class Employee {
   String Empid;
   String name;
   double salary;



    public Employee() {
        Empid = "793zxc";
        this.name ="ac";
        this.salary = 0;
    }

    public Employee(String empid, String name, double salary) {
        Empid = empid;
        this.name = name;
        this.salary = salary;
    }
}
