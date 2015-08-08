package br.com.fabricio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vacancy", catalog = "care")
public class Vacancy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idVacancy", unique = true, nullable = false)
	private Integer id;

	@Column(name = "description", length = 300)
	private String description;

	@OneToOne(fetch = FetchType.EAGER)
	private Adress adress;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

}
