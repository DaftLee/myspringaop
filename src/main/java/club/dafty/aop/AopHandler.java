package club.dafty.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author leechengchao@foxmail.com
 * @version 1.0
 * @date 2019/9/4 16:53
 */
@Component
@Aspect //切面
public class AopHandler {

    /**
     * 切入点
     */
    @Pointcut("execution(* club.dafty.service.impl.StudentImpl.say(..))")
    public void pointCut(){}

    /**
     * 前置通知
     */
//    @Before(value = "execution(* club.dafty.service..*(..))")
    @Before(value = "pointCut()")
    public void beforeDo(){
        System.out.println("****说话前张嘴Before****");
    }

    /**
     * 后置通知
     */
    @AfterReturning(pointcut = "pointCut()")
    public void afterDo(){
        System.out.println("****说话后闭嘴AfterReturning****");
    }

    /**
     * 最终通知
     */
    @After(value = "pointCut()")
    public void afterNoMater(){
        System.out.println("*****不论成功与否最终执行After*******");
    }

    /**
     * 异常通知
     */
    @AfterThrowing(value = "pointCut()")
    public void afterThrowDo(){
        System.out.println("******说话失败走这里AfterThrowing*****");
    }

    /**
     * 环绕通知
     * @param proceedingJoinPoint
     * @throws Throwable
     */
    @Around(value = "pointCut()")
    public void aroundDo(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("******张嘴Around******");
        proceedingJoinPoint.proceed();
        System.out.println("******闭嘴Around******");
    }
}
