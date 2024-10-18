public class NameIterator implements Iterator<String> {
    private String[] names;
    private int position;

    public NameIterator(String[] names) {
        this.names = names;
    }

    @Override
    public boolean hasNext() {
        return position < names.length;
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return names[position++];
        }
        return null;
    }
}