package Homework;

import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private long phone;

    public Student() {}

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int studentId = scanner.nextInt();
            String name = scanner.next();
            String major = scanner.next();
            String phoneStr = scanner.next();

            long phone = Long.parseLong(phoneStr);

            Student student = new Student();
            student.setStudentId(studentId);
            student.setName(name);
            student.setMajor(major);
            student.setPhone(phone);

            students[i] = student;
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];

            String phoneString = "0" + Long.toString(s.getPhone());
            String formattedPhone = phoneString.substring(0, 3) + "-"
                    + phoneString.substring(3, 7) + "-"
                    + phoneString.substring(7);

            System.out.printf("%d번째 학생: %d %s %s %s\n",
                    (i + 1), s.getStudentId(), s.getName(), s.getMajor(), formattedPhone);
        }

        scanner.close();
    }
}