package com.developer.amaris.business.repositories;

import com.developer.amaris.business.model.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
