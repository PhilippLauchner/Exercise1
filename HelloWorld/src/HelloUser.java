public class HelloUser {
	
	private String _userName;
	
	public HelloUser(String userName){
		_userName = userName;
	}
	
	public void greetUser(){
		System.out.println("Hello " + _userName + "!");
	}
}
