package com.developer.amaris.business.services;

import com.developer.amaris.business.model.response.EmployeeDTO;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployee();

    EmployeeDTO getEmployeeById(Long id) throws ChangeSetPersister.NotFoundException;
}
