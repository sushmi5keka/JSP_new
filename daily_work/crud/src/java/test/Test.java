/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import entity.Student;
import service.StudentService;

public class Test {

    public static void main(String[] args) {
        StudentService service = new StudentService();
        Student student = new Student();
        student.setId(1);
        student.setName("Moly");
        student.setRound("Round-37");
        student.setCourse("ssc, hsc");
        student.setGender("female");
        service.saveOrUpdate(student);
    }
}
