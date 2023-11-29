package practice111;

import java.util.ArrayList;
import java.util.List;

public class StaticAndInnerClass {
	public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        int valueAtIndex1 = arrayList.get(1);
        System.out.println("Value at index 1: " + valueAtIndex1);

        int valueAtIndex2 = arrayList.get(2);
        System.out.println("Value at index 2: " + valueAtIndex2);
    }
}

