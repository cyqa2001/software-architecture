package experiment5.dao;

import experiment5.domain.Student;
import experiment5.domain.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TeacherDao extends BaseDao{

    public void addTeacher(Teacher teacher) throws Exception {
        Connection conn = BaseDao.getConnection();
        String sql = "insert into teacher(id,name) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, teacher.getId());
        ps.setString(2, teacher.getName());

        int i = ps.executeUpdate();

        if(i == 1) {
            System.out.println("id是" + teacher.getId() + "，name是“" + teacher.getName() + "“的老师创建成功！");
        }

        ps.close();
        conn.close();
    }

    public void deleteTeacher(int id) throws SQLException {
        Connection conn = BaseDao.getConnection();
        String sql = "delete from teacher where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        int i = ps.executeUpdate();

        ps.close();
        conn.close();
    }

    public Teacher findTeacher(int id) throws SQLException {
        Connection conn = BaseDao.getConnection();
        String sql = "select * from teacher where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);

        ResultSet rs = ps.executeQuery();

        Teacher teacher = new Teacher();

        while (rs.next()) {
            teacher.setId(rs.getInt("id"));
            teacher.setName(rs.getString("name"));
        }

        ps.close();
        conn.close();

        return teacher;
    }

    public void updateTeacher(Teacher teacher) throws SQLException {
        Connection conn = BaseDao.getConnection();
        String sql = "update teacher set name = ? where id = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, teacher.getName());
        ps.setInt(2, teacher.getId());

        int i = ps.executeUpdate();

        ps.close();
        conn.close();

    }

}
