package co.edu.icesi.viajes.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "plan")
public class Plan {
	
	@Id
	@Column(name = "id_plan", nullable = false)
    private Integer id_plan;
	@Column(name = "code", nullable = false)
    private String code;
	@Column(name = "name", nullable = false)
    private String name;
	@Column(name = "description", nullable = false)
    private String description;
	@Column(name = "num_people", nullable = false)
    private Integer num_people;
	@Column(name = "start_Date", nullable = false)
    private Date start_Date;
	@Column(name = "end_Date", nullable = false)
    private Date end_Date;
	@Column(name = "price", nullable = false)
    private Double price;
	@Column(name = "state", nullable = false)
    private String state;

}