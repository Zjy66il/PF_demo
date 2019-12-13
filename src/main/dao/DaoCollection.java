package main.dao;

import main.dao.impl.BookDaoImpl;
import main.dao.impl.OrderDaoImpl;
import main.dao.impl.ReceiveAddressDaoImpl;
import main.dao.impl.UserDaoImpl;

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
}
