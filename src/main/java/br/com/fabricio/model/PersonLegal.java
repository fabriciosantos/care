package br.com.fabricio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "person_legal", catalog = "care")
@PrimaryKeyJoinColumn(name = "id_Person")
public class PersonLegal extends Person {
	

	@Column(name = "cnpj")
	private String cnpj;

	@Column(name = "inscricao_estadual")
	private String ie;

	@Column(name = "inscricao_municipal")
	private String im;

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

	public String getIm() {
		return im;
	}

	public void setIm(String im) {
		this.im = im;
	}
		
}
