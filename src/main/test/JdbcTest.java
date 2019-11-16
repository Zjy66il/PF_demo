package main.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    public static void main(String[] args){
        try{
            Class.forName(DBConfig.getValue("driver"));
            Connection conn = DriverManager.getConnection(DBConfig.getValue("url"), DBConfig.getValue("user"), DBConfig.getValue("password"));
            System.out.print("success");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
