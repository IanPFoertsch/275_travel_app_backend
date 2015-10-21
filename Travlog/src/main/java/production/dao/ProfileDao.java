package production.dao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import javax.persistence.EntityManager;

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
	
	
}
