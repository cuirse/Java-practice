package practice2;

public class Person5 {
	
	    private String name;
	    private int age;

	    public Person5(String name, int age) {//���췽��
	        this.name = name;
	        this.age = age;
	    }
	    
	    public String getName() {
	        return this.name;
	    }

	    public int getAge() {
	        return this.age;
	    }

    public static void main(String[] args) {
        Person5 p = new Person5("hui",12); // �������:�Ҳ���������췽��
        System.out.println(p.getName());
        System.out.println(p.getAge());
        
    
    }
}


