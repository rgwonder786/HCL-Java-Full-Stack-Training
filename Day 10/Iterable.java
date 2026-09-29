import java.util.Iterator;
import java.util.Objects;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Consumer;

public interface Iterable<T> {

    /**
     * Returns an iterator over elements of type T.
     */
    Iterator<T> iterator();

    /**
     * Performs the given action for each element of the Iterable
     * until all elements have been processed or the action throws an exception.
     */
    default void forEach(Consumer<? super T> action) {
        Objects.requireNonNull(action);
        for (T t : this) {
            action.accept(t);
        }
    }

    /**
     * Creates a Spliterator over the elements described by this Iterable.
     */
    default Spliterator<T> spliterator() {
        return Spliterators.spliteratorUnknownSize(iterator(), 0);
    }
}
