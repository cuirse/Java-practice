package practice2;

public class Extends {
	 public static void main(String[] args) {
	        One p = new One("小明", 12);
	        Study s = new Study("小红", 20, 99);
	        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
	        Study ps = new PrimaryStudent("小军", 9, 100, 5);
	        System.out.println(ps.getScore());
	    }
	}

	class One {
	    protected String name;
	    protected int age;

	    public One(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public int getAge() { return age; }
	    public void setAge(int age) { this.age = age; }
	}

	class Study extends One {
	    protected int score;
//
	    public Study(String name, int age, int score) {
	        super(name, age);
	        this.score = score;
	    }


	    public int getScore() { return score; }
	}
    class PrimaryStudent extends Study {
		protected int grade;
public PrimaryStudent(String name, int age, int score,int grade) {
	super(name, age, score);
	this.grade=grade;
	// TODO Auto-generated constructor stub
}
// TODO


}
