package practice2;

public class Run {
	public static void main(String[] args) {
		
	}
	public void run() {
		System.out.println("ying");
}
	public class Run2 extends Run{
		   @Override
		    public void run() {
		        System.out.println("Student.run");
		    }
	}
}
