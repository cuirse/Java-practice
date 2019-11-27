package practice1;

public class FristIf {
	 public static void main(String[] args) {
	        int n = 80;
	        if (n >= 60) {
	            System.out.println("及格了");
	        } else {
	            System.out.println("挂科了");
	        }
	        System.out.println("END");
	 
	 double x=1-  9.0/10;
	 if (x==0.1) {
		System.out.println("x is 0.1");
	}else {
		System.out.println("x is not 0.1");
	}
	 
	 if (Math.abs(x-0.1)<0.00001) {
		 //浮点数计算有一定误差，只要误差小于0.00001视为相等
		 System.out.println("x is 0.1");
		}else {
			System.out.println("x is not 0.1");
			
	}
	 int b=-100;
			System.out.println(Math.abs(b));
		//math.abs 绝对值函数
	 }
	 
}
