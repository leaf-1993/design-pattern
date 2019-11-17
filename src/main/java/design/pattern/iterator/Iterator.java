package design.pattern.iterator;

/**
 * @author chenxiang
 * @create 2019-11-15 0:02
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
