package de.tom.endres.se.home.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the gammu database table.
 * 
 */
@Entity
@NamedQuery(name="Gammu.findAll", query="SELECT g FROM Gammu g")
public class Gammu implements Serializable {
	private static final long serialVersionUID = 1L;

	private int version;

	public Gammu() {
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

}