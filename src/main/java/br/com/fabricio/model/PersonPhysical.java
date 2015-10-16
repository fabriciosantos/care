package br.com.fabricio.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "person_physical", catalog = "care")
@PrimaryKeyJoinColumn(name = "id_Person")
public class PersonPhysical extends Person {
	
	@Column(name = "cpf", length = 11)
	private String cpf;

	@Column(name = "rg", length = 9)
	private String rg;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;

	public PersonPhysical() {
		// TODO Auto-generated constructor stub
	}
	public PersonPhysical(String cpf, String rg, Date dateOfBirth) {
		this.cpf = cpf;
		this.rg = rg;
		this.dateOfBirth = dateOfBirth;
	}
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
}
