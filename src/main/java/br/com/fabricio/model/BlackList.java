package br.com.fabricio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blackList", catalog = "care")
public class BlackList {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idBlakList", unique = true, nullable = false)
	private Integer idBlackList;

	//private PersonPhysical personPhysiscal;
	
	//private PersonLegal personLegal;
	
	public Integer getIdBlackList() {
		return idBlackList;
	}

	public void setIdBlackList(Integer idBlackList) {
		this.idBlackList = idBlackList;
	}

	

}
