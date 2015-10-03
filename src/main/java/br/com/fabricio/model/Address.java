package br.com.fabricio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adress", catalog = "care")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idAdress", unique = true, nullable = false)
	private Integer idAdress;

	@ManyToOne
	@JoinColumn(name="id_person")
	private Person person;
	
	@Column(name = "street", length = 100)
	private String street;

	@Column(name = "number", length = 10)
	private String number;

	@Column(name = "district", length = 50)
	private String district;

	@Column(name = "city", length = 50)
	private String city;
	
	@Column(name = "state", length = 50)
	public String state;

	public Integer getIdAdress() {
		return idAdress;
	}

	public void setIdAdress(Integer idAdress) {
		this.idAdress = idAdress;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
}
