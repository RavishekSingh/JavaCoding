package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.exception.ReportingManagerException;
import com.masai.model.Employee;
import com.masai.model.ReportingManager;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/add-employee")
	public ResponseEntity<Employee> addEmployeeHandler(@Valid @RequestBody Employee e) throws EmployeeException{
		
		return new ResponseEntity<Employee>(eService.addEmployee(e),HttpStatus.CREATED);
	}

	@PostMapping("/add-reportingmanager")
	public ResponseEntity<ReportingManager> addReportingManagerHandler(@Valid @RequestBody ReportingManager rm) throws ReportingManagerException{
		
		return new ResponseEntity<ReportingManager>(eService.addReportingManager(rm),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/get-employees/{employee-id}")
	public ResponseEntity<Employee> getEmployeeByIdHandler(@PathVariable("employee-id") Integer eid) throws EmployeeException{
		
		return new ResponseEntity<Employee>(eService.getEmployeeById(eid),HttpStatus.OK);
	}
	
	@GetMapping("/get-employee-manager/{employee-id}")
	public ResponseEntity<ReportingManager> getReportingManagerHandler(@PathVariable("employee-id")Integer eid) throws EmployeeException, ReportingManagerException{
		
		return new ResponseEntity<ReportingManager>(eService.getReportingManager(eid),HttpStatus.OK);
	}
	
	@GetMapping("/get-all-reportees/{employee-id}")
	public ResponseEntity<List<Employee>> getAllEmployeesHandler(@PathVariable("employee-id") Integer eid) throws EmployeeException, ReportingManagerException{
		return new ResponseEntity<List<Employee>>(eService.getAllEmployees(eid),HttpStatus.OK);
	}
}
