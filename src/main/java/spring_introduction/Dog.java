package spring_introduction;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


//@Component
//@Scope("singleton")
//@Scope("prototype")
public class Dog implements Pet{
    private String name;

    public Dog(){
        System.out.println("Dog bean is created");
    }

    @PostConstruct
    public void init(){
        System.out.println("[+] Class dog init method");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("[-] Class dog destroyed");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
