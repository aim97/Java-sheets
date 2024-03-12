public class BookReturnReceipt {
    private Loan loan;
    private String returnDate;

    public BookReturnReceipt(Loan loan, String returnDate) {
        this.loan = loan;
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookReturned{\n" +
                "\tBook= " + loan.getBook().getTitle() + "\n"+
                "\tBorrowedBy= " + loan.getUser().getName() + "\n" +
                "\tReturnDate='" + returnDate + "\n" +
                '}';
    }
}
