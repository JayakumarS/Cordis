package com.cordis.employeeMaster;

import java.util.Optional;

import com.cordis.core.util.CustomException;
import com.cordis.usermanagement.User;

public interface EmployeeMasterDao {
	public EmployeeMasterResultBean addEmployeeMaster(EmployeeMasterBean objEmployee) throws CustomException;
	
	public Optional<User> getEmployeeUserName(String userName) throws CustomException;
}
