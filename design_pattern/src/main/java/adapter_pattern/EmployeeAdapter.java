package adapter_pattern;



public class EmployeeAdapter implements Employee{
	OtherEmployee oe = new OtherEmployee();
	public void employeeJob(String s) {
		oe.doEmployee(s);
	}

}
