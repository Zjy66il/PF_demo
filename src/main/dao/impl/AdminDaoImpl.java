package main.dao.impl;

import main.dao.AdminDao;
import main.entity.Admin;
import main.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDaoImpl implements AdminDao {
    private static final String FINDBYNAME = "select * from t_admin where root=?";

    public Admin findByName(String root) throws Exception {
        PreparedStatement prep = null;
        Connection conn = null;
        Admin u = null;
        try {
            conn = DBConnection.getConnection();
            prep = conn.prepareStatement(FINDBYNAME);//预编译类PreparedStatement
            prep.setString(1, root);
            ResultSet rst = prep.executeQuery();
            if (rst.next()) {
                u = new Admin();
                u.setRoot(rst.getString("root"));
                u.setPassword(rst.getString("password"));

            }

        }finally {
            DBConnection.close(prep, conn);
        }return u;
    }
}
