package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("Igor", "Astashkin", (byte) 32);
        userDaoJDBC.saveUser("Sema", "Astashkin", (byte) 24);
        userDaoJDBC.saveUser("Anna", "Astashkina", (byte) 50);
        userDaoJDBC.saveUser("Sergey", "Astashkin", (byte) 54);
        userDaoJDBC.getAllUsers().forEach(System.out::println);
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}
