package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Book book = context.getBean("book", Book.class);

        UniLibrary uniLibrary = context.getBean("libraryBean", UniLibrary.class);
        uniLibrary.getBook();
        uniLibrary.getMagazine();
//        //uniLibrary.returnBook();
//        System.out.println("\n\n");

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();
//        //schoolLibrary.returnBook();

        context.close();
    }
}
