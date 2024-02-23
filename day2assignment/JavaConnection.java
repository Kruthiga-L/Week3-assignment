package week3.day2assignment;

public class JavaConnection implements DatabaseConnection{

	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Connect to Database");
		
	}

	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnect the database");
		
	}

	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Execute Update");
		
	}

	public static void main(String[] args) {
		JavaConnection jv=new JavaConnection();
		jv.connect();
		jv.executeUpdate();
		jv.disconnect();
	}
}
