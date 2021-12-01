package web.dao;

import web.model.User;

public interface UserDao {
    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);
}
