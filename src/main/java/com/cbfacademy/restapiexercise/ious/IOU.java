package com.cbfacademy.restapiexercise.ious;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public class IOU {

    final UUID id = UUID.randomUUID();

    String borrower;
    String lender;
    BigDecimal amount;
    Instant dateTime;
    

    public String iou(String borrower, String lender, BigDecimal amount, Instant dateTime) {
        // generate unique UUID id
        return id.toString();
        System.out.println(id.toString());
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