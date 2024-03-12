public class Book {
    private String title, isbn, author;
    private boolean isAvailabale;


    public Book(String title, String isbn, String author, boolean isAvailabale) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.isAvailabale = isAvailabale;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailabale() {
        return isAvailabale;
    }

    public void setAvailabale(boolean availabale) {
        isAvailabale = availabale;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author='" + author + '\'' +
                ", isAvailabale=" + isAvailabale +
                '}';
    }
}
