package kaggle.cr.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "crime_data_1")
public class KaggleData {
	
	
	@Id
	private Long drNo;
	
	private LocalDateTime dateReported;
	
	private LocalDateTime dateOccured;
	
	private LocalDateTime timeOccured;
	
	private String area;
	
	private String areaName;
	
	private String reportDistrictNo;
	
	
}
