package practice1;

public class ForEach {
	   public static void main(String[] args) {
	        int[] ns = { 1, 4, 9, 16, 25 };
	        int sum = 0;
	        for (int i:ns) {
	            // TODO
	        	sum+=i;
	        }
	        System.out.println(sum); // 55
	        //forº∆À„pi pi/4=1-1/3+1/5-..=...
	        double pi = 0.0;
	        double f=-1;
	        for (int i=1;i<=1000000;i+=2) {
	            // TODO
	        	
	        	pi-=(1.0/i)*f;
	        	f=-f;
	        	
	        }
	        pi=4*pi;
	        System.out.println(pi);
	    }
}
