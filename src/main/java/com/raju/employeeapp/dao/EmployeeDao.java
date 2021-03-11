package com.raju.employeeapp.dao;

import com.raju.employeeapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends JpaRepository<Employee,Integer>
{

}
