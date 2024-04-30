package application.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "destination")
public class Destination {
	
	@Id
	@Column(name = "id_destination", nullable = false)
    private Integer id_destination;
	@Column(name = "code", nullable = false)
    private String code;
	@Column(name = "name", nullable = false)
    private String name;
	@Column(name = "description", nullable = false)
    private String description;
    @Column(name = "state", nullable = false)
    private String state;
    @Column(name = "destinationType", nullable = false)
    private DestinationType destinationType;
}
