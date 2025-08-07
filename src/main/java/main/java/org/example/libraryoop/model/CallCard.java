package main.java.org.example.libraryoop.model;

import java.time.LocalDateTime;

public class CallCard {
    private String idCallCard; // mã thẻ
    private Reader reader;  // người mượn sách
    private Staff staff;   // nhân viên quản lý
    private LocalDateTime bookLoanDay;  // ngày mượn sách
    
    /**
     * Constructer Default.
     */
    public CallCard() {
    }

    /**
     * Constructer with parameters.
     */
    public CallCard(String idCallCard, Reader reader, Staff staff, LocalDateTime bookLoanDay) {
        this.idCallCard = idCallCard;
        this.reader = reader;
        this.staff = staff;
        this.bookLoanDay = bookLoanDay;
    }

    /**
     * Getter and Setter
     */
    public String getIdCallCard() {
        return idCallCard;
    }

    public void setIdCallCard(String idCallCard) {
        this.idCallCard = idCallCard;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public LocalDateTime getBookLoanDay() {
        return bookLoanDay;
    }

    public void setBookLoanDay(LocalDateTime bookLoanDay) {
        this.bookLoanDay = bookLoanDay;
    }
}
