package de.tom.endres.se.home.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;


/**
 * The persistent class for the outbox database table.
 * 
 */
@Entity
@Table(name = "outbox")
public class Outbox implements Serializable {

	public enum DeliveryReport { DEFAULT, YES, NO}

	public enum Coding { Default_No_Compression, Unicode_No_Compression, eight_bit, Default_Compression, Unicode_Compression }

	public enum Multipart {TRUE, FALSE}

	private static Timestamp getCurrentTime() {
		Date date = new Date();
		return new Timestamp(date.getTime());
	}


	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="Class")
	private int class_ = -1;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "ENUM('Default_No_Compression', 'Unicode_No_Compression', '8bit', 'Default_Compression', 'Unicode_Compression') DEFAULT 'Default_No_Compression'")
	private Coding coding = Coding.Default_No_Compression;

	@Lob
	private String creatorID = "Werkstatt App";

	@Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('default', 'yes', 'no') DEFAULT 'default'")
	private DeliveryReport deliveryReport = DeliveryReport.DEFAULT;

	private String destinationNumber;

	private Timestamp insertIntoDB;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "NUM('false', 'true') DEFAULT 'false'")
	private Multipart multiPart = Multipart.FALSE;

	private int relativeValidity = -1;

	private int retries;

	private Time sendAfter = new Time(0,0,0);

	private Time sendBefore = new Time(23,59,59);

	private String senderID;

	private Timestamp sendingDateTime;

	private Timestamp sendingTimeOut = getCurrentTime();

	@Lob
	private String text;

	@Lob
	private String textDecoded;

	@Lob
	private String udh;

	private Timestamp updatedInDB;

	public Outbox() {
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

	public Coding getCoding() {
		return this.coding;
	}

	public void setCoding(Coding coding) {
		this.coding = coding;
	}

	public String getCreatorID() {
		return this.creatorID;
	}

	public void setCreatorID(String creatorID) {
		this.creatorID = creatorID;
	}

	public DeliveryReport getDeliveryReport() {
		return this.deliveryReport;
	}

	public void setDeliveryReport(DeliveryReport deliveryReport) {
		this.deliveryReport = deliveryReport;
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

	public Multipart getMultiPart() {
		return this.multiPart;
	}

	public void setMultiPart(Multipart multiPart) {
		this.multiPart = multiPart;
	}

	public int getRelativeValidity() {
		return this.relativeValidity;
	}

	public void setRelativeValidity(int relativeValidity) {
		this.relativeValidity = relativeValidity;
	}

	public int getRetries() {
		return this.retries;
	}

	public void setRetries(int retries) {
		this.retries = retries;
	}

	public Time getSendAfter() {
		return this.sendAfter;
	}

	public void setSendAfter(Time sendAfter) {
		this.sendAfter = sendAfter;
	}

	public Time getSendBefore() {
		return this.sendBefore;
	}

	public void setSendBefore(Time sendBefore) {
		this.sendBefore = sendBefore;
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

	public Timestamp getSendingTimeOut() {
		return this.sendingTimeOut;
	}

	public void setSendingTimeOut(Timestamp sendingTimeOut) {
		this.sendingTimeOut = sendingTimeOut;
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