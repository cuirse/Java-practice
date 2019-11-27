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
        System.out.println(s3 == s4);//false 比较引用地址/对象
        System.out.println(s3.equals(s4));//true 比较字符
        System.out.println(s3.equalsIgnoreCase(s5));//true 无视大小写
        System.out.println(s3.contains(s6));//是否包含子串
        System.out.println(s3.indexOf("o"));//char's index,start by 0
        System.out.println(s3.lastIndexOf("l"));//last index of char
        System.out.println(s3.startsWith("he"));//and end with,if equal,return true
        System.out.println(s3.substring(1));//subString,子串,subString from index 1.
        System.out.println(s3.substring(1,4));//subString
        //去除字符串首尾空白字符：包括\t,\r,\n及" ":
        System.out.println("\t \nHello\r".trim());
        System.out.println("\t \nHello\r".strip());
        //判空和空白字符串
        System.out.println("".isEmpty()); // true，因为字符串长度为0
        System.out.println("  ".isEmpty()); // false，因为字符串长度不为0
        System.out.println("  \n".isBlank()); // true，因为只包含空白字符
        System.out.println(" Hello ".isBlank()); // false，因为包含非空白字符
        System.out.println("".isBlank()); // True,因为字符串长为0
        //替换字符串
        System.out.println(s1.replace("l","w"));
        System.out.println(s1.replace("ll","oo"));
        String s7="A,,B;C,D";
        System.out.println(s7.replaceAll("[\\,\\;\\s7]+",","));
        String s8="A,B,C,D";
        String[] s9=s8.split("\\,");
        System.out.println(s9);
        
        //拼接字符串
        String[] arr= {"A","B","C"};
        String sarrString=String.join("+",arr);
        System.out.println(sarrString);
        
        
	}
}
