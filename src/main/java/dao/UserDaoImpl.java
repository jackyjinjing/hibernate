package dao;

import domain.User;
import org.hibernate.Session;
import utils.HibernateUtil;

import java.util.List;

/**
 * Created by jacky on 16/7/16.
 */

public class UserDaoImpl implements UserDao {



    public User save(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(user);
        session.getTransaction().commit();

        return user;
    }

    public User findBy(int id) {
        String sql = "select * from user where id="+id;
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        List<User> users = session.createSQLQuery(sql).addEntity(User.class).list();
        session.getTransaction().commit();

        return users.get(0);
    }
}
