package dao;

import domain.User;
import org.junit.Test;

/**
 * Created by jacky on 16/7/16.
 */
public class UserDaoImplTest {

    @Test
    public void testSave(){
        UserDao userDao = new UserDaoImpl();
        User user = new User();
        user.setName("jackyjinjing");
        user.setPassword("j123456");
        userDao.save(user);
    }

    @Test
    public void testQuery() throws Exception {
        UserDao userDao = new UserDaoImpl();
        User user = userDao.findBy(2);
        System.out.println(user);
    }
}
