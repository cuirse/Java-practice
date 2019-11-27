package practice3;

public class StringCompare {
	public static void main(String[] args) {
		String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);//true
        System.out.println(s1.equals(s2));//true
        String s3 = "hello";
        String s4 = "HELLO".toLowerCase();
        String s5="HELLO";
        String s6="llo";
        System.out.println(s3 == s4);//false �Ƚ����õ�ַ/����
        System.out.println(s3.equals(s4));//true �Ƚ��ַ�
        System.out.println(s3.equalsIgnoreCase(s5));//true ���Ӵ�Сд
        System.out.println(s3.contains(s6));//�Ƿ�����Ӵ�
        System.out.println(s3.indexOf("o"));//char's index,start by 0
        System.out.println(s3.lastIndexOf("l"));//last index of char
        System.out.println(s3.startsWith("he"));//and end with,if equal,return true
        System.out.println(s3.substring(1));//subString,�Ӵ�,subString from index 1.
        System.out.println(s3.substring(1,4));//subString
        //ȥ���ַ�����β�հ��ַ�������\t,\r,\n��" ":
        System.out.println("\t \nHello\r".trim());
        System.out.println("\t \nHello\r".strip());
        //�пպͿհ��ַ���
        System.out.println("".isEmpty()); // true����Ϊ�ַ�������Ϊ0
        System.out.println("  ".isEmpty()); // false����Ϊ�ַ������Ȳ�Ϊ0
        System.out.println("  \n".isBlank()); // true����Ϊֻ�����հ��ַ�
        System.out.println(" Hello ".isBlank()); // false����Ϊ�����ǿհ��ַ�
        System.out.println("".isBlank()); // True,��Ϊ�ַ�����Ϊ0
        //�滻�ַ���
        System.out.println(s1.replace("l","w"));
        System.out.println(s1.replace("ll","oo"));
        String s7="A,,B;C,D";
        System.out.println(s7.replaceAll("[\\,\\;\\s7]+",","));
        String s8="A,B,C,D";
        String[] s9=s8.split("\\,");
        System.out.println(s9);
        
        //ƴ���ַ���
        String[] arr= {"A","B","C"};
        String sarrString=String.join("+",arr);
        System.out.println(sarrString);
        
        
	}
}
