package OOP5;

import OOP5.Controller.Controller;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        // Создаем студентов
        controller.createStudent("Иванов", "Иван", "Иванович");
        controller.createStudent("Петров", "Петр", "Петрович");
        controller.createStudent("Сидоров", "Сидор", "Сидорович");

        // Создаем учителей
        controller.createTeacher("Смирнов", "Александр", "Александрович");

        // Выводим всех студентов на консоль
        controller.getAllStudents();

        // Выводим всех учителей на консоль
        controller.getAllTeachers();

        // Создаем учебную группу
        controller.createStudentGroup(1, Arrays.asList(1, 2, 3));

        // Выводим информацию о созданной учебной группе
        controller.printStudentGroup();
    }
}