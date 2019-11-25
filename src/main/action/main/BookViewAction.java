package main.action.main;

import main.action.BaseAction;
import main.dao.DaoCollection;
import main.dao.ProductDao;
import main.entity.Book;

public class BookViewAction extends BaseAction{
    private Book book;
    private int id;

    public String execute() throws Exception{
        //通过dao获取书本信息
        ProductDao pDao = DaoCollection.getProductDAO();
        //book = (Book) pDao.findById(id);
        return "bookview";
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

}
