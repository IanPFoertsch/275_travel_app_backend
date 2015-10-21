package production.services;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import production.dao.ProfileDao;
import production.entity.Profile;

@Path("/profile")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProfileService {
	
	@Inject
	private ProfileDao profileDao;
	
	@Path("")
	@POST
	public Response saveNewProfile(Profile profile) {
		this.profileDao.persist(profile);
		return Response.ok().build();
	}
}
