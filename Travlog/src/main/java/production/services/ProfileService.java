package production.services;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import production.dao.ProfileDao;
import production.entity.Profile;

@Path("/profile")
@RequestScoped
public class ProfileService {
	
	@Inject
	private ProfileDao profileDao;
	
	
	public ProfileService() {
		System.out.println("Profile Service Created!");
	}
	@Path("")
	@POST
	public Response saveNewProfile() {
		System.out.println("Method Called!");
		//
		//this.profileDao.persist(profile);
		return Response.ok().build();
	}
	
	@Path("")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String simpleGet() {
		return "hellow!";
	}
}
