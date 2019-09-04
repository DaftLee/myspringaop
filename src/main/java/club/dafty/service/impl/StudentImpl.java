package club.dafty.service.impl;

import club.dafty.service.Student;
import org.springframework.stereotype.Component;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/9/4 16:52
 */
@Component
public class StudentImpl implements Student {

    public void say() {
        System.out.println("说话");
//        int a = 1/0;
    }
}
