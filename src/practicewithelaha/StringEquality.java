package practicewithelaha;

public class StringEquality {
	public static void main(String[] args) {
		
	//String is set of Character/ is a class /is not a dataType// string is an object
	//type of String 1_Litral String  2_Reffrence String
	//
	
	// litral
	//litral String is immutable/ not changable/ it means in memory it will not remove or replace
		
		String name2 = "Ellaha";// is String litral
		name2 = "Sakhi";
		
	//decleration -->String name //Reffrenc
	//initializartion-->="Elaha" /// heap memory
	//Assingnmet -->name = "Sakhi"
		
		
		String name = "Elaha";
		System.out.println(name +" "+ name.hashCode());
		
		
		String name1 = "Ahmad";
		System.out.println(name1 +" "+ name1.hashCode());

		
		String fName= "Ellaha Sharif";
		System.out.println(fName +" "+ fName.hashCode());
		
		
		
		System.out.println(name == name1);// it is so simple \\ false

		
		name="Ahmad";
		System.out.println(name == name1);// it is so simple\\  true

		name= "Ellaha Sharif";
		
		System.out.println(name == fName);//True
		
}
}
