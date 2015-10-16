package br.com.fabricio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "phone", catalog = "care")
public class Phone implements Serializable{

	private static final long serialVersionUID = 1985058333591122464L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPhone", unique = true, nullable = false)
	private Integer idPhone;

	@ManyToOne
	@JoinColumn(name="id_person")
	private Person person;
	
	@Column(name = "number", length = 11)
	private String number;

	@Column(name = "type", length = 20)
	private String type;

	public Integer getIdPhone() {
		return idPhone;
	}

	public void setIdPhone(Integer idPhone) {
		this.idPhone = idPhone;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
