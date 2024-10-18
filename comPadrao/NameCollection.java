public class NameCollection implements Collection<String> {
    private String[] names = {"Alice", "Bob", "Charlie", "Diana"};

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator(names);
    }
}