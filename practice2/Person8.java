package practice2;


public class Person8 {

 public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 12, 89);
	System.out.println("name: "+s.name+"   age: "+s.age+"     score: "+s.score);
	Student  n=new Student("Xiao Hong",13,90);
	System.out.println("name: "+n.name+"   age: "+n.age);
    }
}

class someone {
    protected String name;
    protected int age;

    public someone(String name, int age) {
        this.name = name;
        this.age = age;

    }
}

class Student extends someone {
    protected int score;

    public Student(String name, int age, int score) {
    	super(name,age);
        this.score = score;

    }

}

