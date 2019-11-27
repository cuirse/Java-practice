package practice1;

public class FirstFor {
	public static void main(String[] args) {
		int sum=0;
	for(int i=0;i<=100;i++) {
		sum+=i;
		
	}
	System.out.println(sum);
	
	int[] ns= {20,2,3,30,66};
	sum=0;
	for(int i=0;i<ns.length;i++) {
		sum+=ns[i];
		
	}
	for (int i : ns) {
		System.out.println(i);
	}
	System.out.println(sum);
	
	
	//µ¹Ðò
	for (int i =ns.length-1; i >=0; i--) {
		System.out.println(ns[i]);
	}
	}
	
}
