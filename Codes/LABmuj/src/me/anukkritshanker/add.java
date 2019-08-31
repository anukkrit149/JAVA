package me.anukkritshanker;

public class add{
    private float a,b,c,d;

    public add(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    int abc(int a){
        System.out.println();
       return a;
    }
    float ad(add obj){

        return a+b+c+d;
    }
    float ad(int a,int b){
        return a+b+this.a+this.b;
    }
    float ad(int a, int b,int c){
        return a+b+c+this.a+this.b+this.c;
    }
    float ad(int a,int b,int c,int d){
        return a+b+c+d+this.a+this.b+this.c+this.d;
    }
}
