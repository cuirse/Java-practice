package practice1;

public class array {
	public static void main(String[] args) {
	int[] ns=new int[5];
	ns[0]=68;
	ns[1]=79;
	ns[3]=90;
	ns[4]=98;
	System.out.println(ns[0]);
	
	int[] ns1= {1,100,20,23,23};
	System.out.println(ns1.length);
	
	
	String[] names = {"ABC", "XYZ", "zoo"};
    String s = names[1];
    names[1] = "cat";
    System.out.println(s); // s «"XYZ"ªπ «"cat"?
    System.out.println(names[1]);
	}
}
