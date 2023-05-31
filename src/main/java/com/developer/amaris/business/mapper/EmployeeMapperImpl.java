package com.developer.amaris.business.mapper;

import com.developer.amaris.business.model.entity.Employee;
import com.developer.amaris.business.model.response.EmployeeDTO;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Component
public class EmployeeMapperImpl{
    public EmployeeMapperImpl() {
    }
    public EmployeeDTO toDto(Employee entity) {
        if (entity == null) {
            return null;
        } else {
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");


            EmployeeDTO.EmployeeDTOBuilder employeeDTO = EmployeeDTO.builder();
            employeeDTO.id(entity.getId());
            employeeDTO.name(entity.getName());
            employeeDTO.startDate(formato.format(entity.getStartDate()));
            employeeDTO.endDate(formato.format(entity.getEndDate()));
            employeeDTO.anualSalaty(entity.getAnualSalaty());
            return employeeDTO.build();
        }
    }
}
