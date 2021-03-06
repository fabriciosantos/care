package br.com.fabricio.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


@Entity
@Table(name = "person", catalog = "care")
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements Serializable{

	private static final long serialVersionUID = -4907453959655547665L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPerson", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "name", length = 100)
	private String name;

	@Column(name = "email", length = 50)
	private String email;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@Column(name = "enable")
	private boolean enable;
	
	public Person() {
	}
	
	

	public Person(String name, String email, String login, String password,
			boolean enable) {
		this.name = name;
		this.email = email;
		this.login = login;
		this.password = password;
		this.enable = enable;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

}
