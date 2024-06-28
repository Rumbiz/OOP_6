package OOP5.View;

import OOP5.Model.User;
import java.util.List;

public interface UserView<T extends User> {
	public void sendOnConsole(List<T> list);
}
