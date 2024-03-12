import java.util.Date;

public class LMS {
    public static Loan checkoutBook(User u, Book b) {
        b.setAvailabale(false);
        Loan l = new Loan(b, u, "12/03/2024", "19/03/2024", false);
        return l;
    }

    public static BookReturnReceipt returnBook(Loan l) {
        l.getBook().setAvailabale(true);
        l.setReturned(true);
        BookReturnReceipt brr = new BookReturnReceipt(l, "15/03/2024");
        return brr;
    }
}
