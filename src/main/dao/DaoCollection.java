package main.dao;

import main.dao.impl.BookDaoImpl;
import main.dao.impl.UserDaoImpl;

public class DaoCollection {
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

    public static ProductDao getProductDAO() { return new BookDaoImpl(); }
}
