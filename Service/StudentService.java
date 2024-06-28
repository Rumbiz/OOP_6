package OOP5.Service;

import OOP5.Model.Student;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService extends UserService {

    public void addStudent(Student student) {
        addUser(student);
    }

    public void removeStudent(Student student) {
        removeUser(student);
    }

    public List<Student> getAllStudents() {
        return users.stream()
                    .filter(user -> user instanceof Student)
                    .map(user -> (Student) user)
                    .collect(Collectors.toList());
    }
}