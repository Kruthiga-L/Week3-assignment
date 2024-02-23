package week3.day1assignment;

public class APIclient {

	 public void sendRequest(String endpoint) {
		
System.out.println("Endpoint: "+endpoint);
	}
	 public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint: "+endpoint+","+"Request Body: "+requestBody+","+"Request Status: "+requestStatus);

	}
	public static void main(String[] args) {
		APIclient api=new APIclient();
		api.sendRequest("Single argument");
		api.sendRequest("three argument", "API", false);

	}

}
