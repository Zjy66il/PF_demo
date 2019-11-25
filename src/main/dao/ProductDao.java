package main.dao;

import main.entity.Book;
import main.entity.Product;

import java.sql.SQLException;
import java.util.List;

public interface ProductDao {

    public List<Book> findById() throws Exception;
}
