package javaproject;

public class ImplementingRateLimiter {

	public static void main(String[] args) {
		
		RateLimiter reLiObj = new RateLimiter();
		reLiObj.setThreshold(20);
		
		System.out.println(reLiObj.canAccess());
		reLiObj.recordAccess();
		
		System.out.println(reLiObj.canAccess());
		reLiObj.recordAccess();

	}

}


class RateLimiter{
	private long lastAccessed;
	private int threshold;
	

	public void setThreshold(int threshold) {
		this.threshold = threshold;
	}

	public boolean canAccess() {
		long currentTime = System.currentTimeMillis();
		return currentTime - lastAccessed >= threshold;
	}
	
	public void recordAccess() {
		if(canAccess()) {
			lastAccessed = System.currentTimeMillis();
			System.out.println("you can access the system");
			}else {
				System.out.println("you can not access the system");
			}
	}
}