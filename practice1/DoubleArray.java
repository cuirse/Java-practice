package practice1;

public class DoubleArray {
	   public static void main(String[] args) {
	        int[][] ns = {
	            { 1, 2, 3, 4 },
	            { 5, 6, 7, 8 },
	            { 9, 10, 11, 12 }
	        };
	        System.out.println(ns.length); // 3
	        //����һ�и�ֵ����һά����
	        int[] arr0 = ns[0];
	        System.out.println(arr0.length); // 4
	        
	        //���ʶ�ά����Ԫ��
	        int a0 = (ns[0][1]);
	        System.out.println(a0);
	        
	        //��ӡ��ά����
	        for (int[] i : ns) {
				for (int j : i) {
					System.out.print(j);
					System.out.print("\0");
				}
			}
	    }
}
