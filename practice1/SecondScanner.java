package practice1;
import java.util.Scanner;
public class SecondScanner {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("������һ�ο��Գɼ�");
		int test1=scanner.nextInt();
		System.out.println("������ο��Գɼ�");
		int test2=scanner.nextInt();
		//nextInt()/nextLine()/nextDouble()
		double percent=(float)(test2-test1)/test1*100;
		//int�������ʡ��С������ ��(test2-test1)/test1����0.xx���Խ��Ϊ0.00
		//����Ҫ����double/float����Ϊ�����0.xx,תΪ�ٷ������ó�100
		
		if(test2>test1) {
			System.out.printf("��ϲ���������ϴγɼ�������%.2f%%", percent);
		}
		else {
			System.out.printf("�ٽ����������ϴγɼ��½���%.2f%%", percent);
		}
	}
}
