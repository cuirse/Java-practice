package practice1;

public class variable {
	public static void main(String[] args) {
        String s = "hello";
        String t = s;
        s = "world";
        System.out.println(t); // t «"hello"ªπ «"world"?
    }
}
