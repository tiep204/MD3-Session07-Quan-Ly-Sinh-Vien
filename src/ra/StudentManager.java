package ra;

import java.util.Scanner;

public class StudentManager {
    static Student[] arrStudent = new Student[1000];
    static int index = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("********************MENU********************");
            System.out.println("1.Hiển thị danh sách sinh viên.");
            System.out.println("2.Thêm mới sinh viên.");
            System.out.println("3.Update thông tin sinh viên theo id sinh viên.");
            System.out.println("4.Xóa sinh viên theo id");
            System.out.println("5.Thoát");
            System.out.println("Sự lựa chọn của bạn.");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    getAllStudent(sc);
                    break;
                case 2:
                    addStudent(sc);
                    break;
                case 3:
                    updateStudent(sc);
                    break;
                case 4:
                    deleteById(sc);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.err.println("Vui lòng nhập từ 1-5");
            }
        } while (true);
    }

    public static void getAllStudent(Scanner sc) {
        System.out.printf("%-5s %-15s %-5s %-10s %-5s %-10s \n", "id", "Name", "Sex", "className", "age", "address");
        for (int i = 0; i < index; i++) {
            arrStudent[i].displayData();
        }
    }

    public static void addStudent(Scanner sc) {
        System.out.println("Mời bạn nhập thông tin của sinh viên: " + index + 1);
        Student student = new Student();
        student.setStudentId(index + 1);
        student.inputData();
        arrStudent[index] = student;
        index++;
    }

    public static void updateStudent(Scanner sc) {
        System.out.println("Mời bạn nhập id sinh viên bạn muốn cập nhật: ");
        int id = Integer.parseInt(sc.nextLine());
        int indexStudent = -1;
        for (int i = 0; i < index; i++) {
            if (arrStudent[i].getStudentId() == id) {
                indexStudent = i;
                break;
            }
        }
        if (indexStudent != -1) {
            System.out.print("Mời bạn nhập tên sinh viên cần cập nhật:");
            String tenSV = sc.nextLine();
            if (!tenSV.isEmpty()) {
                arrStudent[indexStudent].setStudentName(tenSV);
            }
            System.out.print("Mời bạn nhập giới tính mà bạn muốn cập nhật: ");
            String sex = sc.nextLine();
            if (!sex.isEmpty()) {
                arrStudent[indexStudent].setSex(Boolean.parseBoolean(sex));
            }
            System.out.print("Mời bạn nhập tên lớp cần cập nhật: ");
            String className = sc.nextLine();
            if (!className.isEmpty()) {
                arrStudent[indexStudent].setClassName(className);
            }
            System.out.print("Mời bạn nhập tuổi sinh viên cần cập nhật: ");
            String age = sc.nextLine();
            if (!age.isEmpty()) {
                arrStudent[indexStudent].setAge(Integer.parseInt(age));
            }
            System.out.print("Mời bạn nhập địa chỉ cần cập nhật: ");
            String address = sc.nextLine();
            if (!address.isEmpty()) {
                arrStudent[indexStudent].setAddress(address);
            }
        } else {
            System.err.println("id sinh viên không tồn tại");
        }
    }

    public static void deleteById(Scanner sc) {
        System.out.println("Mời bạn nhập id sinh vien mà bạn cần xóa: ");
        int id = Integer.parseInt(sc.nextLine());
        int indexStudent = -1;
        for (int i = 0; i < index; i++) {
            if (arrStudent[i].getStudentId() == id) {
                indexStudent = i;
                break;
            }
        }
        if (indexStudent != -1) {
            for (int i = 0; i < index - 1; i++) {
                arrStudent[i] = arrStudent[i + 1];
            }
            arrStudent[index - 1] = null;
            index--;
            System.out.println("Thôn tin sinh viên đã được xóa");
        } else {
            System.err.println("Id sinh viên không tồn tại: ");
        }

    }
}