package employee;

public class Employee {
	
	private String FirstName;
	private String LastName;
	//private String Department;
	private String Email;
	private String Password;
	
	public Employee(String FirstName, String LastName){
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getLastName() {
		return LastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getPassword() {
		return Password;
	}

}
