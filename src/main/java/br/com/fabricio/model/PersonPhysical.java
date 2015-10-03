package br.com.fabricio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "person_physical", catalog = "care")
@PrimaryKeyJoinColumn(name = "id_Person")
public class PersonPhysical extends Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idPersonPhysical", unique = true, nullable = false)
	private int idPersonPhysical;
	
	@Column(name = "cpf", length = 11)
	private String cpf;

	@Column(name = "rg", length = 9)
	private String rg;

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
}
