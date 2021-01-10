package array;

public class ArrayQuiz {

    public static void main(String[] args) {

        char[] alpabets = new char[26];
        char ch = 'A';

        for (int i=0; i<alpabets.length; i++){

            alpabets[i] = ch++;

        }

        for (int i=0; i<alpabets.length; i++){

            System.out.println(alpabets[i] + " , " + (int)alpabets[i]);

        }

    }

}
