package practice1;

public class FristIf {
	 public static void main(String[] args) {
	        int n = 80;
	        if (n >= 60) {
	            System.out.println("������");
	        } else {
	            System.out.println("�ҿ���");
	        }
	        System.out.println("END");
	 
	 double x=1-  9.0/10;
	 if (x==0.1) {
		System.out.println("x is 0.1");
	}else {
		System.out.println("x is not 0.1");
	}
	 
	 if (Math.abs(x-0.1)<0.00001) {
		 //������������һ����ֻҪ���С��0.00001��Ϊ���
		 System.out.println("x is 0.1");
		}else {
			System.out.println("x is not 0.1");
			
	}
	 int b=-100;
			System.out.println(Math.abs(b));
		//math.abs ����ֵ����
	 }
	 
}
