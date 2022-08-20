package com.example.gfl_patterns.factory_task;

import com.example.gfl_patterns.factory_task.controller.CompanyController;
import com.example.gfl_patterns.factory_task.controller.EmployeeController;
import com.example.gfl_patterns.factory_task.dto.CompanyFilterDto;
import com.example.gfl_patterns.factory_task.dto.EmployeeFilterDto;
import com.example.gfl_patterns.factory_task.factory.BeanFactory;
import com.example.gfl_patterns.factory_task.factory.Factory;

public class Example {

    public static void main(String[] args) {
        new Example().run();
    }

    private void run() {
        Factory factory = BeanFactory.getInstance();
        CompanyController companyController = new CompanyController(factory);
        EmployeeController employeeController = new EmployeeController(factory);

        CompanyFilterDto companyFilter = new CompanyFilterDto("e", 0, 0);
        System.out.println(companyController.findAllByFilter(companyFilter));

        EmployeeFilterDto employeeFilter = new EmployeeFilterDto(
                "a", "a", 1L, 0, 0);
        System.out.println(employeeController.findAllByFilter(employeeFilter));
    }
}
