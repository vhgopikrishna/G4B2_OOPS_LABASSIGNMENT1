package application;

import java.util.Scanner;

import employee.Employee;
import service.CredentialService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FirstName;
		String LastName;
		int choice = 0;
		String Dept = null;
		final String Company = "greatlearning";
		String email;
		String pswd;
		
		
		Scanner emp = new Scanner(System.in);
		System.out.println("Enter First Name");
		FirstName = emp.next();
		
		System.out.println("Enter Last Name");
		LastName = emp.next();
		Scanner dep = new Scanner(System.in);
		
		do
		{
			System.out.println("Please enter department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			choice = dep.nextInt();
			switch (choice){
			case 1: 
				Dept = "tech";
				break;
			case 2: 
				Dept = "adm";
				break;
			case 3: 
				Dept = "hr";
				break;
			case 4: 
				Dept = "legal";
				break;
			default: choice = 0;
			}
		}
		while(choice == 0);
		
		Employee e = new Employee(FirstName,LastName);
		CredentialService cs = new CredentialService();
		email = cs.generateEmail(FirstName, LastName, Dept, Company);
		pswd = cs.generatePassword();
		e.setEmail(email);
		e.setPassword(pswd);
		cs.showCredentials();
		

	}

}
