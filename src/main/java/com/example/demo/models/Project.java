package com.example.demo.models;



import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="projects")
public class Project {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long  id;
	

	@NotBlank(message="Missing name")
	private String name;
	

	@NotBlank(message="Missing description")
	private String description;
	
	
	
	@Column(name="start_date")
	@NotNull(message="Missing start date")
	private LocalDate startDate;
	

	@Column(name="end_date")
	private LocalDate endDate;


	@Enumerated(EnumType.STRING)
	private StatusProject status;
}
