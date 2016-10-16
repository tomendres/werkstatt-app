package de.tom.endres.se.home.domain;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the sentitems database table.
 * 
 */
@Embeddable
public class SentitemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int id;

	private int sequencePosition;

	public SentitemPK() {
	}
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSequencePosition() {
		return this.sequencePosition;
	}
	public void setSequencePosition(int sequencePosition) {
		this.sequencePosition = sequencePosition;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof SentitemPK)) {
			return false;
		}
		SentitemPK castOther = (SentitemPK)other;
		return 
			(this.id == castOther.id)
			&& (this.sequencePosition == castOther.sequencePosition);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.id;
		hash = hash * prime + this.sequencePosition;
		
		return hash;
	}
}