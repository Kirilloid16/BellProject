package ru.lukah.bellproject.DAO.User;


import org.springframework.stereotype.Repository;
import ru.lukah.bellproject.Model.Country;
import ru.lukah.bellproject.Model.User;
import ru.lukah.bellproject.Model.UserDocument;


import javax.persistence.EntityManager;
import javax.persistence.Query;
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
    public void post(User user) {
        entityManager.persist(user);
    }

    @Override
    public User update(User user) {
        return entityManager.merge(user);
    }

    @Override
    public List<User> list1(User user) {
        Query query;
        if((user.getFirstName()!=null)||(user.getLastName()!=null)||(user.getMiddleName()!=null)
                ||(user.getPosition()!=null)||(user.getUserDocument().getDocNumber()!=null)
                ||(user.getCountry().getCode()!=null)){
            query =entityManager.createQuery("select U.id,U.firstName,U.lastName,U.middleName,U.position from User U  where " +
                            "U.firstName =: firstName or U.lastName =: lastName or U.middleName= :middleName")
                    .setParameter("firstName",user.getFirstName()).setParameter("lastName",user.getLastName()).setParameter("middleName",user.getMiddleName());

//.setParameter("code",user.getCountry().getCode()).setParameter("docNumber",user.getUserDocument().getDocNumber()) or U.country.code =: code or U.country.code =: code " +
//                            "or U.userDocument.docNumber =: docNumber
        } else {
        query = entityManager.createQuery("select U.id,U.firstName,U.lastName,U.middleName,U.position from User U where U.office_id =: office_id")
                .setParameter("office_id",user.getOffice_id());
        }
        List<User> userList = query.getResultList();
        return userList;
    }

    @Override
    public void delete(Long id) {
        Query query = entityManager.createQuery("delete from User where id=:id").setParameter("id",id);
        query.executeUpdate();
    }


}
