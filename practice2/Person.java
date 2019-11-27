package practice2;



public class Person {
   
    private String name;
    private int age;
    
     public String getName() {
		return this.name;
	}

	public void setName(String name) throws IllegalAccessException {
		if (name==null||name.isBlank()) {
			throw new IllegalAccessException("invalid name");
		}
		this.name = name.strip();//strip ȥ����β�ո�
	}

	public int getAge() {
		return this.age;
	}

	
	public void setAge(int age) throws IllegalAccessException{
		if (age<0||age>100) {
			throw new IllegalAccessException("invalid age value");
		}
		this.age=age;
	}

	public static void main(String[] args) throws IllegalAccessException  {
        Person ming = new Person();
        ming.setName(" xiao ming");  // ���ֶ�name��ֵ
        ming.setAge(12); // ���ֶ�age��ֵ
        System.out.println(ming.name+"'s age is "+ming.age);
    }
}

