package main.dao.impl;

import main.action.cart.CartItem;
import main.action.cart.CartService;
import main.dao.OrderDao;
import main.entity.Item;
import main.entity.Order;
import main.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImpl implements OrderDao {

    //订单信息保存
    private final static String SAVE_ORDER = "insert into t_order(username,stauts,order_time,order_desc,total_price,receive_name,full_address,postal_code,mobile) values(?,?,?,?,?,?,?,?,?)";
    private final static String SAVE_ITEM = "insert into t_item(order_id,product_id,product_name,discount_price,product_num) values(?,?,?,?,?)";

    //查询该user下的订单信息
    private final static String FIND_ORDER_INF = "select p.*,b.* from t_order p join t_item b on p.id=b.order_id where p.username=?";

/*    //根据订单状态查询订单信息
    private final static String FIND_BY_ID = "select * from t_receive_address where id=?";*/


    /**
     * 新增订单
     * @return 书籍类型id
     * @throws Exception
     */
    @Override
    public List<Item> findOrderInfo(String username) throws Exception {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        List<Item> items = new ArrayList<Item>();

        try {
            conn = DBConnection.getConnection();
            prep = conn.prepareStatement(FIND_ORDER_INF);
            prep.setString(1,username);
            rs = prep.executeQuery();

            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt("id"));
                item.setUsername(rs.getString("username"));
                item.setStatus(rs.getInt("stauts"));
                item.setOrder_time(rs.getLong("order_time"));
                item.setOrder_desc(rs.getString("order_desc"));
                item.setTotal_price(rs.getDouble("total_price"));
                item.setReceive_name(rs.getString("receive_name"));
                item.setFull_address(rs.getString("full_address"));
                item.setPostal_code(rs.getString("postal_code"));
                item.setMobile(rs.getString("mobile"));
                item.setProduct_id(rs.getInt("product_id"));
                item.setProduct_name(rs.getString("product_name"));
                item.setDiscount_price(rs.getDouble("discount_price"));
                item.setProduct_num(rs.getInt("product_num"));

                items.add(item);
            }
        } finally {
            DBConnection.close(rs, prep, conn);
        }
        return items;
    }

    /**
     * 新增订单
     * @return 书籍类型id
     * @throws Exception
     */
    @Override
    public void save(Order order, CartService cart) throws Exception {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        try {
            //插入order表
            conn = DBConnection.getConnection();
            prep = conn.prepareStatement(SAVE_ORDER, new String[]{"id"});
            prep.setString(1, order.getUsername());
            prep.setInt(2, order.getStatus());
            prep.setLong(3, order.getOrder_time());
            prep.setString(4, order.getOrder_desc());
            prep.setDouble(5, order.getTotal_price());
            prep.setString(6, order.getReceive_name());
            prep.setString(7, order.getFull_address());
            prep.setString(8, order.getPostal_code());
            prep.setString(9, order.getMobile());
            prep.executeUpdate();

            //获取当前订单id
            rs = prep.getGeneratedKeys();
            int id = 0;
            if(rs.next()){
                id = rs.getInt(1);
            }

            //插入Item表
            List<CartItem> pro = cart.getItems();
            for (int i=0;i<pro.size();i++){
                CartItem ci = pro.get(i);

                prep = conn.prepareStatement(SAVE_ITEM);
                prep.setInt(1, id);
                prep.setInt(2, ci.getPro().getId());
                prep.setString(3, ci.getPro().getBook_name());
                prep.setDouble(4, ci.getPro().getDiscount_price());
                prep.setInt(5, ci.getNum());
                prep.executeUpdate();
            }

        } finally {
            DBConnection.close(rs, prep, conn);
        }




    }
}
