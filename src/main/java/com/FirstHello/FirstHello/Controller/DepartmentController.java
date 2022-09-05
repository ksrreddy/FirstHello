package com.FirstHello.FirstHello.Controller;

import com.FirstHello.FirstHello.entity.Department;
import com.FirstHello.FirstHello.service.DepartmentService;
import com.FirstHello.FirstHello.service.Deptservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private Deptservice deptservice;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        return deptservice.saveDepartment(department);
    }
}
