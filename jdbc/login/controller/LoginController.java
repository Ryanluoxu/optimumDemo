package login.controller;

import EmployeeApplication.MainApplication;
import login.model.LoginDAO;
import login.model.UserInput;
import login.pojo.Employee;

public class LoginController {
	
	public static void login() throws Exception{
		
		// 1-2. call userInput() to get data
		// 1-3. pass back data to controller
		UserInput theInput = UserInput.userInput();
		
		// 1-4. use data to create object
		Employee loginEmployee = new Employee(theInput.getInputID(),theInput.getInputPassword());
		
		// 1-5. pass object to DAO to validate
		boolean isValid = LoginDAO.validate(loginEmployee);
		
		if (isValid) {
			System.out.println("Login successful..");
			MainApplication.isLoginSuccessfull = true;
		} else {
			System.err.println("Login is unsuccessful..");
			MainApplication.isLoginSuccessfull = false;
		}
		
	}

}
