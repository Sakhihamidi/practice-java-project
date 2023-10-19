package raplit.methods;

public class Method632 {
	public static void main(String[] args) {
		int [] numbers = {10,20,30,40,50,60,66,78};
		Services serObj = new Services();
		serObj.getSum(numbers);
		
		System.out.println(serObj.getSum(numbers));
	}

}


class Services{
	
	public int getSum(int[]numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		return sum;
	}
}