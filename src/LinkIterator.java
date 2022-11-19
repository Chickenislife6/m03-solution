import java.util.ArrayList;
import java.util.Iterator;

public class LinkIterator<T> implements Iterator<T> {
    private ArrayList<T> values;
    private Iterator<T> i;

    public LinkIterator(Link<T> list) {
        values = new ArrayList<>();
        while (list.getValue() != null) {
            values.add(list.getValue());
            list = list.getNextLink();
            if (list == null) {
                break;
            }
        }
        i = values.iterator();
    }

    public T next() {
        return i.next();
    }

    public boolean hasNext() {
        return i.hasNext();
    }
}
