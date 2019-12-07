package main.action.main;

import main.action.BaseAction;
import main.dao.DaoCollection;
import main.dao.ProductDao;
import main.entity.Book;

import java.util.ArrayList;
import java.util.List;

public class ShowAction extends BaseAction {

    private List<Book> books=new ArrayList<Book>();

    public String execute() throws Exception{
        ProductDao pDao = DaoCollection.getProductDAO();
        books = pDao.findByAll();

        return "show";
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
