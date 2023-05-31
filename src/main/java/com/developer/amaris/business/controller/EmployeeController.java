package com.developer.amaris.business.controller;

import com.developer.amaris.business.model.response.EmployeeDTO;
import com.developer.amaris.business.services.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1")
public class EmployeeController {

    private final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public ResponseEntity<String> getAllEmployee() {

        try {
            log.info("Get getAllEmployee");

            List<EmployeeDTO> employeesResponse = service.getAllEmployee();

            return ResponseEntity.status(200).body(new ObjectMapper().writeValueAsString(employeesResponse));
        } catch (Exception e) {
            log.error("Error while trying to get all Employee, with message: {}", e.getMessage());

            return ResponseEntity.status(500).body("Could not get all Employee");
        }
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<String> getEmployeeById(@PathVariable("id") Long employeeId) {

        try {
            log.info("Get Employee by Id {}",employeeId);

            EmployeeDTO employeeResponse = service.getEmployeeById(employeeId);

            return ResponseEntity.status(200).body(new ObjectMapper().writeValueAsString(employeeResponse));
        } catch (Exception e) {
            log.error("Error while trying to get Employee by id, with message: {}", e.getMessage());

            return ResponseEntity.status(500).body("Could not FOUNT");
        }
    }

}
