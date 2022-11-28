package experiment5;

import experiment5.dao.StudentDao;
import experiment5.dao.TeacherDao;
import experiment5.domain.Student;
import experiment5.domain.Teacher;

/**
 * （3）第三个功能：建立StudentDAO类和TeacherDAO类，
 *     其中StudentDAO负责对Student的增删查改
 *     (方法名依次为addStudent, deleteStudent, findStudent, updateStudent)，
 *     TeacherDAO负责对Teacher的增删查改
 *     (方法名依次是addTeacher, deleteTeacher, findTeacher, updateTeacher)，
 *     利用Student、Teacher、StudentDAO、TeacherDAO，
 *     创建id是3，name是“王五师”的老师；创建id是3，name是“王五”、导师是“王五师”的学生；
 */
public class Main3 {
    public static void main(String[] args) throws Exception {

        Teacher teacher = new Teacher();
        teacher.setId(3);
        teacher.setName("王五师");

        Student student = new Student();
        student.setId(3);
        student.setName("王五");
        student.setTutor("王五师");

        TeacherDao teacherDao = new TeacherDao();
        StudentDao studentDao = new StudentDao();

        teacherDao.addTeacher(teacher);
        studentDao.addStudent(student);
    }
}
