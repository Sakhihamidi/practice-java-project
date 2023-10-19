package javaproject;

public class ConfiguringSoftwareApplication {
	public static void main(String[] args) {

		AppConfig apConObj = new AppConfig();

		apConObj.setDatabaseName("My Database");
		apConObj.setPort(235);
		apConObj.setServerIp("72.16.16.24");
		
		System.out.println(apConObj.getDatabaseName());
		System.out.println(apConObj.getPort());
		System.out.println(apConObj.getServerIp());
		}
}

class AppConfig {
	private String serverIp;
	private int port;
	private String databaseName;

	public String getServerIp() {
		return serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		if (port >= 0 && port <= 65535) {
			this.port = port;
		} else {
			System.out.println("you entered a wrong port number");
		}
	}

	public String getDatabaseName() {
		return databaseName;
	}

	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}

}