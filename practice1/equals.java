package practice1;



public class equals {
	//判定字符串是否相等
	public static void main(String[] args) {
		String s1="hello";
		String s2="HELLO".toLowerCase();
//其实直接hello就相等，但是函数调用好像让他们指向不同的对象了
		System.out.println(s1);
		System.out.println(s2);
		if (s1==s2) {
			System.out.println("yes,相等");
		} else {
			System.out.println("oh no,虽然字符串相同，但不相等");
//结果不相等
		}
		
		if (s1.equals(s2)) {
			System.out.println("yes! yes! yes!相等");
		} else {
			System.out.print("oh no,不相等");
		}
		
		String s3=null;
		if (s3!=null && s3.equals("hello")){
			System.out.println("hello");
			
			}
	}

}
