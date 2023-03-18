package service;

import java.util.Random;

import employee.Employee;

public class CredentialService {
	
	private String Email;
	private String Password;
	
	Employee emp  = new Employee();
	
	public String generateEmail(String FirstName,String LastName,String Department,String Company) {
		return this.Email = FirstName+LastName+"@"+Department+"."+Company+".com";
		
	}
	
	public String generatePassword() {
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "1234567890";
		String special = "!@#$%^&*()";
		String pswd = "";
		Random random = new Random();
		pswd += upper.charAt(random.nextInt(upper.length()));
		pswd += upper.charAt(random.nextInt(upper.length()));
		pswd += lower.charAt(random.nextInt(lower.length()));
		pswd += lower.charAt(random.nextInt(lower.length()));
		pswd += numbers.charAt(random.nextInt(numbers.length()));
		pswd += numbers.charAt(random.nextInt(numbers.length()));
		pswd += special.charAt(random.nextInt(special.length()));
		pswd += special.charAt(random.nextInt(special.length()));
		
		return this.Password = pswd;
		
	}
	
	public void showCredentials() {
		System.out.println("Below are your credentials..");
		System.out.println("EmailID : "+ Email);
		System.out.println("Password : "+ Password);
		//System.out.println("EmailID : "+ emp.getEmail());
		//System.out.println("Password : "+ emp.getPassword());
	}
}
