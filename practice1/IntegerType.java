package practice1;

public class IntegerType {
	 public static void main(String[] args) {
	        int i = 2147483647;
	        
	        int i2 = -2147483648;
	        int i3 = 2_000_000_000; // ���»��߸�����ʶ��
	        int i4 = 0xff0000; // ʮ�����Ʊ�ʾ��16711680
	        int i5 = 0b1000000000; // �����Ʊ�ʾ��512
	        long l = 9000000000000000000L; // long�͵Ľ�β��Ҫ��L
	        System.out .println(i3);
	        i3=i3+100;
	    System.out .println(i3);
	    
	    boolean b1 = true;
	    boolean b2 = false;
	    boolean isGreater = 5 > 3; // ������Ϊtrue
	    int age = 12;
	    boolean isAdult = age >= 18; 
	    System.out.println(isGreater);
	    System.out.println(isAdult);
	    
	    
	    char a = 'A';
        char zh = '��';
        System.out.println(a);
        System.out.println(zh);
        
        
        final double PI=4;
        double r=5;
        double area=PI*r*r;
        System.out.println(area);
	    }
}
