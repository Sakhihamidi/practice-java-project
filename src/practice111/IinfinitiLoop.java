package practice111;

public class IinfinitiLoop {
	int add(int a, int b) {
        return (a+b);   
    }
    public static void main (String [] args) {
        System.out.println(" using IinfinitiLoop class");
        IinfinitiLoop a = new IinfinitiLoop();
        System.out.println("Sum is :" + a.add(5, 10));
    }

    public static void main (int i) {
        System.out.println(" Using IinfinitiLoop class main function with integer argument");
        IinfinitiLoop a = new IinfinitiLoop();
        System.out.println("Sum is :" + a.add(20, 10));
    }
}

class DefClass {


    public static void main (String args[]) {
        System.out.println(" using DefClass");
        IinfinitiLoop a = new IinfinitiLoop();
        System.out.println("Sum is :" + a.add(5, 10));
        IinfinitiLoop.main(null);
        IinfinitiLoop.main(1);
    }
}




		



