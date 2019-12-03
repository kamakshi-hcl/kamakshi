package com.hcl.department;

import java.util.List;


public class CreateAccountMain {

	public static void main(String[] args) {
		DepartmentDAO dao = new DepartmentDAO();
		List<Department> departmentList = dao.showDepartment();
		for (Department department : departmentList) {
			System.out.println("Department No "+ department.getDeptno());
			System.out.println("Department Name "+ department.getDname());
			System.out.println("Location is "+ department.getLoc());
			System.out.println("City Name is "+ department.getCity());
			System.out.println("Department Head is "+ department.getHead());
			System.out.println("---------");
			
			
		}
		
	
	}

}
