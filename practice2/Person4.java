package practice2;

public class Person4 {
	 private String name;
	    private int age;

	   

		public Person4(String name, int age) {
			this.name=name;
			this.age=age;
			
		}

		
	    
	    public String getName() {
	        return this.name;
	    }

	    public int getAge() {
	        return this.age;
	    }
	    public static void main(String[] args) {
			Person4 p=new Person4("xiaoming",15);
			System.out.println(p.getName());
			System.out.println(p.getAge());
			
		}
}
