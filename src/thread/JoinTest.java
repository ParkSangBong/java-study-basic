package thread;

public class JoinTest extends Thread{

    int start;
    int end;
    int total;

    public JoinTest(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run(){
        int i;
        for (i=start; i<=end; i++){
            total += i;
        }
    }

    public static void main(String[] args) {

        JoinTest joinTest1 = new JoinTest(1, 50);
        JoinTest joinTest2 = new JoinTest(51, 100);

        joinTest1.start();
        joinTest2.start();

        try {
            joinTest1.join();
            joinTest2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int total = joinTest1.total + joinTest2.total;
        System.out.println("joinTest1.total = " + joinTest1.total);
        System.out.println("joinTest2.total = " + joinTest2.total);

        System.out.println(total);

    }

}
