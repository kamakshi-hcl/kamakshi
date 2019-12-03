package com.hcl.department;

import java.util.Scanner;



public class AddDepartmentMain {
	

	public static void main(String[] args) {
			DepartmentDAO dao = new DepartmentDAO();
			System.out.println(dao.generateDepartmentno());
			Department department = new Department();
			int deptno = dao.generateDepartmentno();
			department.setDeptno(deptno);
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Department Name    ");
			department.setDname(sc.nextLine());
			System.out.println("Enter location    ");
			department.setLoc(sc.nextLine());
			System.out.println("Enter city      ");
			department.setCity(sc.nextLine());
			System.out.println("Enter Head  ");
			department.setHead(sc.nextLine());
			System.out.println(dao.addDepartment(department));
			}
}
