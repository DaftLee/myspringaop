package club.dafty.test;

import club.dafty.service.Student;
import club.dafty.service.impl.StudentImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/9/4 17:07
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestAop {
    @Autowired
    Student studentImpl;

    @Test
    public void myTest(){
        studentImpl.say();
    }
}
