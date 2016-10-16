package de.tom.endres.se.home.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pbk_groups database table.
 * 
 */
@Entity
@Table(name="pbk_groups")
@NamedQuery(name="PbkGroup.findAll", query="SELECT p FROM PbkGroup p")
public class PbkGroup implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Lob
	private String name;

	public PbkGroup() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}