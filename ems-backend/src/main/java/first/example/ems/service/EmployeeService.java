package first.example.ems.service;

import first.example.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();

    EmployeeDto updateEmployeeById(Long employeeId, EmployeeDto updatedEmployeeDto);

    void deleteEmployeeById(Long employeeId);
}

