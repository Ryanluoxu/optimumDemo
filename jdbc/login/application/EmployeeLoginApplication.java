package login.application;

import java.sql.SQLException;

import login.controller.LoginController;

public class EmployeeLoginApplication {
	
	public static void employeeLogin() throws Exception{
		// 1-1. go to controller
		LoginController.login();
	}

}

