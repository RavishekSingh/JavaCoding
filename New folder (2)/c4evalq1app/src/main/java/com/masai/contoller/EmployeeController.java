package com.masai.contoller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService eService;

	@PostMapping("/employees")
	public ResponseEntity<Employee> registerEmployee(@Valid @RequestBody Employee emp) throws EmployeeException {

		Employee e = eService.registerEmployee(emp);

		return new ResponseEntity<Employee>(e, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/employees/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("empId") Integer empId) throws EmployeeException{
		
		Employee e = eService.getEmployeeById(empId);
		
		return new ResponseEntity<Employee>(e,HttpStatus.OK);
	}
		
	

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployee() throws EmployeeException {

		List<Employee> list = eService.getAllEmployeeDetails();

		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}

	@DeleteMapping("/employees/{empId}")
	public ResponseEntity<Employee> deleteEmployeeById(@PathVariable("empId") Integer empId) throws EmployeeException {

		Employee dele = eService.deleteEmployeeById(empId);

		return new ResponseEntity<Employee>(dele, HttpStatus.OK);
	}

	@GetMapping("/getemployees/{address}")
	public ResponseEntity<List<Employee>> getEmployeeByAddress(@PathVariable("address") String address)
			throws EmployeeException {

		List<Employee> list = eService.getEmployeeDetailsByAddress(address);

		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);

	}

	@PutMapping("/employees")
	public ResponseEntity<Employee> updateEmployee(@Valid @RequestBody Employee emp) throws EmployeeException {

		Employee e = eService.updateEmployee(emp);

		return new ResponseEntity<Employee>(e, HttpStatus.ACCEPTED);
	}
	
	
	@GetMapping("/employees/{empId}")
	public ResponseEntity<String> getNameAndAddressOfEmplyeeById(@PathVariable("empId") Integer empId) throws EmployeeException{
		
		String list= eService.getNameAndAddressOfEmplyeeById(empId);
		
		return new ResponseEntity<String>(list,HttpStatus.OK);
		
	}
	
	


	@GetMapping("/getNameAddressSalary")
	public ResponseEntity<List<EmployeeDTO>> getNameAddressSalary() throws EmployeeException {

		List<EmployeeDTO> list = eService.getNameAddressSalaryOfAllEmployee();

		return new ResponseEntity<List<EmployeeDTO>>(list, HttpStatus.OK);

	}

}
