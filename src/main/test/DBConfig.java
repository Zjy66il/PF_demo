package main.test;

import java.io.FileInputStream;
import java.util.Properties;

public class DBConfig {
    private static Properties p =null;
    static{
        try{
            p = new Properties();
            //加载配置文件
            p.load(new FileInputStream("/src/config/props/jdbc-oracle.properties"));

        }catch(Exception e){
            e.printStackTrace();
            throw new RuntimeException("加载 properites 文件错误");
        }
    }
    public static String getValue(String key){
        return p.get(key).toString();
    }
}
