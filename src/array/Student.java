package array;

import java.util.ArrayList;

public class Student {

    int studentID;
    String studentName;

    ArrayList<Subject> subjects;

    public Student(int studentID, String studentName){

        this.studentID = studentID;
        this.studentName = studentName;

        subjects = new ArrayList<Subject>();

    }

    public void addSubject(String name, int score){

        Subject subject = new Subject(name, score);
        subjects.add(subject);

    }

    public void showStudentInfo(){

        int total = 0;

        for (Subject subject :
                subjects) {

            total += subject.getScore();
            System.out.println(studentName + " 학생의 " + subject.getName() + " 과목의 성적은 " + subject.getScore() + "점 입니다. ");

        }

        System.out.println(studentName + " 학생의 총점은 " + total + " 점 입니다. ");

    }

}
