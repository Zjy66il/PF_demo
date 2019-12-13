package main.dao.impl;

import main.dao.ReceiveAddressDao;
import main.entity.ReceiveAddress;
import main.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ReceiveAddressDaoImpl implements ReceiveAddressDao {

    //地址保存
    private final static String SAVE = "insert into t_receive_address(username,receive_name,full_address,postal_code,mobile) values(?,?,?,?,?)";

    //查询该user下保存的地址信息
    private final static String FIND_BY_USER_NAME = "select * from t_receive_address where username=?";

    //根据地址id查询地址信息
    private final static String FIND_BY_ID = "select * from t_receive_address where id=?";


    @Override
    public void save(ReceiveAddress addr) throws Exception {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.getConnection();
            prep = conn.prepareStatement(SAVE);
            prep.setString(1, addr.getUsername());
            prep.setString(2, addr.getReceive_name());
            prep.setString(3, addr.getFull_address());
            prep.setString(4, addr.getPostal_code());
            prep.setString(5, addr.getMobile());

            prep.executeUpdate();

        } finally {
            DBConnection.close(rs, prep, conn);
        }
    }

    @Override
    public List<ReceiveAddress> findByUserName(String username) throws Exception {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        List<ReceiveAddress> addrs = null;
        try {
            conn = DBConnection.getConnection();
            prep = conn.prepareStatement(FIND_BY_USER_NAME);
            prep.setString(1,username);

            while (rs.next()) {
                ReceiveAddress addr = new ReceiveAddress();
                addr.setId(rs.getInt("id"));
                addr.setFull_address(rs.getString("full_address"));
                addr.setMobile(rs.getString("mobile"));
                addr.setPostal_code(rs.getString("postal_code"));
                addr.setReceive_name(rs.getString("receive_name"));
                addr.setUsername(rs.getString("username"));

                addrs.add(addr);
            }

        } finally {
            DBConnection.close(rs, prep, conn);
        }
        return addrs;
    }

    @Override
    public ReceiveAddress findById(int id) throws Exception {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        ReceiveAddress addr = null;
        try {
            conn = DBConnection.getConnection();
            prep = conn.prepareStatement(FIND_BY_ID);
            prep.setInt(1, id);
            rs = prep.executeQuery();

            while (rs.next()) {
                addr = new ReceiveAddress();
                addr.setId(rs.getInt("id"));
                addr.setUsername(rs.getString("username"));
                addr.setFull_address(rs.getString("full_address"));
                addr.setMobile(rs.getString("mobile"));
                addr.setPostal_code(rs.getString("postal_code"));
                addr.setReceive_name(rs.getString("receive_name"));

            }

        } finally {
            DBConnection.close(rs, prep, conn);
        }
        return addr;
    }
}
