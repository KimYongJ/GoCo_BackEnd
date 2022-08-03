package com.pchr.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pchr.entity.Employee;

@Repository
//email로 Employee를 찾는 로직과, email이 존재하는가 판별하는 로직
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    Optional<Employee> findByEmail(String email);
    boolean existsByEmail(String email);
    boolean existsByEmpId(String empId);
    Optional<Employee> findByEmpId(String empId);
    Employee findByNameAndEmail(String name,String email);
    Employee findByEmpIdAndEmail(String empId,String email);
}
