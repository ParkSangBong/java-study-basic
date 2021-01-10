package quiz;

import java.util.Scanner;

public class Quiz1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 두 수를 입력 하세요. ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(" 사칙연산 ( + - * / ) 중 하나를 선택하세요. ");
        char operator = scanner.next().charAt(0);

        int result = 0;

        if(operator == '+') {
            result = num1 + num2;
        }
        else if(operator == '-') {
            result = num1 - num2;
        }
        else if(operator == '*') {
            result = num1 * num2;
        }
        else if(operator == '/') {
            if(num2 == 0){
                System.out.println("0으로 나눌수 없습니다.");
                return;
            }
            else{
                result = num1 / num2;
            }
        }
        else {
            System.out.println("연산자 오류입니다");
            return;
        }

        System.out.println("결과 값은 " + result + "입니다");

    }

}
