package domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "planDetail")
public class PlanDetail {
	
	@Id
	@Column(name = "id_planDetail", nullable = false)
    private Integer id_planDetail;
	@Column(name = "nutrition", nullable = false)
    private String nutrition;
	@Column(name = "lodging", nullable = false)
    private String lodging;
	@Column(name = "transportation", nullable = false)
    private String transportation;
	@Column(name = "transfer", nullable = false)
    private Date transfer;
	@Column(name = "price", nullable = false)
    private Double price;
	@Column(name = "num_nights", nullable = false)
    private Integer num_nights;
	@Column(name = "num_days", nullable = false)
    private Integer num_days;
	@Column(name = "state", nullable = false)
    private String state;
	
    //id_plan
    //id_destination

}
