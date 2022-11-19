import java.util.Iterator;

public class main {
    public static void main(String[] args) {
        Link<Integer> list = new Link<>(3, new Link<>(2, new Link<>(1, null)));
        Iterator<Integer> iterator = new LinkIterator<>(list);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
