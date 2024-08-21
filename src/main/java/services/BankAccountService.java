package services;

import entities.BankAccount;
import entities.Client;
import org.springframework.stereotype.Service;
import repository.BankAccountRepository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class BankAccountService {

    private BankAccount bankAccount;
    private Client client;
    private BankAccountRepository repository;

    public List<BankAccount> findAll(){
        return repository.findAll();
    }

    public BankAccount findById(long id) {
        Optional <BankAccount> obj = repository.findById(id);
        return obj.get();
    }

   public BigDecimal balance() {
     return bankAccount.getInitialAmount();
   }

   public BigDecimal deposit() {
        return deposit();
   }
}
