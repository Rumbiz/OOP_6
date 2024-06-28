package OOP5.Service;
// S- только операции с пользователями. . OCP : легко расширяется через наследование без изменения самого класса. LSP: заменяем подклассами. I - неприменим, используется общий интерфейс. 
import OOP5.Model.User;
import java.util.List;
import java.util.ArrayList;

public class UserService {
    protected List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(users);
    }
}