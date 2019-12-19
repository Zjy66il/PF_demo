package main.dao.impl;

import main.dao.UserDao;
import main.entity.User;
import main.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    private static final String INSERT = "insert into t_user(username,password,phone)values(?,?,?)";
    //private static final String FINDBYEMAIL = "";
    private static final String FINDBYNAME = "select * from t_user where username=?";
    //private static final String UPDATE = "";

    //数据库中加入新用户
    @Override
    public void save(User u) throws Exception {
        PreparedStatement prep = null;
        Connection conn = null;
        try {
            conn = DBConnection.getConnection();
            prep = conn.prepareStatement(INSERT);
            prep.setString(1, u.getUsername());
            prep.setString(2, u.getPassword());
            prep.setString(3,u.getPhone());

            prep.executeUpdate();
        } finally {
            DBConnection.close(prep, conn);
        }
    }

    @Override
    public User findByEmail(String email) throws Exception {
        return null;
    }

    //在数据库内搜索用户名
    @Override
    public User findByName(String username) throws Exception {
        PreparedStatement prep = null;
        Connection conn = null;
        User u = null;
        try {
            conn = DBConnection.getConnection();
            prep = conn.prepareStatement(FINDBYNAME);//预编译类PreparedStatement
            prep.setString(1, username);
            ResultSet rst = prep.executeQuery();
            if (rst.next()) {
                u = new User();
                u.setUsername(rst.getString("username"));
                u.setPassword(rst.getString("password"));

                int is_verify = rst.getInt("state");
                if (is_verify == 1) {
                    u.setState(true);
                } else {
                    u.setState(false);
                }

            }

        } finally {
            DBConnection.close(prep, conn);
        }
        return u;
    }

    @Override
    public void update(User u) throws Exception {

    }

}
