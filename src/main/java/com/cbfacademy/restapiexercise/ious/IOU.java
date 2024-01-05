package com.cbfacademy.restapiexercise.ious;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class IOU {

    private final UUID id;
    private String borrower;
    private String lender;
    private BigDecimal amount;
    private Instant dateTime;
    

    public IOU(String borrower, String lender, BigDecimal amount, Instant dateTime) {

        this.borrower = borrower;
        this.lender = lender;
        this.amount = amount;
        this.dateTime = dateTime;
        this.id = UUID.randomUUID();

    }
        
    public UUID getId() {
        return id;
        }

        //getter
        public String getBorrower() {
            return borrower;
        }

        //setter
        public void setBorrower(String newBorrower) {
            this.borrower = newBorrower;
        }

        //Getter
        public String getLender() {
            return lender;
        }

        //setter
        public void setLender(String newLender) {
            this.lender = newLender;
        }

        //getter
        public BigDecimal getAmount() {
            return amount;
        }

        //setter
        public void setAmount(BigDecimal newAmount) {
            this.amount = newAmount;
        }

        //getter 
        public Instant getDateTime() {
            return dateTime;
        }

        //setter
        public void setDateTime (Instant newDateTime) {
            this.dateTime = newDateTime; 
        }
    
}

// Inside the ious package, create an IOU entity class with the following members:

// final UUID id - unique identifier for the IOU
// String borrower - name of borrower
// String lender - name of lender
// BigDecimal amount - amount covered by IOU
// Instant dateTime - date and time of IOU being issued

// public IOU(String borrower, String lender, BigDecimal amount, Instant datetime) - constructor that should generate a new UUID, use  the documentation to learn how to generate a random value.

// Set the appropriate accessibility modifiers for all members and add appropriate property getters and setters.