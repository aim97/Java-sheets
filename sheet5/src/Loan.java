public class Loan {
    private Book book;
    private User user;
    private String loanDate, dueDate;
    private boolean isReturned;

    public Loan(Book book, User user, String loanDate, String dueDate, boolean isReturned) {
        this.book = book;
        this.user = user;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.isReturned = isReturned;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return isReturned;
    }

    public void setReturned(boolean returned) {
        isReturned = returned;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "book=" + book +
                ", user=" + user +
                ", loanDate='" + loanDate + '\'' +
                ", dueDate='" + dueDate + '\'' +
                ", isReturned=" + isReturned +
                '}';
    }
}
