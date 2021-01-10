package arrayquiz;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;

    ArrayList<Book> readBook;

    public Student(int studentID, String studentName){

        this.studentID = studentID;
        this.studentName = studentName;

        readBook = new ArrayList<Book>();

    }

    public void addBook(String name){

        Book book = new Book(name);
        readBook.add(book);

    }

    public void showStudentInfo(){

        System.out.print(studentName + " 학생이 읽은 책은 : ");

        for (Book book :
                readBook) {

            System.out.print(book.getName() + " ");

        }

        System.out.println("입니다");

    }

}
