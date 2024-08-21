package entities;

import Enums.TransactionStatus;
import Enums.TransactionType;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "tb_transaction")
public class Transaction {

    TransactionType transactionType;
    TransactionStatus transactionStatus;

    private long id;
    private BigDecimal amount;
    private Instant createdAt;


}
