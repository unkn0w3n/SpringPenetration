package spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan
@PropertySource("classpath:myApp.properties")
public class MyConfig {
    @Bean
    @Scope("prototype")
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
