package ra;

import java.util.Scanner;

public class Student {
    private int studentId;
    private String studentName;
    private boolean sex;
    private String className;
    private int age;
    private String address;

    public Student() {
    }

    public Student(int studentId, String studentName, boolean sex, String className, int age, String address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.sex = sex;
        this.className = className;
        this.age = age;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên sv: ");
        studentName = sc.nextLine();
        System.out.println("Mời bạn nhập vào giới tính sv: ");
        sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Mời bạn nhập vào tên lớp sv: ");
        className = sc.nextLine();
        System.out.println("Mời bạn nhập vào tuổi sv: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Mời bạn nhập vào địa chỉ sv: ");
        address = sc.nextLine();
    }
    public void displayData(){
        System.out.printf("%-5d %-15s %-5b %-10s %-5d %-10s \n",studentId,studentName,sex,className,age,address);
    }
}
