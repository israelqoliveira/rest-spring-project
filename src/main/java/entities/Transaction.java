package entities;

import java.math.BigDecimal;
import java.time.Instant;

public class Transaction {

    private long id;
    private TransactionType transactionType;
    private TransactionStatus transactionStatus;
    private BigDecimal amount;
    private Instant createdAt;


    public enum TransactionType {
        DEPOSIT, WITHDRAW, TRANSFER
    }

    public enum TransactionStatus {
        COMPLETE, PENDING, FAILED
    }
}
