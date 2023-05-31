package com.developer.amaris.business.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EmployeeControllerTest {

    @Autowired
    private EmployeeController employeeController;

    @Test
    void getAllEmployee(){
            ResponseEntity<String> d = employeeController.getAllEmployee();
            assertEquals(d.getStatusCode(), HttpStatus.OK);
            assertEquals(d.getBody(),
                    "[{\"id\":1,\"name\":\"Manuel\",\"startDate\":\"14/06/2020 00:00:00\",\"endDate\":\"31/12/2023 23:59:59\",\"anualSalaty\":108000000}," +
                    "{\"id\":2,\"name\":\"Fercho\",\"startDate\":\"15/06/2020 00:00:00\",\"endDate\":\"30/12/2023 23:59:59\",\"anualSalaty\":107000000}]");
    }

    @Test
    void getEmployeeById(){
        ResponseEntity<String> d = employeeController.getEmployeeById(1L);
        assertEquals(d.getStatusCode(), HttpStatus.OK);
        assertEquals(d.getBody(),
                "{\"id\":1,\"name\":\"Manuel\",\"startDate\":\"14/06/2020 00:00:00\",\"endDate\":\"31/12/2023 23:59:59\",\"anualSalaty\":108000000}");
    }
}