package practice1;



public class equals {
	//�ж��ַ����Ƿ����
	public static void main(String[] args) {
		String s1="hello";
		String s2="HELLO".toLowerCase();
//��ʵֱ��hello����ȣ����Ǻ������ú���������ָ��ͬ�Ķ�����
		System.out.println(s1);
		System.out.println(s2);
		if (s1==s2) {
			System.out.println("yes,���");
		} else {
			System.out.println("oh no,��Ȼ�ַ�����ͬ���������");
//��������
		}
		
		if (s1.equals(s2)) {
			System.out.println("yes! yes! yes!���");
		} else {
			System.out.print("oh no,�����");
		}
		
		String s3=null;
		if (s3!=null && s3.equals("hello")){
			System.out.println("hello");
			
			}
	}

}
