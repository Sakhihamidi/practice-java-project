package javaproject;

public class SecurePasswordStorage {
	public static void main(String[] args) {
		LoginSystem logObj = new LoginSystem();
		logObj.setPassword("Sakhi");
		
		System.out.println(logObj.checkPassword("Sakhi"));
		System.out.println(logObj.checkPassword("incorrect"));
		System.out.println(logObj.checkPassword("Ahmad"));
	}
}

class LoginSystem{
	private String hashedPassword;

	/*
	 * public void setHashedPasswork(String hashedPasswork) { this.hashedPasswork =
	 * hashedPasswork; }
	 */
	public void setPassword(String password) {
		StringBuffer reversedPass = new StringBuffer(password).reverse();
		hashedPassword = reversedPass.toString();
		System.out.println(reversedPass);
	}
	public boolean checkPassword(String password) {
		StringBuffer reversedInputPass = new StringBuffer(password).reverse();
		String hashInPass = reversedInputPass.toString();
		return hashInPass.equals(hashedPassword);
			}
	}

