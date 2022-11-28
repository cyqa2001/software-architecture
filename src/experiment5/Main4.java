package experiment5;

import experiment5.domain.Student;
import experiment5.domain.Teacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;

/**
 * （5）利用Hibernate，创建id是5，name是“田七师”的老师；创建id是5，name是“田七”、导师是“田七师”的学生；
 */
public class Main4 {
    public static void main(String[] args) {
        //加载 Hibernate 核心配置文件
        Configuration configuration = new Configuration().configure();
        //创建一个 SessionFactory 用来获取 Session 连接对象
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取session 连接对象
        Session session = sessionFactory.openSession();
        //开始事务
        Transaction transaction = session.beginTransaction();
        //创建实体类对象
        Teacher teacher = new Teacher();
        teacher.setId(5);
        teacher.setName("田七师");
        Student student = new Student();
        student.setId(5);
        student.setName("田七");
        student.setTutor("田七师");

        //向 user 表中插入数据,返回值为新增数据的主键 id
        Serializable save = session.save(teacher);

        System.out.println("id是5，name是“田七师”的老师创建成功！");

        System.out.println(save);

        Serializable save1 = session.save(student);

        System.out.println("id是5，name是“田七”、导师是“田七师”的学生创建成功！");

        System.out.println(save1);
        //提交事务
        transaction.commit();
        //释放资源
        session.close();
        sessionFactory.close();
    }
}
