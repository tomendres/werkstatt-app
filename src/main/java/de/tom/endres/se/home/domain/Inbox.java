package de.tom.endres.se.home.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the inbox database table.
 * 
 */
@Entity
@NamedQuery(name="Inbox.findAll", query="SELECT i FROM Inbox i")
public class Inbox implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="Class")
	private int class_;

	private String coding;

	private String processed;

	private Timestamp receivingDateTime;

	@Lob
	private String recipientID;

	private String senderNumber;

	private String SMSCNumber;

	@Lob
	private String text;

	@Lob
	private String textDecoded;

	@Lob
	private String udh;

	private Timestamp updatedInDB;

	public Inbox() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
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

	public String getProcessed() {
		return this.processed;
	}

	public void setProcessed(String processed) {
		this.processed = processed;
	}

	public Timestamp getReceivingDateTime() {
		return this.receivingDateTime;
	}

	public void setReceivingDateTime(Timestamp receivingDateTime) {
		this.receivingDateTime = receivingDateTime;
	}

	public String getRecipientID() {
		return this.recipientID;
	}

	public void setRecipientID(String recipientID) {
		this.recipientID = recipientID;
	}

	public String getSenderNumber() {
		return this.senderNumber;
	}

	public void setSenderNumber(String senderNumber) {
		this.senderNumber = senderNumber;
	}

	public String getSMSCNumber() {
		return this.SMSCNumber;
	}

	public void setSMSCNumber(String SMSCNumber) {
		this.SMSCNumber = SMSCNumber;
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

	public Timestamp getUpdatedInDB() {
		return this.updatedInDB;
	}

	public void setUpdatedInDB(Timestamp updatedInDB) {
		this.updatedInDB = updatedInDB;
	}

}