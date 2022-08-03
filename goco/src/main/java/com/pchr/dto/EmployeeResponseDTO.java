package com.pchr.dto;

import com.pchr.entity.Employee;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
//Response를 보낼때 쓰이는 dto다.
public class EmployeeResponseDTO {
    private String email;
    
    public static EmployeeResponseDTO of(Employee employee) {
    	return EmployeeResponseDTO.builder()
    			.email(employee.getEmail())
    			.build();
    }
}