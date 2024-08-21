package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "tb_account")
public class BankAccount {

    private long id;
    private String accNumber;
    private BigDecimal amount;
    private Instant datCreation;
    private AccType accType; //ATIVO, INATIVO OU BLOQUEADO

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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public enum AccType {
        CORRENTE, POUPANCA
    }

    public enum accStatus {
        ACTIVE, INACTIVE, BLOCKED
    }
}
