package main.java.com.example;

import java.sql.SQLException;
import java.util.logging.Logger;

public class App {

    private final Logger logger = Logger.getLogger(getClass().getName());

    public static void main(String[] args) throws SQLException {
        new App().run();
    }

    public void run() throws SQLException {
        Calculator calc = new Calculator();
        logger.info(String.valueOf(calc.calculate(10, 5, "add-again")));
        UserService service = new UserService();
        service.findUser("admin");
        service.deleteUser("admin"); // NEW dangerous call
    }
}

