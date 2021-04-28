package backend.eteupgrad.repository;

import backend.eteupgrad.model.User;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class UserRepository {

	@PersistenceUnit(unitName = "Backend")
	private EntityManagerFactory entityManagerFactory;

	public boolean register(User newUser) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		try {
			entityManager.persist(newUser);
			return true;

		} catch (Exception e) {

			System.out.println(e.getMessage());
			return false;
		}
	}
	public User isPresent(User name) {
		try {
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			TypedQuery<User> query = entityManager.createQuery("SELECT u FROM User u WHERE u.name = :name", User.class);
			query.setParameter("name", name);
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
