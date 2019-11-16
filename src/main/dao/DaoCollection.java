package main.dao;

import main.dao.impl.UserDaoImpl;

public class DaoCollection {
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
