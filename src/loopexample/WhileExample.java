package loopexample;

import java.util.Scanner;

public class WhileExample {

    public static void main(String[] args) {

        /*
        int num = 1;
        int sum = 0;

        while(num <= 10){
            sum += num;
            num++;
        }

        System.out.println(sum);
        System.out.println(num);
        System.out.println("10까지의 합은 " + sum + "입니다.");
        */

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int sum = 0;

        while(input != 0){
            sum += input;
            input = scanner.nextInt();
        }

        System.out.println(sum);

    }

}
