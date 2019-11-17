package iterator;

import design.pattern.iterator.Book;
import design.pattern.iterator.BookShelf;
import design.pattern.iterator.BookShelfList;
import design.pattern.iterator.Iterator;
import org.junit.Test;

/**
 * @author chenxiang
 * @create 2019-11-17 20:14
 */
public class IteratorTest {
    @Test
    public void testBookShelfByArray(){
        BookShelf shelf = new BookShelf(4);
        shelf.appendBook(new Book("1"));
        shelf.appendBook(new Book("2"));
        shelf.appendBook(new Book("3"));
        shelf.appendBook(new Book("4"));
//        while (shelf.iterator().hasNext()){
//            System.out.println(shelf.iterator().next());
//        }
        Iterator<Book> iterator = shelf.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().getName());
        }
    }

    @Test
    public void testBookShelfByList(){
        BookShelfList bookShelfList = new BookShelfList();
        for(int i=0;i<100;i++){
            bookShelfList.appendBook(new Book(String.valueOf(i+1)));
        }
        Iterator<Book> it = bookShelfList.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getName());
        }
    }
}
