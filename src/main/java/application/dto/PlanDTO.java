package application.dto;

import application.domain.Client;
import application.domain.User;
import jakarta.persistence.Column;

import java.util.Date;

public class PlanDTO {
	
	private Integer id_plan;
    private String code;
    private String name;
    private String description;
    private Integer num_people;
    private Date start_Date;
    private Date end_Date;
    private Double price;
    private String state;
    private Long client;
    private Long user;

}
