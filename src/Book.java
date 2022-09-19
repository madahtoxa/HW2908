public class Book {
    private final String bookName;
    private final Author author;
    private int bookYear;

    public Book(String bookName, Author author, int bookYear) {
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;
    }

    public String getName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }


    public int getBookYear() {
        return bookYear;
    }
    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

}
