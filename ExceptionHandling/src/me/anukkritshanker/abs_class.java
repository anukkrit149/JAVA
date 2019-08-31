package me.anukkritshanker;


abstract class abs_class {
    int a,b,c;


    public abs_class() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public abs_class(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int mul(){
        return a*b*c;
    }

    int add(){
       return a+b+c;
    }
    //no body of abstract method
    abstract int retval();

}
