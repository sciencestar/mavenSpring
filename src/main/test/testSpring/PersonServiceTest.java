package testSpring;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IPersonService;

public class PersonServiceTest {

    private BeanFactory factory = null;

    @Before
    public void before(){
        factory = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void testSpring(){
        IPersonService personService = (IPersonService) factory.getBean("personService");
        personService.processSave();
    }
}
