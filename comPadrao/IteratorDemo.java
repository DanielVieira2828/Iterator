public class IteratorDemo {
    public static void main(String[] args) {
        NameCollection nameCollection = new NameCollection();
        Iterator<String> iterator = nameCollection.createIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println("Name: " + name);
        }
    }
}