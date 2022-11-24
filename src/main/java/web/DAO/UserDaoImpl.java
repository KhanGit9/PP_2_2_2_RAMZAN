package web.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.stereotype.Repository;
import web.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    LocalContainerEntityManagerFactoryBean entityManagerFactoryBean;

    @Override
    public void Add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void Remove(User user) {
        entityManager.remove(user);
    }

    @Override
    public void Update(User user) {
        entityManager.merge(user);
    }

    @Override
    public List<User> getAllUsers() {
        return entityManager.createQuery("SELECT User from User", User.class).getResultList();
    }

}
