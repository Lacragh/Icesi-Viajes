package domain;


import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservation {
	
	@Id
	@Column(name = "id_reservation", nullable = false)
    private Integer id_reservation;
	@Column(name = "reserved", nullable = false)
    private Date reserved;
	
    //id_client
    //id_plan

}
