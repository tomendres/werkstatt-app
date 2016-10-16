package de.tom.endres.se.home.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pbk database table.
 * 
 */
@Entity
@NamedQuery(name="Pbk.findAll", query="SELECT p FROM Pbk p")
public class Pbk implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	private int groupID;

	@Lob
	private String name;

	@Lob
	private String number;

	public Pbk() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getGroupID() {
		return this.groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}