package com.pchr.dto;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BusinessTripDTO {
	private Long business_tripId;
	
	private Date businessTripStartDate; 
	
	private Date businessTripEndDate; 
	
	private boolean approveYN;
	
	private String businessTripContent;
	
	private LocalDateTime businessTripRequestDate;
	
	private LocalDateTime businessTripApproveDate;
	
	
}