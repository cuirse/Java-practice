package practice2;

public class Person3 {
	private String name;
	private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
    public static void main(String[] args) throws IllegalAccessException {
        Person ming = new Person();
        ming.setName("ะกร๗");
        ming.setAge(12);
        System.out.println(ming.getAge());
    }
}


