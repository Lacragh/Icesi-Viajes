package application.dto;

import application.domain.Client;
import application.domain.Plan;
import jakarta.persistence.Column;

import java.util.Date;

public class ReservationDTO {
	
	private Integer id_reservation;
    private Date reserved;
    private Long client;
    private Long plan;

}
