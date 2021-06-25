package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary{

    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
    }

    public String returnBook(){
        System.out.println("Мы возвращаем книгу в uniLibrary");
        return "";
    }

    public void getMagazine(){
        System.out.println("Мы берем ЖУРНАЛ из UniLibrary");
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем ЖУРНАЛ в UniLibrary");
    }

    public void addBook(){
        System.out.println("Добавляем КНИГУ в UniLibrary");
    }

    public void addMagazine(){
        System.out.println("Добавляем ЖУРНАЛ в UniLibrary");
    }
}
