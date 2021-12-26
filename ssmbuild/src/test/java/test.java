import com.esb.pojo.Books;
import com.esb.service.BookserviceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-21 14:24
 **/
public class test {
    @Test
    public   void  hellotest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        BookserviceImpl hello = (BookserviceImpl) applicationContext.getBean("BookserviceImpl");
        List<Books> books = hello.queryAllbook();
        for (Books s: books ) {
            System.out.println(s);
        }
    }
}
