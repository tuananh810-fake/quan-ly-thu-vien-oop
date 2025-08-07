package main.java.org.example.libraryoop.model;

import java.time.LocalDateTime;

public class CallCardInfor {
    private CallCard callCard; // Thông tin thẻ mượn sách
    private Book book; // Sách được mượn
    private int numberOfLoanBook; // Số lượng sách mượn
    private LocalDateTime returnDeadline;// Ngày hết hạn trả sách
 
    /**
     * Default constructor.
     */
    public CallCardInfor() {
    }

    /**
     * Constructor with parameters.
     */
    public CallCardInfor(CallCard callCard, Book book, int numberOfLoanBook, LocalDateTime returnDeadline) {
        this.callCard = callCard;
        this.book = book;
        this.numberOfLoanBook = numberOfLoanBook;
        this.returnDeadline = returnDeadline;
    }

    /**
     * Getter and Setter.
     */
    public CallCard getCallCard() {
        return callCard;
    }

    public void setCallCard(CallCard callCard) {
        this.callCard = callCard;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDateTime getReturnDeadline() {
        return returnDeadline;
    }

    public void setReturnDeadline(LocalDateTime returnDeadline) {
        this.returnDeadline = returnDeadline;
    }

    public int getNumberOfLoanBook() {
        return numberOfLoanBook;
    }

    public void setNumberOfLoanBook(int numberOfLoanBook) {
        this.numberOfLoanBook = numberOfLoanBook;
    }
}

