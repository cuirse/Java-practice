package practice1;

public class Double1 {
	  public static void main(String[] args) {
	        double x = 1.0 / 10;
	        double y = 1.0 - (9.0/10);//有误差
	        // 观察x和y是否相等:
	        System.out.println(x);
	        System.out.println(y);
	        int n = 5;
	        double d = 1.2 + 25.0 / n; // 6.0
	        double b = 1.2 + 25 / n; // 6.0
	        System.out.println(d);
	        System.out.println(b);
	        
	        
	        double h = 2.4;
	        int m = (int) (h + 0.5);
	        System.out.println(m);//四舍五入
	    }
}
