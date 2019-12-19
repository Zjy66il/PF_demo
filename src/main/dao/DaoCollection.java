package main.dao;

import main.dao.impl.*;

public class DaoCollection {
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

    public static ProductDao getProductDAO() { return new BookDaoImpl(); }

    public static OrderDao getOrderDAO() {
        return new OrderDaoImpl();
    }

    public static ReceiveAddressDao getReceiveAddressDAO() {
        return new ReceiveAddressDaoImpl();
    }

    public static AdminDao getAdminDAO(){return new AdminDaoImpl(); }
}
