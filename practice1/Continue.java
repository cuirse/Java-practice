package practice1;

public class Continue {
public static void main(String[] args) {
	int sum=0;
	for (int i = 0; i <= 3; i++) {
		if (i%2==0) {
			System.out.println(i);//跳过的i
			continue;
		}
		sum+=i;//奇数i相加
	}
	System.out.println(sum);
}
}
