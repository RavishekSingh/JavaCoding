package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.exception.ReportingManagerException;
import com.masai.model.Employee;
import com.masai.model.ReportingManager;
import com.masai.repository.EmployeeDao;
import com.masai.repository.ReportingManagerDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao eDao;

	@Autowired
	private ReportingManagerDao rDao;

	@Override
	public Employee addEmployee(Employee e) throws EmployeeException {
		
	Employee emp=eDao.save(e);
		return emp;
	}

	@Override
	public ReportingManager addReportingManager(ReportingManager rm) throws ReportingManagerException {

		ReportingManager rpm=rDao.save(rm);
		return rpm;
	}

	@Override
	public Employee getEmployeeById(Integer eid) throws EmployeeException {

		Optional<Employee> opt=eDao.findById(eid);
		
		if(opt.isPresent()) {
			Employee e=opt.get();
			return e;
		}
		else
		throw new EmployeeException("Employee not found with given id: "+eid);
	}

	@Override
	public ReportingManager getReportingManager(Integer eid) throws EmployeeException, ReportingManagerException {
		Optional<Employee> opt=eDao.findById(eid);
		
		if(opt.isPresent()) {
			Employee em=opt.get();
		    
			ReportingManager rm=em.getRm();
			return rm;
		}
		else
			
		throw new EmployeeException("No reporting manager found with id: "+eid);
	}

	@Override
	public List<Employee> getAllEmployees(Integer rid) throws EmployeeException, ReportingManagerException {
		Optional<ReportingManager> opt=rDao.findById(rid);
		if(opt.isPresent()) {
			ReportingManager rm=opt.get();
			
			List<Employee> emp=rm.getEl();
			return emp;
		}
		else
			throw new ReportingManagerException("Reporting Manager not found with id: "+rid);
		
	}

}
