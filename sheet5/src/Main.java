public class Main {
    public static void main(String[] args) {
        Book b = new Book(
            "Your Suffering is just getting started",
            "CSE120-B101",
            "Anonymous Java Instructor",
            true
        );

        User student = new User(
            "Mahmoud Hisham",
            "10112454",
            "Mohamoud10112454@feng.bu.edu.eg"
        );

        Loan l = LMS.checkoutBook(student, b);

        System.out.println(l);

        BookReturnReceipt r = LMS.returnBook(l);

        System.out.println(r);
    }
}