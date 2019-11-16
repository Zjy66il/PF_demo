package main.dao.impl;

import main.dao.UserDao;
import main.entity.User;
import main.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {
    //private static final String INSERT = "";
    //private static final String FINDBYEMAIL = "";
    private static final String FINDBYNAME = "select * from t_user where username=?";
    //private static final String UPDATE = "";


    @Override
    public void save(User u) throws Exception {

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
                    if (is_verify==1) {
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
