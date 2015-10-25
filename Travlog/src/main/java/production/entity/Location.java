package production.entity;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;

import org.eclipse.persistence.oxm.annotations.XmlKey;

@XmlRootElement(name="Location")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@IdClass(LocationKey.class)
@Table(name = "locations") //maps to the locations database table
public class Location implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_identifier")
	@XmlID
	private String userIdentifier;
	
	@Id
	@Column(name = "record_date")
	@XmlKey
	private double recordDate;
	
	@XmlElement
	@Column(name = "location_x")
	private double locationX;
	
	@XmlElement
	@Column(name = "location_y")
	private double locationY;
	
	@XmlElement
	@Column(name = "mode")
	private String mode;
	
	@XmlElement
	@Column(name = "purpose")
	private String purpose;
	
	
	/**
	 * @return the locationX
	 */
	public double getLocationX() {
		return locationX;
	}
	/**
	 * @return the locationY
	 */
	public double getLocationY() {
		return locationY;
	}
	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}
	/**
	 * @return the purpose
	 */
	public String getPurpose() {
		return purpose;
	}
	
	/**
	 * @param locationX the locationX to set
	 */
	public void setLocationX(double locationX) {
		this.locationX = locationX;
	}
	/**
	 * @param locationY the locationY to set
	 */
	public void setLocationY(double locationY) {
		this.locationY = locationY;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}
	/**
	 * @param purpose the purpose to set
	 */
	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	/**
	 * @return the userIdentifier
	 */
	public String getUserIdentifier() {
		return userIdentifier;
	}
	/**
	 * @return the recordDate
	 */
	public double getRecordDate() {
		return recordDate;
	}
	/**
	 * @param userIdentifier the userIdentifier to set
	 */
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}
	/**
	 * @param recordDate the recordDate to set
	 */
	public void setRecordDate(double recordDate) {
		this.recordDate = recordDate;
	}
	
	
	
}
