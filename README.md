# Empleados
En la base de datos de empleado de la compañía disponemos de una tabla EMPLOYEE que refleja el salario anual, un rango de fechas de entrada y salida y los nombres. A continuación, se muestra un ejemplo de la tabla con los campos relevantes:

### EMPLOYEE
| ID | NAME | START_DATE          | END_DATE            | ANUAL_SALARY|
|----|------|---------------------|---------------------|------------|
| 1 | Manuel | 2020-06-14 00:00:00 | 2023-12-31 23:59:59 | 108000000 |
| 1 | Fercho | 2020-06-15 00:00:00 | 2023-12-30 23:59:59 | 107000000 |

### Campos

| Nombre | Descripción                                        |
|--------|----------------------------------------------------|
| ID | identificador único en el sistema para el empleado |
| NAME | nombre del empleado.                               |
| START_DATE,END_DATE | rango de fechas en el que labora el empleado.      |
| ANUAL_SALARY | Salario anual del empleado.                        |

### Estructura de paquetes del proyecto
```sh
├───src
    ├───main
    │   ├───java
    │   │   └───com
    │   │       └───developer
    │   │           └───amaris
    │   │               └───business
    │   │                   │   BusinessApplication.java
    │   │                   │   ServletInitializer.java
    │   │                   │
    │   │                   ├───controller
    │   │                   │       EmployeeController.java
    │   │                   │
    │   │                   ├───mapper
    │   │                   │       EmployeeMapperImpl.java
    │   │                   │
    │   │                   ├───model
    │   │                   │   ├───entity
    │   │                   │   │       Employee.java
    │   │                   │   │
    │   │                   │   └───response
    │   │                   │           EmployeeDTO.java
    │   │                   │
    │   │                   ├───repositories
    │   │                   │       EmployeeRepository.java
    │   │                   │
    │   │                   └───services
    │   │                           EmployeeService.java
    │   │                           EmployeeServiceImpl.java
    │   │
    │   └───resources
    │       │   application.properties
    │       │   data.sql
    │       │
    │       ├───static
    │       └───templates
    └───test
        └───java
            └───com
                └───developer
                    └───amaris
                        └───business
                            │   BusinessApplicationTests.java
                            │
                            └───controller
                                    EmployeeControllerTest.java
```
### Swagger
Se deja habilitado la documentación automática servicio de Swagger en el siguiente link: 
http://localhost:8080/swagger-ui/index.html

### Requisitos

- Java 1.8
- Maven ^3
- Lombok

### Compilar

```sh
mvn clean install
```

### Iniciar

```sh
mvn spring-boot:run
```
http://localhost:8080/

### Test

```sh
mvn test
```

### Notas
- Se uso una base de datos en memoria tipo h2, embebida en el aplicativo auto generada y guarda registros iniciales por el archivo data.sql
- Se deja la consola de h2 activa por si se quiere revisar, la dirección es http://localhost:8080/h2-console