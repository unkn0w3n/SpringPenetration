package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {
//    @Pointcut("execution(* get*())")
//    private void allGetMethods(){}
//
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("[r] beforeGetLoggingBookAdvice: попытка получить книгу/журнал");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetSecurityAdvice(){
//        System.out.println("[!] beforeGetSecurityAdvice: чекаем права");
//
//    }
//
//    @Before("execution(* returnBook(..))")
//    public void beforeReturnBookAdvice(){
//        System.out.println("**-- beforeReturnBookAdvice: попытка ВЕРНУТЬ книгу");
//    }
}
