Немного переработанный код из OOP_5. Код немного приведён в соответствие нормам SOLID, в частности:
Single Responsibility Principle (SRP): Классы, такие как User,Student и т.д. , имеют четко определенные обязанности. Например, классы модели занимаются только хранением данных.
Open/Closed Principle (OCP): Классы, такие как User , разработаны таким образом, что их можно легко расширить, но модификация существующего кода не требуется. Например, создание новых подклассов Student и Teacher не требует изменений в базовом классе User .
Liskov Substitution Principle (LSP): Подклассы, такие как Student и Teacher, можно использовать взаимозаменяемо с их базовым классом User без нарушения функциональности программы.
Interface Segregation  представлен в UserView.
Dependency Inversion Principle (DIP): В коде видно, что вышеуровневые модули не зависят от низкоуровневых модулей напрямую; они взаимодействуют через "посредников"-абстракции. Например, контроллер взаимодействует с сервисами, а не напрямую с данными.


В то же время, есть и примеры возможных потенциальных улучшений, в основном связанных с DataService. Так, например, DataService не совсем соответствует SRP, т.к. занимается созданием разных сущностей. В идеале- разбить на более мелкие "Сервисы",пример таких сервисов (DataService => StudentService + TeacherService+ UserService - приложен в качестве черновика.
OCP  - в основном нарушения OCP сводятся к необходимости корректировать код при добавлении новых типов пользователей. Избежать этого можно "фабричным методом", например: 
public class UserFactory {

    public static User createUser(Type type, Integer id, String surname, String firstname, String patronymic) {
        switch (type) {
            case STUDENT:
                return new Student(id, surname, firstname, patronymic);
            case TEACHER:
                return new Teacher(id, surname, firstname, patronymic);
            default:
                throw new IllegalArgumentException("Неверный тип пользователя");
        }
    }
}
В таком случае расширять код станет немного проще.
