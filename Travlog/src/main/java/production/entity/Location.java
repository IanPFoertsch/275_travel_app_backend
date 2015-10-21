package production.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Location")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
@Table(name = "locations") //maps to the locations database table
public class Location {

	
	@Id
	@NotNull
	@Column(name = "user_identifier")
	private String userIdentifier;
	
	@Column(name = "record_date")
	private double recordDate;
	@Column(name = "location_x")
	private double locationX;
	@Column(name = "location_y")
	private double locationY;
	@Column(name = "mode")
	private String mode;
	@Column(name = "purpose")
	private String purpose;
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
	
	
	
	
}
