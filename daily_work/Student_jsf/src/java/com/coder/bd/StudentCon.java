
package com.coder.bd;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class StudentCon {
    
    private Student stu;

    public Student getStu() {
        
        if(stu == null){
        stu = new Student();
        }
        
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

   
    
    
    
    
}
