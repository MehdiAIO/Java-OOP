public class Main {
    // Aggregation = Represents a "has-a" relationship between objects.
    //               One Object contains another objects as part of its structure,
    //               but the contained object/s can exist independently.
    public static void main(String[] args) {
        Book book1 = new Book("Surrounded by idiots", 170);
        Book book2 = new Book("the law of power", 300);
        Book book3 = new Book("this is marketing", 237);

        Book[] books = {book1,book2,book3};

        Library library = new Library("Rabat National Library", 1917,books);

        library.getDetails();
    }
}
