//: c04:DeathCondition.java
// Using finalize() to detect an object that
// hasn't been properly cleaned up.

class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() {
        if (checkedOut)
            System.out.println("Error: checked out");
    }
}

public class DeathCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Proper cleanup:
        novel.checkIn();
        // Drop the reference, forget to clean up:
        new Book(true);
        //new Book(true);
        //new Book(true);
        //new Book(false);
        // Force garbage collection & finalization:
        System.gc();
    }
} // /:~
