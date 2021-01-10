package thread;

import java.util.ArrayList;

class FastLibrary {

    public ArrayList<String> books = new ArrayList<String>();

    public FastLibrary(){

        books.add("태백산맥 1");
        books.add("태백산맥 2");
        books.add("태백산맥 3");

    }

    public synchronized String lendBook() throws InterruptedException {
        Thread thread = Thread.currentThread();
        while (books.size() == 0){
            System.out.println(thread.getName() + " waiting start ");
            wait();
            System.out.println(thread.getName() + " waiting end ");
        }
        String title = books.remove(0);
        System.out.println(thread.getName() + " : " + title + " lend");
        return title;
    }

    public synchronized void returnBook(String title){
        Thread thread = Thread.currentThread();
        books.add(title);
        notifyAll();
        System.out.println(thread.getName() + " : " + title + " return");
    }

}

class Student extends Thread{

    public void run(){

        try {
            String title = LibraryMain.library.lendBook();
            if(title == null){
                return;
            }
            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

public class LibraryMain {

    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();

        student1.start();
        student2.start();
        student3.start();
        student4.start();
        student5.start();
        student6.start();

    }

}
