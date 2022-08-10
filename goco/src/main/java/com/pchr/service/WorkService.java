package com.pchr.service;

import java.time.LocalDateTime;
import java.util.List;

import com.pchr.dto.WorkDTO;

public interface WorkService {
	
	public List<WorkDTO> findAllByEmpNo();
	
	public List<WorkDTO> findAllByDay(LocalDateTime day);
	
	public void workSave(WorkDTO workDTO);
	
	public WorkDTO findByDayAndId(Long id);
	
	public void updateWork(WorkDTO workDTO);
	
	public void deleteWork(Long id);
	
	public List<WorkDTO> findAllWithoutDate();
	
	
	
}
