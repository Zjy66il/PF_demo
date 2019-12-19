package main.dao;

import main.entity.Admin;

public interface AdminDao {
    public Admin findByName(String root) throws Exception;
}
