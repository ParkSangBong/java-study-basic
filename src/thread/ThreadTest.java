package thread;

class MyThread implements Runnable{

    public void run(){

        int i;

        for (i=0; i<201; i++){

            System.out.print(i + "\t");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}

public class ThreadTest {

    public static void main(String[] args) {

        System.out.println("start");
//Thread
//        MyThread thread1 = new MyThread();
//        MyThread thread2 = new MyThread();
//
//        thread1.start();
//        thread2.start();
//imp Runnable
//        MyThread runner1 = new MyThread();
//        Thread thread1 = new Thread(runner1);
//        thread1.start();
//
//        MyThread runner2 = new MyThread();
//        Thread thread2 = new Thread(runner2);
//        thread2.start();

        Thread t = Thread.currentThread();
        System.out.println(t);

        System.out.println("end");

    }

}
