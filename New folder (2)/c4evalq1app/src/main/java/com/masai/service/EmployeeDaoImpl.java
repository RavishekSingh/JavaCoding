package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.EmployeeDTO;
import com.masai.repository.EmployeeRepo;

@Service
public class EmployeeDaoImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo eRepo;

	@Override
	public Employee registerEmployee(Employee emp) throws EmployeeException {

		Employee e = eRepo.save(emp);

		return e;
	}

	@Override
	public Employee getEmployeeById(Integer empId) throws EmployeeException {
		
		Optional<Employee> opt= eRepo.findById(empId);
		
		if(opt.isPresent()) {
			Employee e= opt.get();
			
			return e;
		}
		else
			throw new EmployeeException("No Employee with id: "+empId);
	}

	@Override
	public List<Employee> getAllEmployeeDetails() throws EmployeeException {

		List<Employee> list = eRepo.findAll();

		if (list.size() == 0)
			throw new EmployeeException("No Employee are there");
		else
			return list;
	}

	@Override
	public Employee deleteEmployeeById(Integer empId) throws EmployeeException {

		Optional<Employee> opt = eRepo.findById(empId);

		if (opt.isPresent()) {

			Employee existe = opt.get();
			eRepo.delete(existe);
			return existe;
		} else
			throw new EmployeeException("Employee does not exist with id :" + empId);

	}

	@Override
	public Employee loginEmployee(String email, String password) throws EmployeeException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployeeDetailsByAddress(String address) throws EmployeeException {

		List<Employee> list = eRepo.findByAddress(address);

		if (list.size() == 0)
			throw new EmployeeException("No Employee are there");
		else
			return list;

	}

	@Override
	public Employee updateEmployee(Employee emp) throws EmployeeException {

		Optional<Employee> opt = eRepo.findById(emp.getEmpId());

		if (opt.isPresent()) {

			Employee existe = eRepo.save(emp);

			return existe;
		} else
			throw new EmployeeException("Employee does not exist");
	}

	@Override
	public String getNameAndAddressOfEmplyeeById(Integer empId) throws EmployeeException {
		
	String list	= eRepo.getNameAndAddressOfEmplyeeById(empId);
		
	if (list.length() == 0)
		throw new EmployeeException("No Employee are there");
	else
		return "Employe found";
			
	}

	@Override
	public List<EmployeeDTO> getNameAddressSalaryOfAllEmployee() throws EmployeeException {

		List<EmployeeDTO> list = eRepo.getNameAddressSalaryOfAllEmployee();

		if (list.size() == 0)
			throw new EmployeeException("No Employee are there");
		else
			return list;
	}

}
