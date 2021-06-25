package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SomeSecurityAspect {
//    @Pointcut("execution(* aop.UniLibrary.add*(..))")
//    private void allAddMethods(){}
//
//    @Pointcut("execution(* aop.UniLibrary.get*(..))")
//    private void allGetMethods(){}
//
//    @Pointcut("execution(* aop.UniLibrary.return*(..))")
//    private void allReturnMethods(){}
//
//    @Pointcut("allGetMethods() || allReturnMethods()")
//    private void getAndReturnMethods(){}
//
//
//    @Before("allAddMethods()")
//    public void beforeAddLoggingAdvice(){
//        System.out.println("[L] beforeAddLoggingAdvice: Логируем событие ДОБАВЛЕНИЯ книги/журнала");
//    }
//
//    @Before("allGetMethods()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("[G] beforeGetLoggingAdvice: Логируем событие ПОЛУЧЕНИЯ книги/журнала");
//    }
//
//    @Before("allReturnMethods()")
//    public void beforeReturnMethods(){
//        System.out.println("[R] beforeReturnMethods: Логируем событие ВОЗВРАТА книги/журнала");
//    }
//
//    @Before("getAndReturnMethods()")
//    public void beforeGetOrReturnMethods(){
//        System.out.println("[G or R] Logging Get or Return methods");
//    }

}
