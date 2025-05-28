public class Library {
    String name;
    int year;
    Book[] books;

    Library(String name,int year,Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void getDetails(){
        System.out.println("The "+this.year+" "+this.name);
        System.out.println("Available books :");
        for(Book book : books){
            System.out.println(book.getInfo());
        }
    }
}
