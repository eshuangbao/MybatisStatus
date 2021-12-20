import com.esb.service.userservice;
import com.esb.service.userserviceimpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-16 17:16
 **/
public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        userservice user = context.getBean("userserviceimpl", userservice.class);

        user.add();
    }
}
