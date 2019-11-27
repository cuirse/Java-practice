package practice1;
import java.util.Arrays;
public class bubbling {//冒泡排序
	public static void main(String[] args) {
		int[] ns = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
		for(int n:ns) {
			System.out.print(n+"\0");//\0为空格转义符
		}
		
		for (int i = 0; i < ns.length-1; i++) {
			
			for (int j = 0; j < ns.length-1; j++) {
				if (ns[j]>ns[j+1]) {
					
					int tem=ns[j];
					ns[j]=ns[j+1];
					ns[j+1]=tem;
				System.out.print("i="+i+"j="+j+"\n");
			for(int n:ns) {
			System.out.print(+n+"\0");}
			}
				
		}
	}		//
					System.out.print("\n");
					Arrays.sort(ns);
			        System.out.println(Arrays.toString(ns));
	}
}
