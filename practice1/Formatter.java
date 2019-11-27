package practice1;

public class Formatter {// 格式化
	public static void main(String[] arg) {
		double d = 3.14159265;
		System.out.printf("%.2f\t", d);// \t是转义字符制表符  
		System.out.printf("%.2f\n", d);// \n是转义字符回车
		System.out.printf("%.2f\n", d);// %.2f显示两位小数
		System.out.printf("%.4f\n", d);// %.4f显示四位小数

		
		int n =12345000;
		System.out.printf("int=%d,one=%08x", n,n);
		// xxx=% xxx随便是什么，前面的原封不动输出
		//%08x 8是指总共8位数 ，0是补充多余的位
		//例中12345000的十六进制为bc5ea8 加上08则00bc5ea8
	}

}
