
package bean;

import entity.Student;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import service.StudentService;

@ManagedBean
@ViewScoped
public class StudentBeen {
    
    private Student student;
    private String[] courseCompleted;
    
    public void saveStu(){
    String cc = "";
        for (String s : courseCompleted) {
            cc += s + ", ";
        }
        student.setCompletedCourse(cc);
        student.setRegiDate(new Date());
        
        StudentService service = new StudentService();
        service.saveStudent(student);
        System.out.println("insert done");
        
        
    }

    public Student getStudent() {
        if(student == null){
        student = new Student();
        }
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String[] getCourseCompleted() {
        return courseCompleted;
    }

    public void setCourseCompleted(String[] courseCompleted) {
        this.courseCompleted = courseCompleted;
    }
    
    
}
