package raplit.methods;

public class Constractor711 {
	public static void main(String[] args) {
		Bootcamp bootcampObj = new Bootcamp();

		System.out.println("Bootcamp name=" + bootcampObj.getBootcampName());

	}

}

class Bootcamp {

	private String BootcampName;

	public Bootcamp() {
		BootcampName = "TekSchool";
	}

	public void setBootcampName(String bootcampName) {
		this.BootcampName = bootcampName;
	}

	public String getBootcampName() {
		return BootcampName;
	}
}
