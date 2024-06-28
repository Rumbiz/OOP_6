package OOP5.Model;
//Соответствует S( Единственная ответственность- только хранение данных о пользователе.) После правок- соответствие OCP (не зависит от других классов) и LSP (свободно расширяем через наследование.)
public abstract class User{
    private final String surname;
    private final String firstname;
    private final String patronymic;

    public User(String surname, String firstname, String patronymic) {
        this.surname = surname;
        this.firstname = firstname;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}