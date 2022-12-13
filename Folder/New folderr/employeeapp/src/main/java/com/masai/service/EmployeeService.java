package com.masai.service;

import java.util.List;

import com.masai.exception.EmployeeException;
import com.masai.exception.ReportingManagerException;
import com.masai.model.Employee;
import com.masai.model.ReportingManager;

public interface EmployeeService {

	public Employee addEmployee(Employee e) throws EmployeeException;

	public ReportingManager addReportingManager(ReportingManager rm) throws ReportingManagerException;

	public Employee getEmployeeById(Integer eid) throws EmployeeException;

	public ReportingManager getReportingManager(Integer eid) throws EmployeeException, ReportingManagerException;

	public List<Employee> getAllEmployees(Integer rid) throws EmployeeException, ReportingManagerException;

}
