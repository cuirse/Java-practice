package practice2;

public class Person1 {
private String[] name;
public String getname() {
	return this.name[0]+""+this.name[1];
}
public void setName(String[] name) {
	this.name=name;
	
}
public static void main(String[] args) {
	Person1 person1 =new Person1();
	String[] fullname=new String[] {"Ð¡»Æ","°¡»¨"};
	person1.setName(fullname);
	System.out.println(person1.getname());
	fullname[0]="´óÍô";
	System.out.println(person1.getname());
			
}
}
