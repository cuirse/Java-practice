package practice1;

public class Formatter {// ��ʽ��
	public static void main(String[] arg) {
		double d = 3.14159265;
		System.out.printf("%.2f\t", d);// \t��ת���ַ��Ʊ��  
		System.out.printf("%.2f\n", d);// \n��ת���ַ��س�
		System.out.printf("%.2f\n", d);// %.2f��ʾ��λС��
		System.out.printf("%.4f\n", d);// %.4f��ʾ��λС��

		
		int n =12345000;
		System.out.printf("int=%d,one=%08x", n,n);
		// xxx=% xxx�����ʲô��ǰ���ԭ�ⲻ�����
		//%08x 8��ָ�ܹ�8λ�� ��0�ǲ�������λ
		//����12345000��ʮ������Ϊbc5ea8 ����08��00bc5ea8
	}

}
