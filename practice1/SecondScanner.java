package practice1;
import java.util.Scanner;
public class SecondScanner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入上一次考试成绩");
		int test1=scanner.nextInt();
		System.out.println("输入这次考试成绩");
		int test2=scanner.nextInt();
		//nextInt()/nextLine()/nextDouble()
		double percent=(float)(test2-test1)/test1*100;
		//int型运算会省略小数部分 而(test2-test1)/test1等于0.xx所以结果为0.00
		//所以要加上double/float，因为结果是0.xx,转为百分数表达得乘100
		
		if(test2>test1) {
			System.out.printf("恭喜进步，比上次成绩提升了%.2f%%", percent);
		}
		else {
			System.out.printf("再接再厉，比上次成绩下降了%.2f%%", percent);
		}
	}
}
