package application.dto;

import application.domain.Client;
import application.domain.Plan;
import jakarta.persistence.Column;

import java.util.Date;

public class SaleDTO {
	
	private Integer id_sale;
    private Date sold;
    private Long client;
    private Long plan;

}
