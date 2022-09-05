package com.FirstHello.FirstHello.service;

import com.FirstHello.FirstHello.entity.Department;
import com.FirstHello.FirstHello.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService implements Deptservice{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
