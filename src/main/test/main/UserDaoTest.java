import hospitalServer.controller.UserController;
import hospitalServer.dao.UserDao;
import hospitalServer.bean.User;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @author: create by XiaoHan
 * @version: v1.0
 * @description: hospitalServer.bean
 * @date:2020/3/27
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    private  static final Logger LOG = Logger.getLogger(UserController.class);
    @Test
    public void showUsers() {
        int id = 1;
        List<User> user = userDao.showUser();
        System.out.println(user.get(0).getId() + ":" + user.get(0).getName());
        LOG.info("....==>"+user.get(0).getName());
    }
}