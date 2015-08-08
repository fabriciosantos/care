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
@Table(name = "blackList", catalog = "care")
public class BlackList {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idBlakList", unique = true, nullable = false)
	private Integer idBlackList;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "person")
	private Person accuser;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "person")
	private Person accused;

	public Integer getIdBlackList() {
		return idBlackList;
	}

	public void setIdBlackList(Integer idBlackList) {
		this.idBlackList = idBlackList;
	}

	public Person getAccuser() {
		return accuser;
	}

	public void setAccuser(Person accuser) {
		this.accuser = accuser;
	}

	public Person getAccused() {
		return accused;
	}

	public void setAccused(Person accused) {
		this.accused = accused;
	}

}
