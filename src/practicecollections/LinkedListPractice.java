package practicecollections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListPractice {
	
	public static void main(String[] args) {
		Color colorObj = new Color();
		
		colorObj.addcolor("Black");
		
		colorObj.printColor();
		
		
		

}
}


class Color{
	
	ArrayList<String> colors = new ArrayList<>();
	
	void addcolor(String color) {
		colors.add(color);
	}
	
	void removecolor(String color) {
		colors.add(color);
	} 
	
	
	void printColor() {
		System.out.println(colors);
	}
}