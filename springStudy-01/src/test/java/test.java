import com.esb.Hello;
import com.esb.pojo.peopler;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: MybatisStatus
 * @description:
 * @author: Mr.Wang
 * @create: 2021-12-07 12:35
 **/
public class test {
    @Test
    public   void  hellotest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) applicationContext.getBean("Hello");
        Hello hello1 = applicationContext.getBean("Hello", Hello.class);
        peopler people = applicationContext.getBean("people", peopler.class);
        hello.hello();
        people.mycat();
        people.mydao();
    }
}
