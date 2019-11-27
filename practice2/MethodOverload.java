package practice2;



public class MethodOverload {
    public static void main(String[] args) {
        String s = "Test string";
        int n1 = s.indexOf('T');
        int n2 = s.indexOf("st");
        int n3 = s.indexOf("t", 4);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }
	
}
