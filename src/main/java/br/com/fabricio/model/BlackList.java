package br.com.fabricio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "blackList", catalog = "care")
public class BlackList implements Serializable{

	private static final long serialVersionUID = -1565602372749303557L;
	
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
