package practice1;

public class Continue {
public static void main(String[] args) {
	int sum=0;
	for (int i = 0; i <= 3; i++) {
		if (i%2==0) {
			System.out.println(i);//������i
			continue;
		}
		sum+=i;//����i���
	}
	System.out.println(sum);
}
}
