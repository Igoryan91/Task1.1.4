package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Igor", "Astashkin", (byte) 32);
        userService.saveUser("Sergey", "Astashkin", (byte) 54);
        userService.saveUser("Semen", "Astashkin", (byte) 24);
        userService.saveUser("Denis", "Astashkin", (byte) 40);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.shutdown();
    }
}
