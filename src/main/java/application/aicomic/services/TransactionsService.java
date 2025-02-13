package application.aicomic.services;

import application.aicomic.dataAccess.CommentsDTO;
import application.aicomic.dataAccess.TransactionsDTO;
import application.aicomic.enums.CommentsEnums;
import application.aicomic.enums.TransactionsEnums;
import application.aicomic.mapper.Mapper;
import application.aicomic.models.Comments;
import application.aicomic.models.Transactions;
import application.aicomic.repositories.TransactionsRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TransactionsService {
    private TransactionsRepository transactionsRepository;
    private Mapper mapper;
    public List<Transactions> getAllTransactions() {
        return transactionsRepository.findAll();
    }

    public Transactions getTransactionById(String id) {
        return transactionsRepository.findById(id).get();
    }

    public Transactions addTransaction(Transactions transaction) {
        return transactionsRepository.save(transaction);
    }

    public Transactions updateTransaction(String id, TransactionsDTO transactionsDTO) {
        Transactions transactions = transactionsRepository.findById(id).orElseThrow(() -> new RuntimeException("Transaction not found"));
        mapper.updateTransactions(transactions, transactionsDTO);
        return transactionsRepository.save(transactions);
    }

    public Transactions deleteTransaction(String id) {
        //productsRepository.deleteById(id);
        Optional<Transactions> transactions = transactionsRepository.findById(id);
        if (transactions.isPresent()) {
            Transactions x = transactions.get();
            x.setStatus(TransactionsEnums.NOT_PAID.getValue());
            return transactionsRepository.save(x);
        }
        return null;
    }
}
