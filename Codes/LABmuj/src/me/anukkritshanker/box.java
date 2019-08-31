package me.anukkritshanker;

public class box {
    private float length,height,width;
    box(){
        this.length=this.height=this.width=1;
    }
    box(int length,int height,int width){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    box(int val){
        this.length=this.height=this.width=val;
    }
    box(int length,int width){
        this.length=length;
        this.width=width;
        this.height=1;
    }
    public float area(box obj){
        float area,l,w,h;
        l=obj.length;
        w=obj.width;
        h=obj.height;
        area=2*(l*w+w*h+h*l);
        return area;
    }
    public float vol(box obj){
        return obj.length*obj.width*obj.height;
    }
}
