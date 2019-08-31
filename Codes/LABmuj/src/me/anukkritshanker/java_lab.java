/***************************************************************************************
 Developed by:
 Anukkrit Shanker
 Copyrights Reserved
 Topic-Constructor chaining

 ***************************************************************************************/

package me.anukkritshanker;


public class java_lab {
    int Total_stud,absent,teacher;

    public java_lab(int total_stud, int absent, int teacher) {
        Total_stud = total_stud;
        this.absent = absent;
        this.teacher = teacher;
    }

    public java_lab(int teacher) {
        this(60,5,2);
        this.teacher = teacher;
    }
    void show(){
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "java_lab{" +
                "Total_stud=" + Total_stud +
                ", absent=" + absent +
                ", teacher=" + teacher +
                '}';
    }

}
