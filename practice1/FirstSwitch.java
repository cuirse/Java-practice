package practice1;
//��Ҫ����break ��Ҫ����default
//��Ҫ����break ��Ҫ����default
//��Ҫ����break ��Ҫ����default


public class FirstSwitch {
	public static void main(String[] args) {
		int option=3;
		switch(option){
		case 1:
			System.out.println("Slescted 1");
			break;
		case 2:
			/*System.out.println("Slescted 2");
			break;*/
		//case�����д�͸�ԣ���û��breakʱ��ִ�����к������
		case 3:
			System.out.println("Slescted 3");
			break;
		default:
			//��ֵ��Ϊ�κ�ѡ��ʱ�������defaultѡ��
			System.out.print("No Selected");
			break;
		}
		
		//�������ж��ַ���
        String fruit = "apple";
        switch (fruit) {
        case "apple":
            System.out.println("Selected apple");
            break;
        case "pear":
            System.out.println("Selected pear");
            break;
        case "mango":
            System.out.println("Selected mango");
            break;
        default:
            System.out.println("No fruit selected");
            break;
        }
	}
}
