package me.anukkritshanker;

public class Main {

    public static void main(String[] args) {
	details c1 = new details("HP probook","440","G4");
	graphicscard g1 =new graphicscard("Nvidia","gtx",6,(float) 2.33);
	motherboard m1 =new motherboard(2,3,"220v","Core I7");
	computer pc = new computer(c1,m1,g1, new monitor(720,1200,"120W","IPS"));
		System.out.println(pc.getDs().model);

    }
}
