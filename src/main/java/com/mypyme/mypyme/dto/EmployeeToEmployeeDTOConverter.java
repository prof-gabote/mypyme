package com.mypyme.mypyme.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.mypyme.mypyme.model.Employee;
import com.mypyme.mypyme.model.Project;

@Component
public class EmployeeToEmployeeDTOConverter implements Converter<Employee, EmployeeDTO>{

    @Override
    @Nullable
    public EmployeeDTO convert(Employee employee) {
        EmployeeDTO dto = new EmployeeDTO();
        /*
        Un corvertidor nos ahorra el trabajo de parsear objetos en las solicitudes.
        Por ejemplo, podemos usar un convertidor para convertir la entidad completa Employee en solo los datos que usará el sistema
        */
        return dto;
    }

}
