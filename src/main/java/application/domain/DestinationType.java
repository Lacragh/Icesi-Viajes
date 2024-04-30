package application.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "destinationType")
public class DestinationType {
	
	@Id
	@Column(name = "id_desType", nullable = false)
    private Long idDesType;
	@Column(name = "code", nullable = false)
	private String code;
	@Column(name = "name", nullable = false)
	private String name;
	@Column(name = "description", nullable = false)
	private String description;
	@Column(name = "state", nullable = false)
	private String state;

}
