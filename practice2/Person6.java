package practice2;

public class Person6 {
   
   
        private String name;
        private int age;
        public Person6(String name, int age) {
        	this.name=name;
        	this.age=age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
 
    public static void main(String[] args) {
        // TODO: ��Person���ӹ��췽��:
        Person6 ming = new Person6("С��", 12);
        System.out.println(ming.getName());
        System.out.println(ming.getAge());
    }
	
}
