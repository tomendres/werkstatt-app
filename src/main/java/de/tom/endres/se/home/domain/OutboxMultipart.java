package de.tom.endres.se.home.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the outbox_multipart database table.
 * 
 */
@Entity
@Table(name="outbox_multipart")
@NamedQuery(name="OutboxMultipart.findAll", query="SELECT o FROM OutboxMultipart o")
public class OutboxMultipart implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OutboxMultipartPK id;

	@Column(name="Class")
	private int class_;

	private String coding;

	@Lob
	private String text;

	@Lob
	private String textDecoded;

	@Lob
	private String udh;

	public OutboxMultipart() {
	}

	public OutboxMultipartPK getId() {
		return this.id;
	}

	public void setId(OutboxMultipartPK id) {
		this.id = id;
	}

	public int getClass_() {
		return this.class_;
	}

	public void setClass_(int class_) {
		this.class_ = class_;
	}

	public String getCoding() {
		return this.coding;
	}

	public void setCoding(String coding) {
		this.coding = coding;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTextDecoded() {
		return this.textDecoded;
	}

	public void setTextDecoded(String textDecoded) {
		this.textDecoded = textDecoded;
	}

	public String getUdh() {
		return this.udh;
	}

	public void setUdh(String udh) {
		this.udh = udh;
	}

}