package production.services;

import javax.ejb.DependsOn;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import production.dao.LocationDao;
import production.entity.Location;
import production.entity.LocationCollection;

@Path("/location")
@DependsOn("LocationDao")
@RequestScoped
public class LocationService{

	@Inject
	private LocationDao locationDao;
	
	
	
	@Path("")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addLocation(Location location) {
		this.locationDao.persist(location);
		return Response.status(201).build();
	}
	
	@Path("")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public LocationCollection getLocationsForUser(@QueryParam("userIdentifier") String userIdentifier){ 
		System.out.println("Request Received for userId: " + userIdentifier);
		
		return this.locationDao.getAllLocationsForIdentifier(userIdentifier);
		
	
	}
}
