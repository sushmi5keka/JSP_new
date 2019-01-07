package service;

import entity.Student;
import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class StudentService {

    public static void StudentService(Student student) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.saveOrUpdate(student);
        System.out.println("success");
        tr.commit();

    }

    public static void delete(Student student) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(student);
        System.out.println("Delete success");
        tr.commit();

    }

    @Transactional
    public static Student getById(int id) {
        Student student = new Student();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction tr = session.beginTransaction();
            student = (Student) session.get(Student.class, id);
            System.out.println("success");
            tr.commit();
        } catch (Exception e) {
            System.out.println("somthing worng");
        }
        return student;
    }

    @Transactional
    public static List<Student> getList() {
        List<Student> students = new ArrayList<>();
        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.getCurrentSession();
            Transaction tr = session.beginTransaction();
            students = session.createQuery("From Student").list();
            tr.commit();
        } catch (Exception e) {
            System.out.println("somthing worng");
        }
        return students;
    }

}
