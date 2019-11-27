package practice1;
import java.util.*;
public class BMI {
	public static void main(String[] args) {
		Scanner  scanner=new Scanner(System.in);
		System.out.println("请输入体重");
		double kg = scanner.nextDouble();
		System.out.println("请输入身高");
		double m = scanner.nextDouble();
		double BMI=kg/(m*m);
		System.out.printf("BMI=%2f\n", BMI);
		if (BMI<18.5) {
			System.out.println("过轻");
		} else if(BMI<25){
			System.out.println("正常");
		}else if (BMI<28) {
			System.out.println("过重");
		}else if (BMI<32) {
			System.out.println("肥胖");
		}else {
			System.out.println("非常肥胖");
		}
	}
}
