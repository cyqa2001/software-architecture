package experiment5.dao;

import experiment5.domain.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDao extends BaseDao{

    public void addStudent(Student student) throws Exception {
        Connection conn = BaseDao.getConnection();
        String sql = "insert into student(id,name,tutor) values(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, student.getId());
        ps.setString(2, student.getName());
        ps.setString(3, student.getTutor());

        int i = ps.executeUpdate();

        if(i == 1) {
            System.out.println("id是" + student.getId() + "，name是“" + student.getName() + "“、导师是”" + student.getTutor() + "“的学生创建成功！");
        }

        ps.close();
        conn.close();

    }

    public void deleteStudent(int id) throws SQLException {
        Connection conn = BaseDao.getConnection();
        String sql = "delete from student where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        int i = ps.executeUpdate();

        ps.close();
        conn.close();
    }

    public Student findStudent(int id) throws SQLException {
        Connection conn = BaseDao.getConnection();
        String sql = "select * from student where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        Student student = new Student();

        while (rs.next()) {
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setTutor(rs.getString("tutor"));
        }

        ps.close();
        conn.close();

        return student;
    }

    public void updateStudent(Student student) throws SQLException {
        Connection conn = BaseDao.getConnection();
        String sql = "update student set name = ?, tutor = ? where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, student.getName());
        ps.setString(2, student.getTutor());
        ps.setInt(3, student.getId());

        int i = ps.executeUpdate();

        ps.close();
        conn.close();

    }



}
