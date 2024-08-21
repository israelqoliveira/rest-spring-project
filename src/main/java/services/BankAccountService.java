package services;

import entities.BankAccount;
import org.springframework.stereotype.Service;
import repository.BankAccountRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BankAccountService {

    private BankAccountRepository repository;

    public List<BankAccount> findAll(){
        return repository.findAll();
    }

    public BankAccount findById(long id) {
        Optional <BankAccount> obj = repository.findById(id);
        return obj.get();
    }

}
