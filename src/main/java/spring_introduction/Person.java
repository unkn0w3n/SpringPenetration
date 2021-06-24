package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("personBean")
public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    public Person(){
//        System.out.println("PersonX bean is created");
//    }

    //@Autowired
    public Person(Pet pet){
        System.out.println("PersonY bean is created");
        this.pet = pet;
    }


    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setSurname(String surname) {
        System.out.println("Person set surname");
        this.surname = surname;
    }

    public void setAge(int age) {
        System.out.println("Person set Age");
        this.age = age;
    }

    //pet -> setPet
//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class person got Pet");
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
