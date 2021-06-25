package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AllWithoutOneAspect {
//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethodsFromUnilibrary(){}
//
//    @Pointcut("execution(* aop.UniLibrary.returnBook(..))")
//    private void returnBookFromUnilibrary() {}
//
//    //Поинткат: запускаем когда тригернулся любой метод кроме Ретурна
//    @Pointcut("allMethodsFromUnilibrary() && !returnBookFromUnilibrary()")
//    private void allMethodsFromUnilibraryExceptReturnBook(){}
//
//
//    @Before("allMethodsFromUnilibrary()")
//    public void beforeAllMethodsAdvice(){
//        System.out.println("[:)] beforeAllMethodsAdvice: логгируем перед всем");
//    }
//
//    @Before("allMethodsFromUnilibraryExceptReturnBook()")
//    public void beforeAllMethodsExceptReturnAdvice(){
//        System.out.println("[!] beforeAllMethodsExceptReturnAdvice: логгируем X!");
//    }

}

