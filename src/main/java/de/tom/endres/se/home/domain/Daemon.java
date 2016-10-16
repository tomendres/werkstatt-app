package de.tom.endres.se.home.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the daemons database table.
 * 
 */
@Entity
@Table(name="daemons")
@NamedQuery(name="Daemon.findAll", query="SELECT d FROM Daemon d")
public class Daemon implements Serializable {
	private static final long serialVersionUID = 1L;

	@Lob
	@Id
	private String info;

	@Lob
	private String start;

	public Daemon() {
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getStart() {
		return this.start;
	}

	public void setStart(String start) {
		this.start = start;
	}

}