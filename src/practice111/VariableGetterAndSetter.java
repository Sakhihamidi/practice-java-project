package practice111;

public class VariableGetterAndSetter {

	public static void main(String[] args) {
		Variablesexist object = new Variablesexist();
		

		int value1 = object.getMyVariable();
		System.out.println(value1);
		
		
		int value = object.setMyVariable(5);
		
		System.out.println(value);

		
	}

}

class Variablesexist{
	private int myVariable = 10;

    public int getMyVariable() {
        return myVariable;
    }

    public int setMyVariable(int value) {
        return myVariable = value;
    }
}