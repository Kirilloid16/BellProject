package ru.lukah.bellproject.DAO.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.lukah.bellproject.Model.Country;
import ru.lukah.bellproject.Model.DocumentType;
import ru.lukah.bellproject.Model.User;
import ru.lukah.bellproject.Model.UserDocument;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
    private final EntityManager entityManager;

    public UserDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> list() {
        TypedQuery<User> query = entityManager.createQuery("Select U from User U",User.class);
        List<User> list = query.getResultList();
        return list ;
    }

    @Override
    public User getById(Long id) {
        return entityManager.find(User.class,id);
    }

    @Override
    public void User(User userUpdate) {

    }


}
