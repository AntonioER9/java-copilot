package com.example.empl;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.empl.model.Employee;

public interface EmplRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByPosition(String position);
}