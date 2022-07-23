package org.example.service;


import org.example.dao.UserDao;
import org.example.dao.UserDaoJdbcImpl;
import org.example.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDaoJdbc;

    public UserServiceImpl() throws SQLException {
        userDaoJdbc = new UserDaoJdbcImpl();

    }

    public void createUsersTable() {
        userDaoJdbc.createUsersTable();


    }

    public void dropUsersTable() {
        userDaoJdbc.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoJdbc.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoJdbc.removeUserById(id);

    }

    public List<User> getAllUsers() {
        return userDaoJdbc.getAllUsers();

    }

    public void cleanUsersTable() {
        userDaoJdbc.cleanUsersTable();
    }

    public boolean existsByFirstName(String firstName) {
        // eger databasede parametrine kelgen firstnamege okshosh adam bar bolso
        // anda true kaitarsyn
        // jok bolso anda false kaitarsyn.
        return userDaoJdbc.existsByFirstName(firstName);

    }
}
