package OOP5.Service;

import OOP5.Model.Teacher;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherService extends UserService {

    public void addTeacher(Teacher teacher) {
        addUser(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        removeUser(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return users.stream()
                    .filter(user -> user instanceof Teacher)
                    .map(user -> (Teacher) user)
                    .collect(Collectors.toList());
    }
}