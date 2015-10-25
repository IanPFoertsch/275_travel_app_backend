package production.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Embeddable
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "LocationKey")
public class LocationKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final static double SIGMA = .00001;
	
	
	@XmlElement
	@Column(name= "user_identifier")
	private String userIdentifier;
	
	
	@XmlElement
	@Column(name = "record_date")
	private double recordDate;

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
	
	@Override
	public boolean equals(Object object) {
		try {
			LocationKey otherKey = (LocationKey) object;
			if((Math.abs((otherKey.getRecordDate() - this.getRecordDate())) < SIGMA) &&
					otherKey.getUserIdentifier().equals(this.getUserIdentifier()))
				return true;
			else 
				return false;
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public int hashCode() {
		return (int) this.recordDate + this.getUserIdentifier().hashCode();
	}
	
	
}
