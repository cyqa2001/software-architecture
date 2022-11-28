package experiment3.objectAdapter;

import experiment3.pojo.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        int id = 0;
        String name;
        Scanner scanner = new Scanner(System.in);

        int flag;

        StudentAdapter studentAdapter = new StudentAdapter();

        while (true) {
            flag = 0;
            System.out.print("请输入学号（输入-1结束）：");
            id = scanner.nextInt();
            if (id == -1) break;
            for (Student student : students) {
                if (id == student.getId()) {
                    System.out.println("该学号已存在！");
                    flag = 1;

                }
            }
            if (flag == 0) {
                System.out.print("请输入姓名：");
                name = scanner.next();
                students.add(new Student(id,name));
                students = studentAdapter.sortStudent(students);
                for (Student student : students) {
                    System.out.println(student.getId() + ":" + student.getName());
                }
                System.out.println("---------------------------");
            }

        }

    }
}
