package com.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
