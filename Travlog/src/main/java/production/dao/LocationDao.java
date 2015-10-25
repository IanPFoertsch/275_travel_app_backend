package production.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import production.entity.Location;
import production.entity.LocationCollection;
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class LocationDao extends AbstractDao<Location>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager entityManager;
	
	
	public LocationDao() {
		super(Location.class);
	}
	
	public LocationCollection getAllLocationsForIdentifier(String userIdentifier) {
		
		String queryString = "Select * from locations where user_identifier = '"
				+ userIdentifier + "'";
		Query query = this.entityManager.createNativeQuery(queryString, Location.class);

		@SuppressWarnings("unchecked")
		List<Location> locationList =(List<Location>) query.getResultList();
		
		return this.loadLocationListToCollection(locationList);
	
	}
	
	private LocationCollection loadLocationListToCollection(List<Location> locationList)
	{
		LocationCollection locationCollection = new LocationCollection();
		ArrayList<Location> locationsArray = new ArrayList<Location>(locationList);
		locationCollection.setLocations(locationsArray);
		
		return locationCollection;
	}
	
}
