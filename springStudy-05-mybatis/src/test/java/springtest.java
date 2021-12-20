import com.esb.dao.UserMapping;
import com.esb.dao.UserMappingImpl;
import com.esb.dao.UserMappingimplTo;
import com.esb.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-17 16:52
 **/
public class springtest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMappingImpl userMappingImpl = applicationContext.getBean("userMappingImpl", UserMappingImpl.class);

        List<User> userDaoList = userMappingImpl.getUserDaoList();
        for (User u :userDaoList) {
            System.out.println(u.toString());
        }

        userMappingImpl.insertUser(null);

        /*System.out.println("666666666666666666666666666");
        List<User> userDaoList2 = userMappingImpl.getUserDaoList2();
        for (User u :userDaoList2) {
            System.out.println(u.toString());
        }
        UserMappingimplTo userMappingimplTo = applicationContext.getBean("userMappingimplTo", UserMappingimplTo.class);

        System.out.println("666666666666666666666666666");
        List<User> userDaoList3 = userMappingimplTo.getUserDaoList();
        for (User u :userDaoList3) {
            System.out.println(u.toString());
        }*/
    }
}
