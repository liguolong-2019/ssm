import com.ssm.domain.User;
import com.ssm.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    @Test
    public void findAll(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        IAccountService as= (IAccountService) ac.getBean("accountService");

        User h=as.findByName("lili");
        System.out.println(h);
        List<User>  a=as.findAllUser();
        for (User t:a
        ) {
            System.out.println(t);
        }

    }
}
