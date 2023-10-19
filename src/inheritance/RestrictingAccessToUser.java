package inheritance;

public class RestrictingAccessToUser {
	public static void main(String[] args) {
		User userObj = new User(120);
		System.out.println(userObj.getAge());
		
	}

}

class User {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}else {
			System.out.println("Invalid Age");
		}

	}

	public User(int age) {
		// super();
		if (age >= 0 && age <= 120) {
			this.age = age;
		}else {
			System.out.println("Invalid Age");
		}
	}

}