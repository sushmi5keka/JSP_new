/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarvice;

import entity.Student;
import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class StudentService {
    public static void save(Student student){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.save(student);
        tr.commit();
    }
    
    
    public static void delete(Student student){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Transaction tr = session.beginTransaction();
        session.delete(student);
        tr.commit();
    }
    
    
    public static Student getById(int id){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        Student student =(Student) session.get(Student.class, id);
        Transaction tr = session.beginTransaction();
        tr.commit();
        return student;
    }
    
     public static List<Student> getList(){
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        List<Student> list = session.createCriteria(Student.class).list();
        Transaction tr = session.beginTransaction();
        tr.commit();
        return list;
    }
}
