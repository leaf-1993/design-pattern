package design.pattern.iterator;

/**
 * @author chenxiang
 * @create 2019-11-15 0:02
 */
public class BookShelf implements Aggregate{
    private Book[] books;

    private int last = 0;

//    private BookShelfIterator iterator;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
//        this.iterator = new BookShelfIterator(this);
    }

    @Override
    public Iterator iterator() {
//        return iterator;
        return new BookShelfIterator(this);
    }

    public Book getBookAt(int index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    public int getLength(){
        return books.length;
    }
}
