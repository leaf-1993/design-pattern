package design.pattern.iterator;

/**
 * @author chenxiang
 * @create 2019-11-15 0:02
 */
public class BookShelfIterator implements Iterator<Book>{
    private BookShelf bookShelf;
    private int index;

    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return bookShelf.getLength()>index;
    }

    @Override
    public Book next() {
        Book r = bookShelf.getBookAt(index);
        index++;
        return r;
    }
}
