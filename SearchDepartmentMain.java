package com.hcl.department;

import java.util.Scanner;

public class SearchDepartmentMain {
	public static void main(String[] args) {
		 int deptno;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter Department Number");
		 deptno = sc.nextInt();
		 DepartmentDAO dao = new DepartmentDAO();
		 Department department = dao.searchDepartment(deptno);
		 if(department != null) {
			 System.out.println("Department Name  "+department.getDname());
			 System.out.println("Department Location  "+department.getLoc());
		 } else {
			 System.out.println("Record Not Found");
			 
		 }

	}

}
