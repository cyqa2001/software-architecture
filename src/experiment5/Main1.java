package experiment5;

import experiment5.domain.Student;
import experiment5.domain.Teacher;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * （2）第一个功能：使用JDBC创建id是1，name是“张三师”的老师；创建id是1，name是“张三”，导师是“张三师”的学生；
 *
 */
public class Main1 {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql:///lab5?useSSL=false&characterEncoding=UTF-8";
        String username = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, username, password);

        String sql = "insert into teacher(id,name) values(1,'张大师')";
        PreparedStatement ps = conn.prepareStatement(sql);
        int i = ps.executeUpdate();

        if(i == 1) {
            System.out.println("id是1，name是“张三师”的老师创建成功！" );
        }

        String sql1 = "insert into student(id,name,tutor) values(1,'张三','张三师')";
        PreparedStatement ps1 = conn.prepareStatement(sql1);
        i = ps1.executeUpdate();

        if(i == 1) {
            System.out.println("id是1，name是“张三”，导师是“张三师”的学生创建成功！");
        }




        ps.close();
        ps1.close();
        conn.close();


    }
}
