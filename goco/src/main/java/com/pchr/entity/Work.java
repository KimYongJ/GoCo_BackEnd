package com.pchr.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Work {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "work_id")
	private Long workId;
	
	@Column(name = "work_title")
	private String workTitle;
	
	@Column(name = "work_content")
	private String workContent;
	
	@Column(name = "work_start_date")
	private LocalDateTime workStartDate;
	
	@Column(name = "work_end_date")
	private LocalDateTime workEndDate;
	
	@Column(name = "work_type")
	private boolean workType;
	
	

	
	
}