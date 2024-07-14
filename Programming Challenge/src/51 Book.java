class Book {
    // Instance Variables
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    // Static Variable
    static {
        totalNoOfBooks=0;
    }

    { // This is an Object
        totalNoOfBooks++; // Increment totalBooks when a new book is created
    }

    //Creating a Constructor
    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }

    // Constructor with only ISBN, setting title and author to "Unknown"
    public Book(String isbn) {
        this(isbn,"Unknown", "Unknown");
    }

    // Instance Method to borrow a book
    public void borrowBook(){
        if(isBorrowed){
            System.out.println("Sorry, \"" + title + "\" by " + author + " is already borrowed.");
        } else {
            this.isBorrowed=true;
            System.out.println("You have borrowed \"" + title + "\" by " + author);
        }
    }

    // Instance Method to return a book
    public void returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println("You have returned \"" + title + "\" by " + author);
        } else {
            System.out.println("This book is all ready in the Library");
        }
    }


    // Static Method to get the total number of books
    public static int totalBooks() {
        return totalNoOfBooks;
    }

    // Getters for instance variables
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }


    // Main method
    public static void main(String[] args) {
        // Creating book instances
        Book book1=new Book("121","The Great Gatsby","F. Scott Fitzgerald");
        Book book2=new Book("321","The Legend","Rohit Kr shah");
        Book book3=new Book("322","Art of Giving","Auchata Samanta");

        // Displaying total number of books
        System.out.println("Total books in the library: " + Book.totalNoOfBooks);

        // Borrowing and returning books
        book1.borrowBook();
        book1.returnBook();
        book2.borrowBook();
        book1.returnBook(); // Trying to return an already returned book
        book2.borrowBook(); // Trying to borrow an already borrowed book

        System.out.println();

        // Displaying details of the book with only ISBN
        System.out.println("Book with only ISBN:");
        System.out.println("Title: " + book3.getTitle());
        System.out.println("Author: " + book3.getAuthor());
        System.out.println("ISBN: " + book3.getIsbn());

    }
}

