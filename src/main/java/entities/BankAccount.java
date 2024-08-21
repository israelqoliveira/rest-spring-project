package entities;

import Enums.AccStatus;
import Enums.AccType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "tb_account")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "ACCNUMBER")
    private String accNumber;

    @Column(name = "AMOUNT")
    private BigDecimal amount;

    private BigDecimal initialAmount;

    @Column(name = "DATCREATION")
    private Instant datCreation;

    AccType accType;
    AccStatus accStatus;

    @Setter
    @ManyToOne
    private Client client;

    BankAccount() {
    }

    public BankAccount(long id, String accNumber, BigDecimal amount, Instant datCreation, AccType accType,
                       Client client) {
        this.id = id;
        this.accNumber = accNumber;
        this.amount = amount;
        this.datCreation = datCreation;
        this.accType = accType;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(BigDecimal initialAmount) {
        this.initialAmount = initialAmount;
    }

    public Instant getDatCreation() {
        return datCreation;
    }

    public void setDatCreation(Instant datCreation) {
        this.datCreation = datCreation;
    }

    public AccType getAccType() {
        return accType;
    }

    public void setAccType(AccType accType) {
        this.accType = accType;
    }

    public AccStatus getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(AccStatus accStatus) {
        this.accStatus = accStatus;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
