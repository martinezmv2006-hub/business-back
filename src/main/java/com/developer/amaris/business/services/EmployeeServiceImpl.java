package com.developer.amaris.business.services;

import com.developer.amaris.business.mapper.EmployeeMapperImpl;
import com.developer.amaris.business.model.entity.Employee;
import com.developer.amaris.business.model.response.EmployeeDTO;
import com.developer.amaris.business.repositories.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    private final EmployeeMapperImpl mapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeMapperImpl mapper){
        this.employeeRepository = employeeRepository;
        this.mapper = mapper;
    }

    public List<EmployeeDTO> getAllEmployee(){
        Iterable<Employee> employees = employeeRepository.findAll();

        List<EmployeeDTO> employeesResponse = new ArrayList<>();

        for(Employee employee: employees){
            EmployeeDTO TEMP = mapper.toDto(employee);
            employeesResponse.add(TEMP);
        }

        return employeesResponse;
    }


    public EmployeeDTO getEmployeeById(Long id) throws ChangeSetPersister.NotFoundException {
        Optional<Employee> employeeOpt = employeeRepository.findById(id);

        if (!employeeOpt.isPresent()) {
            throw new ChangeSetPersister.NotFoundException();
        }

        return mapper.toDto(employeeOpt.get());
    }

}
