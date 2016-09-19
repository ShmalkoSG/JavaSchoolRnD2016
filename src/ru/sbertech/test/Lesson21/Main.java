package ru.sbertech.test.Lesson21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Student on 19.09.2016.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test)","sa","")){
            Statement statement=conn.createStatement();
            statement.execute("select * from songs");
    }
        System.out.println("ok");
}}
