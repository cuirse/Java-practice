package practice1;
import java.util.*;
public class BMI {
	public static void main(String[] args) {
		Scanner  scanner=new Scanner(System.in);
		System.out.println("����������");
		double kg = scanner.nextDouble();
		System.out.println("���������");
		double m = scanner.nextDouble();
		double BMI=kg/(m*m);
		System.out.printf("BMI=%2f\n", BMI);
		if (BMI<18.5) {
			System.out.println("����");
		} else if(BMI<25){
			System.out.println("����");
		}else if (BMI<28) {
			System.out.println("����");
		}else if (BMI<32) {
			System.out.println("����");
		}else {
			System.out.println("�ǳ�����");
		}
	}
}
