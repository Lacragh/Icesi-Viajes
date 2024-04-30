package application.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO{
	
	private Integer id_client;
    private String first_name;
    private String last_name;
    private String id_number;
    private String phone;
    private String mail;
    private String Gender;
    private Date birthdate;

}