public class Reader {
    private String name;
    private int readerId;

    public Reader(String name, int readerId) {
        this.name = name;
        this.readerId = readerId;
    }

    // Getters for encapsulation
    public String getName() {
        return name;
    }

    public int getReaderId() {
        return readerId;
    }
}
