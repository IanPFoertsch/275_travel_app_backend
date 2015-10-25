package production.entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "LocationCollection")
@XmlAccessorType(XmlAccessType.FIELD)
public class LocationCollection {
	
	@XmlElement
	private ArrayList<Location> locations;

	/**
	 * @return the locations
	 */
	public ArrayList<Location> getLocations() {
		return locations;
	}

	/**
	 * @param locations the locations to set
	 */
	public void setLocations(ArrayList<Location> locations) {
		this.locations = locations;
	}
	
	
}
