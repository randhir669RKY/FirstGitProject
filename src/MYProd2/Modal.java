package MYProd2;

public class Modal {
	
	private String Name;
	private int age;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Modal(String name, int age) {
		super();
		Name = name;
		this.age = age;
	}

}
