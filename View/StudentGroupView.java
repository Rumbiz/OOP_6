package OOP5.View;

import OOP5.Model.Student;
import OOP5.Model.StudentGroup;

public class StudentGroupView {
    public void sendOnConsole(StudentGroup studentGroup){
        System.out.println(studentGroup);
    }
    
    public void sendDetailedOnConsole(StudentGroup studentGroup){
        System.out.println("Student Group ID: " + studentGroup.getGroupId());
        System.out.println("Teacher: " + studentGroup.getTeacher());
        System.out.println("Students:");
        for (Student student : studentGroup.getStudentList()) {
            System.out.println("\t- " + student);
        }
    }
}