public class Link<T> {
    private T value;
    private Link<T> next;

    public Link(T value, Link<T> next) {
        this.value = value;
        this.next = next;
    }
    public T getValue() {
        return value;
    }

    public Link<T> getNextLink() {
        return next;
    }
}
