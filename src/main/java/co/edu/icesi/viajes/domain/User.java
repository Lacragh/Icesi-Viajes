package co.edu.icesi.viajes.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
    private Integer id_user;
	@Column(name = "login", nullable = false)
    private String login;
	@Column(name = "passw", nullable = false)
    private String password;
	@Column(name = "first_name", nullable = true)
    private String first_name;
	@Column(name = "last_name", nullable = false)
    private String last_name;
	@Column(name = "num_id", nullable = false)
    private String num_id;
	@Column(name = "states", nullable = false)
    private String state;

	public User( String login, String password, String first_name, String last_name, String num_id, String state) {
		this.login = login;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.num_id = num_id;
		this.state = state;
	}

	public User() {

	}

	public Integer getId_user() {
		return id_user;
	}

	public void setId_user(Integer id_user) {
		this.id_user = id_user;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getNum_id() {
		return num_id;
	}

	public void setNum_id(String num_id) {
		this.num_id = num_id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}
