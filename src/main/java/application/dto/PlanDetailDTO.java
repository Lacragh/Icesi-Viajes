package application.dto;

import java.util.Date;

import application.domain.Destination;
import application.domain.Plan;
import jakarta.persistence.Column;

public class PlanDetailDTO {
	
	private Integer id_planDetail;
    private String nutrition;
    private String lodging;
    private String transportation;
    private Date transfer;
    private Double price;
    private Integer num_nights;
    private Integer num_days;
    private String state;
    private Long plan;
    private Long destination;

}
