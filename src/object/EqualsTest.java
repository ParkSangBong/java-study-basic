package object;

class Student{
    int studentNum;
    String studentName;

    public Student(int studentNum, String studentName){
        this.studentNum = studentNum;
        this.studentName = studentName;
    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Student){
            Student std = (Student)obj;
            return this.studentNum == std.studentNum;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentNum;
    }
}

public class EqualsTest {

    public static void main(String[] args) {

        /*String str1 = new String("abc");
        String str2 = new String("abc");

        System.out.println(str1 == str2);       // == 는 메모리 위치를 비교
        System.out.println(str1.equals(str2));  //equals 메서드의 원형은 메모리를 비교 String 에서 재정의하여 문자열이 같은지를 비교하는데 사용하는것.

        Student Lee = new Student(100, "이순신");
        Student Lee2 = Lee;
        Student Shin = new Student(100, "이순신");

        System.out.println(Lee == Shin);
        System.out.println(Lee.equals(Shin));

        System.out.println(Lee);
        System.out.println(Lee.hashCode());
        System.out.println(Shin.hashCode());
        */

        Integer i1 = new Integer(100);
        Integer i2 = new Integer(100);

        System.out.println(i1.equals(i2));
        System.out.println(i1.hashCode());
        System.out.println(i2.hashCode());

        System.out.println(System.identityHashCode(i1));


    }

}
