package practice1;

		import java.util.Scanner;

		/**
		 * switchʵ��ʯͷ/����/�����ж�ʤ��
		 */
		public class SecondSwitch {

			public static void main(String[] args) {
				System.out.println("please choice:");
				System.out.println(" 1: Rock");//ʯͷ
				System.out.println(" 2: Scissors");//����
				System.out.println(" 3: Paper");//��
				// �û�����:
				/*Scanner scanner=new Scanner(System.in);
				
				int choice = 0;
				System.out.println("��ӭ������ȭ��Ϸ��������ѡ��");
				choice =scanner.nextInt();*/
				// ���������� 1, 2, 3:
				int n=1;
				int win=0;
				int lose=0;
				while (n<=10) {
					int choice = 1 + (int) (Math.random() * 3);
				int random = 1 + (int) (Math.random() * 3);
				System.out.println(random);
				int cha=choice-random;
				System.out.println(cha);
				
				
				//������ʵ��
				switch (choice-random) {
				// TODO:
				case 0:
					System.out.println("ƽ��");
					break;
				case 1:
				case-2:
					System.out.println("������");
					lose++;
					break;
				case 2:
				case -1:
					System.out.println("��Ӯ��");
					win++;
					break;
				default:
					System.out.print("����������������ֵ��");
					break;
				
				}
				
				
				n++;
				}
				
				
				System.out.println("��Ӯ�Ĵ�����"+win+"\n"+"����Ĵ���"+lose);
				
				
			}

		}

	

