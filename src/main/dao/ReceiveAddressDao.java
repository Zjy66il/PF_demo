package main.dao;

import main.entity.ReceiveAddress;

import java.util.List;

public interface ReceiveAddressDao {
    /**
     *保存用户地址
     */
    public void save(ReceiveAddress addr) throws Exception;

    public List<ReceiveAddress> findByUserName(String username) throws Exception;

    public ReceiveAddress findById(int id) throws Exception;
}
