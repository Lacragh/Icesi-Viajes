package application.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "client")
public class Client {
	
	@Id
	@Column(name = "id_client", nullable = false)
    private Integer id_client;
	@Column(name = "first_name", nullable = false)
    private String first_name;
	@Column(name = "last_name", nullable = false)
    private String last_name;
	@Column(name = "id_number", nullable = false)
    private String id_number;
	@Column(name = "phone", nullable = false)
    private String phone;
	@Column(name = "mail", nullable = false)
    private String mail;
	@Column(name = "Gender", nullable = false)
    private String Gender;
	@Column(name = "birthdate", nullable = false)
    private Date birthdate;

}
