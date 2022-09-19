
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Книга1","Ноунейм1");
        Author author2 = new Author("Книга2","Ноунейм2");

        Book book1 = new Book("Война и мир", author1,1999);
        Book book2 = new Book("Идиот", author2, 2000);

        System.out.println("год до сеттера - " + book1.getBookYear());
        book1.setBookYear(2022);
        System.out.println("год после сеттера - " + book1.getBookYear());

    }
}