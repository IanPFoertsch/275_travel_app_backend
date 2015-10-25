package production.dao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import production.entity.Profile;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class ProfileDao extends AbstractDao<Profile> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	@Inject
	private EntityManager entityManager;
	
	public ProfileDao() {
		super(Profile.class);
	}
	
	/**
	 * query the database to find a given identifier, return the associated profile 
	 * if it exists. Otherwise, throw an exception.
	 * @param userIdentifier
	 * @return
	 */
	public Profile getProfileByIdentifier(String userIdentifier) {
		String profileQueryString = "Select * from profiles where user_identifier = '" + userIdentifier + "'";
		return (Profile)  this.entityManager.createNativeQuery(profileQueryString, Profile.class).getSingleResult();
	}
	
	
}
