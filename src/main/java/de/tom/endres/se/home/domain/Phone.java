package de.tom.endres.se.home.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the phones database table.
 * 
 */
@Entity
@Table(name="phones")
@NamedQuery(name="Phone.findAll", query="SELECT p FROM Phone p")
public class Phone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String imei;

	private int battery;

	@Lob
	private String client;

	@Lob
	private String id;

	private Timestamp insertIntoDB;

	private String netCode;

	private String netName;

	private String receive;

	private int received;

	private String send;

	private int sent;

	private int signal;

	private Timestamp timeOut;

	private Timestamp updatedInDB;

	public Phone() {
	}

	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}

	public int getBattery() {
		return this.battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Timestamp getInsertIntoDB() {
		return this.insertIntoDB;
	}

	public void setInsertIntoDB(Timestamp insertIntoDB) {
		this.insertIntoDB = insertIntoDB;
	}

	public String getNetCode() {
		return this.netCode;
	}

	public void setNetCode(String netCode) {
		this.netCode = netCode;
	}

	public String getNetName() {
		return this.netName;
	}

	public void setNetName(String netName) {
		this.netName = netName;
	}

	public String getReceive() {
		return this.receive;
	}

	public void setReceive(String receive) {
		this.receive = receive;
	}

	public int getReceived() {
		return this.received;
	}

	public void setReceived(int received) {
		this.received = received;
	}

	public String getSend() {
		return this.send;
	}

	public void setSend(String send) {
		this.send = send;
	}

	public int getSent() {
		return this.sent;
	}

	public void setSent(int sent) {
		this.sent = sent;
	}

	public int getSignal() {
		return this.signal;
	}

	public void setSignal(int signal) {
		this.signal = signal;
	}

	public Timestamp getTimeOut() {
		return this.timeOut;
	}

	public void setTimeOut(Timestamp timeOut) {
		this.timeOut = timeOut;
	}

	public Timestamp getUpdatedInDB() {
		return this.updatedInDB;
	}

	public void setUpdatedInDB(Timestamp updatedInDB) {
		this.updatedInDB = updatedInDB;
	}

}