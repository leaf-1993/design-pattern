package design.pattern.iterator;

/**
 * @author chenxiang
 * @create 2019-11-17 11:46
 */
public class Main {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(4);
        shelf.appendBook(new Book("1"));
        shelf.appendBook(new Book("2"));
        shelf.appendBook(new Book("3"));
        shelf.appendBook(new Book("4"));
//        while (shelf.iterator().hasNext()){
//            System.out.println(shelf.iterator().next());
//        }
        Iterator iterator = shelf.iterator();
        while(iterator.hasNext()){
            System.out.println(((Book)iterator.next()).getName());
        }
    }
}
