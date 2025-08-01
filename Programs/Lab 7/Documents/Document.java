interface Printable {
    void print();
}

interface Showable {
    void show();
}

interface Displayable extends Printable, Showable {
}

public class Document implements Displayable {
    public void print() {
        System.out.println("Printing document...");
    }

    public void show() {
        System.out.println("Showing document on screen...");
    }
    public static void main(String[] args) {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}
