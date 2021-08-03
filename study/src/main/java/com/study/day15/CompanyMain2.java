package com.study.day15;

public class CompanyMain2 {

	public static void main(String[] args) {
		Employee employee = new Employee();
		Manager manager = new Manager();
		Supervisor supervisor = new Supervisor();
		employee.salary = 4_0000;
		manager.salary = 7_0000;
		supervisor.salary = 150000;
		manager.budget = 20_0000;
		supervisor.budget = 100_0000;
		//調用(呼叫)列印薪資單方法
		printSalary(employee);
		printSalary(manager);
		printSalary(supervisor);
		//查看預算
		printfBudget(manager);
		printfBudget(supervisor);
	}
	//列印薪資單
	public static void printSalary(Employee employee) {
		System.out.printf("列印員工薪資單: $%,d\n",employee.salary);
	}
	public static void printfBudget(Manager manager) {
		System.out.printf("查看預算: $%,d\n",manager.budget);
		
	}

}
