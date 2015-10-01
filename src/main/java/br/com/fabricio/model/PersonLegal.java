package br.com.fabricio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "personLegal", catalog = "care")
@PrimaryKeyJoinColumn(name = "idPerson")
public class PersonLegal extends Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idPersonLegal", unique = true, nullable = false)
	private int idPersonLegal;

	@Column(name = "cnpj")
	private String cnpj;

	@Column(name = "inscricaoEstadual")
	private String ie;

	private BlackList blackList;
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public BlackList getBlackList() {
		return blackList;
	}

	public void setBlackList(BlackList blackList) {
		this.blackList = blackList;
	}

	
	
}
