package production.services;

import javax.ejb.DependsOn;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import production.dao.ProfileDao;
import production.entity.Profile;


/**
 * ProfileService is an endpoint associated with saving new profiles, as well as updating information associated
 * with existing profiles.
 * @author Ian Foertsch
 * 10/24/15
 *
 */
@Path("/profile")
@DependsOn("ProfileDao")
@RequestScoped
public class ProfileService {
	
	@Inject
	private ProfileDao profileDao;
	
	
	
	/**
	 * saveNewProfile accepts a profile object, pushes it to the profileDAO
	 * and returns an "ok" response
	 * @param profile
	 * @return
	 */
	@Path("")
	@POST
	public Response saveNewProfile(Profile profile) {
		this.profileDao.persist(profile);
		return Response.status(Status.CREATED).build();
	}
	
	@Path("")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getProfileInfo(@QueryParam("userIdentifier") String userIdentifier) {
		System.out.println(userIdentifier);
		try {
			Profile userProfile = this.profileDao.getProfileByIdentifier(userIdentifier);
			return Response.ok(userProfile, MediaType.APPLICATION_JSON).build();
		}
		catch(NoResultException | NonUniqueResultException  e) {
			return Response.status(400).build();
		}
	}
}
