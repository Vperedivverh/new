package vesna.dao;

import org.springframework.stereotype.Component;
import vesna.models.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserDAOImpl implements UserDAO {
    private static int COUNT;
    List<User> users;

    {
        users = new ArrayList<>();
        users.add(new User(++COUNT, "Vasya"));
        users.add(new User(++COUNT, "Petro"));
        users.add(new User(++COUNT, "Marja"));
        users.add(new User(++COUNT, "&^%^^YRFUYV"));
    }

    public List<User> index() {
        return users;
    }

    public User show(int id) {
        return users.stream().filter(user -> user.getId() == id).findAny().orElse(null);
    }
}
