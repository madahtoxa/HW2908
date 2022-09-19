import java.util.Objects;

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
    @Override
    public int hashCode() {
        return Objects.hash(bookName, author,bookYear);
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj==null||getClass()!= obj.getClass()) return false;
        Book book = (Book) obj;
        return bookYear == book.bookYear&&Objects.equals(bookName,book.bookName)&&Objects.equals(author,book.author);
    }
    @Override
    public String toString(){
        return "Книга "+this.bookName+", автор " + this.author+", год выпуска "+this.bookYear;
    }
}
