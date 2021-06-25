package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("------------------------------------------");
    }

    public String returnBook(){
        System.out.println("Мы возвращаем книгу в uniLibrary");
        System.out.println("------------------------------------------");
        return "";
    }

    public void getMagazine(){
        System.out.println("Мы берем ЖУРНАЛ из UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем ЖУРНАЛ в UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void addBook(String personName, Book book){
        System.out.println("Добавляем КНИГУ в UniLibrary");
        System.out.println("------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Добавляем ЖУРНАЛ в UniLibrary");
        System.out.println("------------------------------------------");
    }
}
