package design.pattern.iterator;

/**
 * @author chenxiang
 * @create 2019-11-15 0:02
 */
public class BookShelfListIterator implements Iterator<Book>{
    private BookShelfList bookShelf;
    private int index;

    public BookShelfListIterator(BookShelfList bookShelf) {
        this.bookShelf = bookShelf;
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
