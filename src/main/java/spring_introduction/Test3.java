package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//FIRST VERSION
//        Pet pet = new Dog();
//        Person person = new Person(pet);
//        person.callYourPet();

//Second VERSION
//        Pet pet = context.getBean("myPet", Pet.class);
//        Person person = new Person(pet);
//        person.callYourPet();


//DEPENDENCY INVERSION VARIANT
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        person.getSurname();
        person.getAge();

        context.close();



    }
}
