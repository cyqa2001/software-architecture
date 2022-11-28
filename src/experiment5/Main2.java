package experiment5;

import experiment5.domain.Student;
import experiment5.domain.Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * 第二个功能：建立Student类和Teacher类，创建id是2，name是“李四师”的老师；创建id是2，name是“李四”、导师是“李四师”的学生；
 *
 */
public class Main2 {
    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher();
        teacher.setId(2);
        teacher.setName("李四师");

        Student student = new Student();
        student.setId(2);
        student.setName("李四");
        student.setTutor("李四师");


        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql:///lab5?useSSL=false&characterEncoding=UTF-8";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "insert into teacher(id,name) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, teacher.getId());
        ps.setString(2, teacher.getName());

        int i = ps.executeUpdate();

        if(i == 1) {
            System.out.println("id是2，name是“李四师”的老师创建成功！");
        }


        String sql1 = "insert into student(id,name,tutor) values(?,?,?)";
        PreparedStatement ps1 = conn.prepareStatement(sql1);
        ps1.setInt(1, student.getId());
        ps1.setString(2, student.getName());
        ps1.setString(3, student.getTutor());

        int i1 = ps1.executeUpdate();

        if(i1 == 1) {
            System.out.println("id是2，name是“李四”、导师是“李四师”的学生创建成功！");
        }


        ps.close();
        ps1.close();
        conn.close();
    }
}
