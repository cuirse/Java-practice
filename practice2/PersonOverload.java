package practice2;

public class PersonOverload {
	
	private String name;
	public String  getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setName(String first,String last) {
		this.name=first+" "+last;
	}
	
    public static void main(String[] args) {
        PersonOverload ming = new PersonOverload();
        PersonOverload hong = new PersonOverload();
        ming.setName("Xiao Ming");
        // TODO: 给Person增加重载方法setName(String, String):
        hong.setName("xiao","hong");
        System.out.println(ming.getName());
        System.out.println(hong.getName());
    }
}
