package com.example.springboottutorial.service;

import com.example.springboottutorial.entity.Department;
import com.example.springboottutorial.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService {
    public  Department saveDepartment(Department department);

    public List<Department> fetchDepartments();

    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

    public String deleteDepartmentById(Long departmentId);

    public Department updateDepartment(Long departmentId, Department department) throws DepartmentNotFoundException;

    public Department fetchDepartmentByName(String departmentName);
}
