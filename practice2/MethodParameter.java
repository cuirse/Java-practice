package practice2;

public class MethodParameter {
	private String name;
	private int age;

	public void setNameAndAge(String name,int age) {
		this.name=name;
		this.age=age;
		
	}
	public  void getNameAnd() {
		// TODO Auto-generated method stub
		return;
		
	}
	
	public static void main(String[] args) {
		MethodParameter ming=new MethodParameter();
		ming.setNameAndAge("ming", 12);
		
		System.out.println(ming);
	}
}
