package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {
    @Before("aop.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice(){
        System.out.println("[r] beforeGetLoggingBookAdvice: попытка получить книгу/журнал");
    }

    @Before("execution(* returnBook(..))")
    public void beforeReturnLoggingAdvice(){
        System.out.println("**-- beforeReturnBookAdvice: попытка ВЕРНУТЬ книгу");
    }
}
