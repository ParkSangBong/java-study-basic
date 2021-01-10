package quiz;

public class MyDateTest {

    public static void main(String[] args) {

        MyDate date1 = new MyDate(10, 12, 2020);
        MyDate date2 = new MyDate(10, 12, 2020);

        System.out.println(date1.equals(date2));

    }

}
