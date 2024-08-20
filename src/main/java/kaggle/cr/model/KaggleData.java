package kaggle.cr.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "crime_data_1")
@Data
public class KaggleData {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long drNo;
	
	private LocalDateTime dateReported;
	
	private LocalDateTime dateOccured;
	
	private LocalDateTime timeOccured;
	
	private String area;
	
	private String areaName;
	
	private String reportDistrictNo;
	
	
	
}
