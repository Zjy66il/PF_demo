package main.dao;

import main.entity.User;

import java.util.ArrayList;
import java.util.List;

public interface UserDao {
    public void save(User u) throws Exception;
    public User findByEmail(String email) throws Exception;
    public User findByName(String username) throws Exception;
    public void update(User u) throws Exception;

}
