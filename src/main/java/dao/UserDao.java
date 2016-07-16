package dao;

import domain.User;

/**
 * Created by jacky on 16/7/16.
 */
public interface UserDao {

    User save(User user);

    User findBy(int id);

}
