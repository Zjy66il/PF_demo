package main.dao.impl;

import main.dao.ProductDao;
import main.entity.Book;
import main.entity.Product;
import main.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements ProductDao {

    private final static String FIND_ALL = "select p.*,b.* from t_product p join t_book b on p.id=b.id";
    private final static String FIND_BY_ID = "select p.*,b.* from t_product p join t_book b on p.id=b.id where p.id=?";

    @Override
    public Product findById(int id) throws Exception {
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;
        Book book = null;
        try {
            prep = DBConnection.getConnection().prepareStatement(FIND_BY_ID);
            prep.setInt(1, id);
            rs = prep.executeQuery();
            if (rs.next()) {
                book = new Book();
                book.setId(rs.getInt("id"));
                book.setBook_name(rs.getString("book_name"));
                book.setFixed_price(rs.getDouble("fixed_price"));
                book.setDiscount_price(rs.getDouble("discount_price"));
                book.setBook_pic(rs.getString("book_pic"));
                book.setAdd_time(rs.getLong("add_time"));
                book.setAuthor(rs.getString("author"));
                book.setPublishing(rs.getString("publishing"));
                book.setPublish_time(rs.getLong("publish_time"));
                book.setCatalogue(rs.getString("catalogue"));
                book.setDescription(rs.getString("description"));
                book.setHas_deleted(rs.getInt("has_deleted"));
                book.setIsbn(rs.getString("isbn"));
                book.setPrint_time(rs.getLong("print_time"));
                book.setPublishing(rs.getString("publishing"));
                book.setTotal_page(rs.getString("total_page"));
                book.setWhich_edtion(rs.getString("which_edtion"));
                book.setWord_number(rs.getString("word_number"));
            }
        } finally {
            DBConnection.close(rs, prep, conn);
        }
        return book;
    }

    @Override
    public List<Book> findByAll() throws Exception {
        List<Book> pros = new ArrayList<Book>();
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet rs = null;

        try {
            prep = DBConnection.getConnection().prepareStatement(FIND_ALL);
            rs = prep.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                book.setId(rs.getInt("id"));
                book.setBook_name(rs.getString("book_name"));
                book.setFixed_price(rs.getDouble("fixed_price"));
                book.setDiscount_price(rs.getDouble("discount_price"));
                book.setBook_pic(rs.getString("book_pic"));
                book.setAdd_time(rs.getLong("add_time"));
                book.setAuthor(rs.getString("author"));
                book.setPublishing(rs.getString("publishing"));
                book.setPublish_time(rs.getLong("publish_time"));
                book.setCatalogue(rs.getString("catalogue"));
                book.setDescription(rs.getString("description"));
                book.setHas_deleted(rs.getInt("has_deleted"));
                book.setIsbn(rs.getString("isbn"));
                book.setPrint_time(rs.getLong("print_time"));
                book.setPublishing(rs.getString("publishing"));
                book.setTotal_page(rs.getString("total_page"));
                book.setWhich_edtion(rs.getString("which_edtion"));
                book.setWord_number(rs.getString("word_number"));

                pros.add(book);
            }
        } finally {
            DBConnection.close(rs, prep, conn);
        }
        return pros;
    }
}
