package design.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenxiang
 * @create 2019-11-17 20:08
 */
public class BookShelfList implements Aggregate{
    private List<Book> books;
    @Override
    public Iterator iterator() {
        return new BookShelfListIterator(this);
    }

    public BookShelfList(){
        books = new ArrayList<>();
    }

    public Book getBookAt(int index){
        return books.get(index);
    }

    public void appendBook(Book book){
        books.add(book);
    }

    public int getLength(){
        return books.size();
    }



}
