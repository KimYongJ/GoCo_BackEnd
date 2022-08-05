package com.pchr.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.pchr.dto.ApproveEnum;
import com.pchr.dto.BusinessTripDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BusinessTrip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "business_trip_id")
	private Long businessTripId;

	@Column(name = "business_trip_start_date", nullable = false)
	private Date businessTripStartDate;

	@Column(name = "business_trip_end_date", nullable = false)
	private Date businessTripEndDate;

	@Column(name = "approve_yn")
	@Enumerated(EnumType.STRING)
	private ApproveEnum approveYn;

	@Column(name = "business_trip_content")
	private String businessTripContent;

	@Column(name = "business_trip_request_date", nullable = false)
	private LocalDateTime businessTripRequestDate;

	@Column(name = "business_trip_approve_date", insertable = false)
	private LocalDateTime businessTripApproveDate;

	@ManyToOne
	@JoinColumn(name = "emp_num", nullable = false, updatable = false)
	private Employee employee;

	// toDTO
	public BusinessTripDTO toBusinessTripDTO(BusinessTrip businessTripEntity) {
		BusinessTripDTO businessTripDTO = BusinessTripDTO.builder()
				.businessTripId(businessTripEntity.getBusinessTripId())
				.businessTripStartDate(businessTripEntity.getBusinessTripStartDate())
				.businessTripEndDate(businessTripEntity.getBusinessTripEndDate())
				.approveYn(businessTripEntity.getApproveYn())
				.businessTripContent(businessTripEntity.getBusinessTripContent())
				.businessTripRequestDate(businessTripEntity.getBusinessTripRequestDate())
				.businessTripApproveDate(businessTripEntity.getBusinessTripApproveDate())
				.employee(businessTripEntity.getEmployee().toFKDTO(businessTripEntity.getEmployee())).build();
		return businessTripDTO;
	}
}
