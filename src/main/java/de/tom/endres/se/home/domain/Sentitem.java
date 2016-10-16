package de.tom.endres.se.home.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sentitems database table.
 * 
 */
@Entity
@Table(name="sentitems")
@NamedQuery(name="Sentitem.findAll", query="SELECT s FROM Sentitem s")
public class Sentitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private SentitemPK id;

	@Column(name="Class")
	private int class_;

	private String coding;

	@Lob
	private String creatorID;

	private Timestamp deliveryDateTime;

	private String destinationNumber;

	private Timestamp insertIntoDB;

	private int relativeValidity;

	private String senderID;

	private Timestamp sendingDateTime;

	private String SMSCNumber;

	private String status;

	private int statusError;

	@Lob
	private String text;

	@Lob
	private String textDecoded;

	private int tpmr;

	@Lob
	private String udh;

	private Timestamp updatedInDB;

	public Sentitem() {
	}

	public SentitemPK getId() {
		return this.id;
	}

	public void setId(SentitemPK id) {
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

	public String getCreatorID() {
		return this.creatorID;
	}

	public void setCreatorID(String creatorID) {
		this.creatorID = creatorID;
	}

	public Timestamp getDeliveryDateTime() {
		return this.deliveryDateTime;
	}

	public void setDeliveryDateTime(Timestamp deliveryDateTime) {
		this.deliveryDateTime = deliveryDateTime;
	}

	public String getDestinationNumber() {
		return this.destinationNumber;
	}

	public void setDestinationNumber(String destinationNumber) {
		this.destinationNumber = destinationNumber;
	}

	public Timestamp getInsertIntoDB() {
		return this.insertIntoDB;
	}

	public void setInsertIntoDB(Timestamp insertIntoDB) {
		this.insertIntoDB = insertIntoDB;
	}

	public int getRelativeValidity() {
		return this.relativeValidity;
	}

	public void setRelativeValidity(int relativeValidity) {
		this.relativeValidity = relativeValidity;
	}

	public String getSenderID() {
		return this.senderID;
	}

	public void setSenderID(String senderID) {
		this.senderID = senderID;
	}

	public Timestamp getSendingDateTime() {
		return this.sendingDateTime;
	}

	public void setSendingDateTime(Timestamp sendingDateTime) {
		this.sendingDateTime = sendingDateTime;
	}

	public String getSMSCNumber() {
		return this.SMSCNumber;
	}

	public void setSMSCNumber(String SMSCNumber) {
		this.SMSCNumber = SMSCNumber;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getStatusError() {
		return this.statusError;
	}

	public void setStatusError(int statusError) {
		this.statusError = statusError;
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

	public int getTpmr() {
		return this.tpmr;
	}

	public void setTpmr(int tpmr) {
		this.tpmr = tpmr;
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